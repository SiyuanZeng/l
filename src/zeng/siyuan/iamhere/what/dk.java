package zeng.siyuan.iamhere.what;

import org.unix4j.Unix4j;
import org.unix4j.builder.Unix4jCommandBuilder;

import java.io.File;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

public class dk{
// yes i am big and bad and everything ahnd that it is all
    // everything is giveing you something, somethign give you nightmare and somethign give you sepepelkd like excueetieroservivewe
    // i have eto compe up somethiing that will kil somebosyd
    private static final File   POISONPILL  = new File("");

    private static class RunnableDirSearch implements Runnable {
        private final BlockingQueue<File>   dirQueue;
        private final BlockingQueue<File>   fileQueue;
        private final AtomicLong            count;
        private final int                   num;

        public RunnableDirSearch(final BlockingQueue<File> dirQueue, final BlockingQueue<File> fileQueue, final AtomicLong count, final int num) {
            this.dirQueue = dirQueue;
            this.fileQueue = fileQueue;
            this.count = count;
            this.num = num;
        }

        @Override
        public void run() {
            try {
                File dir = dirQueue.take();
                while (dir != POISONPILL) {
                    final File[] fi = dir.listFiles();
                    if (fi != null) {
                        for (final File element : fi) {
                            if (element.isDirectory()) {
                                count.incrementAndGet();
                                dirQueue.put(element);
                            } else {
                                fileQueue.put(element);
                            }
                        }
                    }
                    final long c = count.decrementAndGet();
                    if (c == 0) {
                        end();
                    }
                    dir = dirQueue.take();
                }
            } catch (final InterruptedException ie) {
                // file found or error
            }
        }

        private final void end() {
            try {
                fileQueue.put(POISONPILL);
            } catch (final InterruptedException e) {
                // empty
            }
            for (int i = 0; i < num; i++) {
                try {
                    dirQueue.put(POISONPILL);
                } catch (final InterruptedException e) {
                    // empty
                }
            }
        }
    }

    private static class CallableFileSearch implements Callable<File> {
        private final BlockingQueue<File>   dirQueue;
        private final BlockingQueue<File>   fileQueue;
        private final String                name;
        private final int                   num;

        public CallableFileSearch(final BlockingQueue<File> dirQueue, final BlockingQueue<File> fileQueue, final String name, final int num) {
            this.dirQueue = dirQueue;
            this.fileQueue = fileQueue;
            this.name = name;
            this.num = num;
        }

        @Override
        public File call() throws Exception {
            File file = fileQueue.take();
            while (file != POISONPILL) {
                final String filename = file.getName().toLowerCase();
                final String lf = name.toLowerCase();
                if (filename.equalsIgnoreCase(name) || filename.startsWith(lf) || filename.endsWith(lf) || filename.contains(lf)) {
                    System.out.println(filename);
                    end();
                    return file;
                }
                file = fileQueue.take();
            }
            return null;
        }

        private final void end() {
            for (int i = 0; i < num; i++) {
                try {
                    dirQueue.put(POISONPILL);
                } catch (final InterruptedException e) {
                    // empty
                }
            }
        }
    }

    private final String        filename;
    private final File          baseDir;
    private final int           concurrency;
    private final AtomicLong    count;

    public dk(final String filename, final File baseDir, final int concurrency) {
        this.filename = filename;
        this.baseDir = baseDir;
        this.concurrency = concurrency;
        count = new AtomicLong(0);
    }

    public File find() {
        final ExecutorService ex = Executors.newFixedThreadPool(concurrency + 1);
        final BlockingQueue<File> dirQueue = new LinkedBlockingQueue<File>();
        final BlockingQueue<File> fileQueue = new LinkedBlockingQueue<File>(10000);
        for (int i = 0; i < concurrency; i++) {
            ex.submit(new RunnableDirSearch(dirQueue, fileQueue, count, concurrency));
        }
        count.incrementAndGet();
        dirQueue.add(baseDir);
        final Future<File> c = ex.submit(new CallableFileSearch(dirQueue, fileQueue, filename, concurrency));
        try {
            final File f = c.get();
            return f;
        } catch (final Exception e) {
            return null;
        } finally {
            ex.shutdownNow();
        }
    }

    public static void main(final String[] args) {
        final String filename = "friends";
        final File baseDir = new File("C:\\Users\\SiyuanZeng's\\Videos");
        final dk ff = new dk(filename, baseDir, 6);
        final long ini = System.currentTimeMillis();
        final File f = ff.find();
        final long end = System.currentTimeMillis();
        System.out.println(f + " " + (end - ini) + " ms");



        Unix4jCommandBuilder unix4j = Unix4j.builder();
        List<String> testClasses = unix4j.find("C:/Users/SiyuanZeng's/Videos/Friends", "*Friends*").toStringList();
        for(String path: testClasses){
            System.out.println(path);
        }
    }
    public static void mains(String a, String b) {
//        final String filename = "friends";
//        final File baseDir = new File("C:\\Users\\SiyuanZeng's\\Videos\\Friends\\Best Clips");
//        final dk ff = new dk(filename, baseDir, 6);
//        final long ini = System.currentTimeMillis();
//        final File f = ff.find();
//        final long end = System.currentTimeMillis();
//        System.out.println(f + " " + (end - ini) + " ms");
        Unix4jCommandBuilder unix4j = Unix4j.builder();
        List<String> testClasses = unix4j.find(b, a).toStringList();
        for(String path: testClasses){
            System.out.println(path);
        }
    }

//    publicic static void main() {
//
//    }

}