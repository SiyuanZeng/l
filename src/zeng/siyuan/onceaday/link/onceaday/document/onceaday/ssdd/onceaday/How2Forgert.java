package zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday;

import zeng.siyuan.C1comehere.C1comehere;
import zeng.siyuan.reuseutil.r;

import javax.swing.*;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

//Created by Real
public class How2Forgert implements Serializable {
    public transient C1comehere c1comehere;
    public transient JTextArea textArea;
    public transient static CopyOnWriteArrayList<person_question> ebbinghauses;
    public transient CopyOnWriteArrayList<Task> tasks = new CopyOnWriteArrayList<Task>();
    public transient Task currentTask = new Task();
    public transient Display d;
    public transient Thread reloadandDisplayThread;
    public transient JFrame frame;
    public peoplequesiton m = new peoplequesiton();
    ;
    public boolean isSearch;
    public int count = 1;
    private CopyOnWriteArrayList<person_question> searchebbinghauses;
    private CopyOnWriteArrayList<Task> searchtasks;
    private Task currentTaskSearch;
    private String keywords;

    /*


    starting today, false

    then true then next day  si should remove the true /false check

    then next day, where is this one





     */

    public void load() {
        Scanner in = null;

        String str = textArea.getText();
        if (null != textArea && !("".equalsIgnoreCase(textArea.getText()))) {

            in = new Scanner(textArea.getText());
            while (in.hasNext()) {
                String line = in.nextLine();
                if (line.startsWith("C:") ||line.startsWith("http")) {
                    person_question e = new person_question(line, "Link", null);
                    m.store(e);
                    textArea.setText("");
jh(e);
                } else {
                    textArea.setText("invalid input" + "\n" + line);
                }
            }
        }
        Runnable a =()->Collections.sort(tasks, new Task());
a.run();
    }

    public How2Forgert(C1comehere c1comehere, JTextArea textArea, JFrame frame) {
        this.c1comehere = c1comehere;
        this.textArea = textArea;
        this.frame = frame;
    }

    public void updatetask() {
        String textinput = textArea.getText().trim();
        for (person_question e : ebbinghauses) {
            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                e.setText(textinput);
                m.store(e);
                System.out.println("updates");
                isSearch = false;
                break;
            }
        }
    }

    public void displayTask() {
        try {
            if (isSearch) {
                displaysearchtasks();
            } else {
                for (Task t : tasks) {
                    if (t.getDate().after(new Date())) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(t.getDate());//1474356339826
                        long diff = calendar.getTimeInMillis() - Calendar.getInstance().getTimeInMillis();
                        if (diff > 0) {
                            Thread.sleep(diff);
                            while (!textArea.getText().trim().isEmpty()) {
                                Thread.sleep(10000);
                            }
                            frame.repaint();
                            frame.toFront();
                            currentTask = t;
                            String inntuitive = "";
                            for (person_question e : ebbinghauses) {
                                if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                                    inntuitive+=e.getText();
//                                            m.deleteTask(e.getJavauid());
//                                            e = new person_question(e.getText(),"ssdd", null);
//                                    e.getTasks().stream().forEach(q -> q.setDate(Date.from((LocalDateTime.from(q.getDate().toInstant()).plusDays(1)).atZone(ZoneId.systemDefault()).toInstant())));
                                    currentTask.setDate(Date.from((LocalDateTime.from(currentTask.getDate().toInstant()).plusDays(1)).atZone(ZoneId.systemDefault()).toInstant()));

                                            m.store(e);
                                    r.o(e.getText());

//                                    if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                                            break;
                                }
                            }
                        } else {
                            while (!textArea.getText().trim().isEmpty()) {
                                Thread.sleep(10000);
                            }
                            frame.repaint();
                            frame.toFront();
                            currentTask = t;
                            String inntuitive = "";
                            for (person_question e : ebbinghauses) {
                                if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                                    inntuitive+=e.getText();
//                                    m.deleteTask(e.getJavauid());
//                                            e = new person_question(e.getText(),"ssdd", null);
                                    currentTask.setDate(Date.from((LocalDateTime.from(currentTask.getDate().toInstant()).plusDays(1)).atZone(ZoneId.systemDefault()).toInstant()));

                                    m.store(e);
//                            if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                                    r.o(e.getText());

                                            break;
                                }
                            }
                            Thread.sleep(10000);
                        }
                    } else if (t.getDate().before(new Date())) {
                        while (!textArea.getText().trim().isEmpty() ) {
                            Thread.sleep(10000);
                        }
                        frame.repaint();
                        frame.toFront();
                        currentTask = t;
                        String inntuitive = "";
                        for (person_question e : ebbinghauses) {
                            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                                        inntuitive+=e.getText();

//                                        e.getTasks().stream().forEach(q -> q.setDate(Date.from((LocalDateTime.from(q.getDate().toInstant()).plusDays(1)).atZone(ZoneId.systemDefault()).toInstant())));
//                                        e.getTasks().stream().forEach(q -> q.setDate(Date.from((LocalDateTime.from(q.getDate().toInstant()).plusDays(1)).atZone(ZoneId.systemDefault()).toInstant())));
                                currentTask.setDate(Date.from((LocalDateTime.from(currentTask.getDate().toInstant()).plusDays(1)).atZone(ZoneId.systemDefault()).toInstant()));

//                                        m.deleteTask(e.getJavauid());
//                                        e = new person_question(e.getText(),"ssdd", null);
                                        m.store(e);
//                                        if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
r.o(e.getText());
                                        break;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getString() {
        String buttonSelected = "";
        for (Enumeration<AbstractButton> buttons = c1comehere.untoggle.bg.getElements(); buttons.hasMoreElements(); ) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                buttonSelected = button.getText();
            }
        }
        return buttonSelected;
    }

    private void displaysearchtasks() {

        for (Task t : searchtasks) {
            currentTaskSearch = t;
            for (person_question e : searchebbinghauses) {
                if (e.getJavauid().toString().equalsIgnoreCase(currentTaskSearch.getJavauuid().toString())) {
                    String inntuitive = "";
                    inntuitive += e.text;
                    if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                    while (!textArea.getText().trim().equalsIgnoreCase("")) {
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                    }
                    count++;
                    isSearch = true;
                }
            }
        }
    }

    public void deltask() {
        for (person_question e : ebbinghauses) {
            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                m.deleteTask(e.getJavauid());
                System.out.println("delet the " + e.text);
                if (isSearch == false) reloadTAskandrestartPopThread();
                isSearch = false;
            }
        }
    }


    public void addWord(String word, String answer) {
        person_question pq = new person_question(word, answer, null);
        m.store(pq);
        ebbinghauses.add(pq);
        textArea.setText("");
    }

    public void loadTask() {

        ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();
        tasks = new CopyOnWriteArrayList<Task>();
        for (person_question e : ebbinghauses) {
            if (e.text.replace("DuSDfLgt", "").trim().isEmpty()) {
                m.deleteTask(e.getJavauid());
            } else {
                Set<Task> t = e.tasks;
                for (Task task : t) {
                    if (null !=task) tasks.add(task);
                }
            }
        }
        Collections.sort(tasks, new Task());
    }public void jh(person_question d) {

//        ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();
//        tasks = new CopyOnWriteArrayList<Task>();
//        for (person_question e : ebbinghauses) {
//            if (e.text.replace("DuSDfLgt", "").trim().isEmpty()) {
//                m.deleteTask(e.getJavauid());
//            } else {
                Set<Task> t = d.tasks;
                for (Task task : t) {
                    if (null !=task) tasks.add(task);
                }
//            }
//        }
        }


    public Date getdatelastday() {
        CopyOnWriteArrayList<person_question> ebbinghauses2 = (CopyOnWriteArrayList<person_question>) m.getlatest();
        CopyOnWriteArrayList<DecendingTask> taskstemp = new CopyOnWriteArrayList<DecendingTask>();
        for (person_question e : ebbinghauses2) {
            if (e.text.replace("DuSDfLgt", "").trim().isEmpty()) {
                m.deleteTask(e.getJavauid());
            } else {
                DecendingTask d = new DecendingTask(e.getDate());
                taskstemp.add(d);
            }
        }
        Collections.sort(taskstemp, new DecendingTask());
        if (null != taskstemp && taskstemp.size() > 0) {
            return taskstemp.get(0).getDate();
        }
        return new Date();
    }

    public void searchehabins(String a) {
        textArea.setText("");
        ebbinghauses = (CopyOnWriteArrayList<person_question>) m.getlatest();
        searchtasks = new CopyOnWriteArrayList<Task>();
        searchebbinghauses = new CopyOnWriteArrayList<person_question>();

        keywords = a.trim();
        String[] sts = a.trim().split(" ");
        if (sts.length == 0) return;
        for (person_question e : ebbinghauses) {
            boolean flag2 = false;
            for (String s : sts) {
                flag2 = e.text.contains(s);
                if (!flag2) {
                    break;
                }
            }
            if (flag2) {
                for (Task ct : e.getTasks()) {
                    searchtasks.add(ct);
                    searchebbinghauses.add(e);
                    break;
                }
            }
        }
        count = 1;
        isSearch = true;
        if (null != searchtasks) {
            textArea.setText("");
            Collections.sort(searchtasks, new Task());
            reloadandDiskplaypopup(isSearch);
        }
    }

    public void reloadandDiskplaypopup(boolean is) {
        textArea.setText("");
        reloadTAskandrestartPopThread();
    }

    public void reloadandDiskplaypopup() {
        if (!isSearch) {
            loadTask();
        }
        displayTask();
    }

    public void inster(String word, String answer) throws IOException {
        addWord(word, answer);
        isSearch = false;
    }

    private void reloadTAskandrestartPopThread() {
        textArea.setText("");
        if (null != reloadandDisplayThread || reloadandDisplayThread.isAlive()) {
            reloadandDisplayThread.interrupt();
        }
        d = new Display(this);
        reloadandDisplayThread = new Thread(d);
        reloadandDisplayThread.start();
    }


    public void init() {
        loadTask();
        d = new Display(this);
        reloadandDisplayThread = new Thread(d);
        reloadandDisplayThread.start();
    }
}

