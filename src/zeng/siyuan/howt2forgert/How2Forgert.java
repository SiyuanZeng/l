package zeng.siyuan.howt2forgert;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import zeng.siyuan.C1comehere.C1comehere;
import zeng.siyuan.mappingmanager.mappingmanager;
import zeng.siyuan.reuseutil.r;
import zeng.siyuan.solr.solr;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

//Created by Real
public class How2Forgert implements Serializable {
    public transient C1comehere c1comehere;
    public transient JTextArea textArea;
    public transient static Set<Ebbinghaus> ebbinghauses;
    public transient CopyOnWriteArrayList<Task> tasks = new CopyOnWriteArrayList<Task>();
    public transient Task currentTask = new Task();
    public transient Display d;
    public transient Thread reloadandDisplayThread;
    public transient JFrame frame;
    public mappingmanager m;
    public boolean isSearch;
    public boolean isSearchCombine;
    public int count=1;
    private CopyOnWriteArrayList<Ebbinghaus> searchebbinghauses;
    private CopyOnWriteArrayList<Task> searchtasks;
    private Task currentTaskSearch;
    private String keywords;

    public void load(){
        Scanner in = null;
        // somethign doesn't make sense then ti tsi the tpeorblem and people won'et able to understandint i tna dmake it going aways

        if (null != textArea && !("".equalsIgnoreCase(textArea.getText()))) {

            in = new Scanner(textArea.getText());
                while (in.hasNext()) {
                    String line = in.nextLine();
                    if (line.contains("?") && line.endsWith("?")) {
                        Ebbinghaus e = new Ebbinghaus(line,"");
                        m.deleteTask(e.getJavauid());m.store(e);
                    } else {
                    }
                }
            }
        }

    public How2Forgert(C1comehere c1comehere, JTextArea textArea, JFrame frame) {
        this.c1comehere = c1comehere;
        this.textArea = textArea;
        this.frame = frame;
        m = new mappingmanager();
        ebbinghauses = m.get();
    }

    public void updatetask() {
        StringBuilder stringBuilder = new StringBuilder();
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("EEE, MMM dd, yyyy 'at' hh:mm");
        c.add(Calendar.HOUR_OF_DAY, 1);

        // found!
        String textinput = System.getProperty("line.separator");
        textinput +=         textArea.getText().replace(" ufgt ", System.getProperty("line.separator"));
        textinput += System.getProperty("line.separator");
        Scanner in = null;

        if (!textinput.isEmpty()) {
            StringBuilder stringBuilder1 = new StringBuilder();
            in = new Scanner(textinput);
            while (in.hasNext()) {
                String line = in.nextLine();
                if (line.contains(" found!")) {
                } else {
                    stringBuilder.append(line);
                }
            }
            textinput=stringBuilder.toString();
        }


        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if (timeOfDay >= 0 && timeOfDay < 12) {
            stringBuilder.append(System.getProperty("line.separator"));                stringBuilder.append(System.getProperty("line.separator"));stringBuilder.append("Good Morning C1 world, ");
        } else if (timeOfDay >= 12 && timeOfDay < 16) {
            stringBuilder.append(System.getProperty("line.separator"));                stringBuilder.append(System.getProperty("line.separator"));stringBuilder.append("Good Afternoon C1 world, ");
        } else if (timeOfDay >= 16 && timeOfDay < 21) {
            stringBuilder.append(System.getProperty("line.separator"));                stringBuilder.append(System.getProperty("line.separator"));stringBuilder.append("Good Evening C1 world, ");
        } else if (timeOfDay >= 21 && timeOfDay < 24) {
            stringBuilder.append(System.getProperty("line.separator"));                stringBuilder.append(System.getProperty("line.separator"));stringBuilder.append("Good Night C1 world, ");
        }

        stringBuilder.append(format.format(c.getTime()));

        for (Ebbinghaus e : ebbinghauses) {
            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                if (timeOfDay >= 0 && timeOfDay < 12) {
                    stringBuilder.append(" am");                stringBuilder.append(System.getProperty("line.separator"));
                } else if (timeOfDay >= 12 && timeOfDay < 24) {
                    stringBuilder.append(" pm");                stringBuilder.append(System.getProperty("line.separator"));
                }
                stringBuilder.append(System.getProperty("line.separator"));
                stringBuilder.append(System.getProperty("line.separator"));
                stringBuilder.append(textinput);
                stringBuilder.append(System.getProperty("line.separator"));
                stringBuilder.append(System.getProperty("line.separator"));
                e.question = stringBuilder.toString();
                Ebbinghaus e1 = new Ebbinghaus(e.question, "");
//                m.deleteTask(e.getJavauid());
                m.deleteTask(e.getJavauid());m.store(e);
                System.out.println("updates");
                isSearch=false;
                isSearchCombine=false;
                Runnable a = () -> reloadTAskandrestartPopThread();
                a.run();
                break;
            }
        }
    }

    public void displayTask() {
        try {
            if(isSearch){
                displaysearchtasks();
            } else if(isSearchCombine){
                displaysearchtaskscombine();
                isSearchCombine=false;
                isSearch=false;
            } else {
                for (Task t : tasks) {
                    if (!t.getIsDone() && t.getDate().after(new Date())) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(t.getDate());
                        long diff = calendar.getTimeInMillis() - Calendar.getInstance().getTimeInMillis();
                        if (diff > 0) {
                            Thread.sleep(diff);
// how to write complextity code and make so complate what i my mind iwill explore and so confused taht ywoudl dso be so so watowmethinwa yis omething i ma tolooing dfor that it s.
// sicj a s,a;; amd [a[;coaotm and ti so difficult to do sthe athat right htehing then what should i do now i reallly don't waknow hat to to do




                            String buttonSelected = getString();
                            boolean isHow2ForegertCommand = buttonSelected.equalsIgnoreCase("ufgt") || buttonSelected.equalsIgnoreCase("deldiary");


                            while (!textArea.getText().trim().isEmpty() || !isHow2ForegertCommand) {
                                Thread.sleep(10000);
                                for (Enumeration<AbstractButton> buttons = c1comehere.untoggle.bg.getElements(); buttons.hasMoreElements(); ) {
                                    AbstractButton button = buttons.nextElement();

                                    if (button.isSelected()) {
                                        buttonSelected = button.getText();
                                    }
                                }
                                isHow2ForegertCommand = buttonSelected.equalsIgnoreCase("ufgt") || buttonSelected.equalsIgnoreCase("deldiary");


                            }
                            frame.repaint();
                            frame.toFront();
                            currentTask = t;
                            String inntuitive = System.getProperty("line.separator");                                        inntuitive += System.getProperty("line.separator");                                        inntuitive += System.getProperty("line.separator");

                            inntuitive += (" ufgt ");
                            inntuitive += System.getProperty("line.separator");                                        inntuitive += System.getProperty("line.separator");                                        inntuitive += System.getProperty("line.separator");
                            for (Ebbinghaus e : ebbinghauses) {
                                if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                                    for (Task ct : e.getTasks()) {
                                        if (ct.getDate().getTime() == currentTask.getDate().getTime()) {
                                            ct.setIsDone(true);
                                            inntuitive += e.question;
//                                            m.deleteTask(e.getJavauid());
                                            m.deleteTask(e.getJavauid());m.store(e);
                                        }
                                    }
                                }
                            }
                            inntuitive += System.getProperty("line.separator");
                            if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                        } else {


                            String buttonSelected = getString();
                            boolean isHow2ForegertCommand = buttonSelected.equalsIgnoreCase("ufgt") || buttonSelected.equalsIgnoreCase("deldiary");


                            while (!textArea.getText().trim().isEmpty() || !isHow2ForegertCommand) {
                                Thread.sleep(10000);

                                for (Enumeration<AbstractButton> buttons = c1comehere.untoggle.bg.getElements(); buttons.hasMoreElements(); ) {
                                    AbstractButton button = buttons.nextElement();

                                    if (button.isSelected()) {
                                        buttonSelected = button.getText();
                                    }
                                }
                                isHow2ForegertCommand = buttonSelected.equalsIgnoreCase("ufgt") || buttonSelected.equalsIgnoreCase("deldiary");

                            }
                            frame.repaint();
                            frame.toFront();
                            currentTask = t;
                            String inntuitive = System.getProperty("line.separator");                                        inntuitive += System.getProperty("line.separator");
                            inntuitive += (" ufgt ");                                        inntuitive += System.getProperty("line.separator");
                            inntuitive += System.getProperty("line.separator");
                            for (Ebbinghaus e : ebbinghauses) {
                                if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                                    for (Task ct : e.getTasks()) {
                                        if (ct.getDate().getTime() == currentTask.getDate().getTime()) {
                                            ct.setIsDone(true);
                                            inntuitive += e.question;
//                                            m.deleteTask(e.getJavauid());
                                            m.deleteTask(e.getJavauid());m.store(e);
                                        }
                                    }
                                }// the code is so complate and make my mind ex;oprle tha tis ti snot nescessry and it is so complex tand it really suxks and you know ahta t

                            }                                        inntuitive += System.getProperty("line.separator");
                            inntuitive += System.getProperty("line.separator");
                            if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                            Thread.sleep(10000);
                        }
                    } else if (!t.getIsDone() && t.getDate().before(new Date())) {

                        String buttonSelected = getString();
                        boolean isHow2ForegertCommand = buttonSelected.equalsIgnoreCase("ufgt") || buttonSelected.equalsIgnoreCase("deldiary");


                        frame.repaint();// there are so many tuqeisotns and you knwo ti a there are just so many queistons and ayou shousld what oi amswhtaw towte ods thwith iet hoayoetu aosdhfasdhf
                        frame.toFront();
                        currentTask = t;

                        for (Ebbinghaus e : ebbinghauses) {
                            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                                for (Task ct : e.getTasks()) {
                                    if (ct.getDate().getTime() == currentTask.getDate().getTime()) {
                                        ct.setIsDone(false);
                                        ct.setDate(r.ls(ct.getDate()));
                                        String inntuitive = System.getProperty("line.separator");
                                        inntuitive += (" ufgt ");
                                        inntuitive += System.getProperty("line.separator");
                                        inntuitive += System.getProperty("line.separator");
                                        inntuitive += e.question;                                        inntuitive += System.getProperty("line.separator");                                        inntuitive += System.getProperty("line.separator");
//                                        m.deleteTask(e.getJavauid());
                                        m.deleteTask(e.getJavauid());m.store(e);

                                        while (!textArea.getText().trim().isEmpty() || !isHow2ForegertCommand) {
                                            try {
                                                Thread.sleep(10000);
                                            } catch (Exception f) {
                                                f.printStackTrace();
                                            }
                                            for (Enumeration<AbstractButton> buttons = c1comehere.untoggle.bg.getElements(); buttons.hasMoreElements(); ) {
                                                AbstractButton button = buttons.nextElement();

                                                if (button.isSelected()) {
                                                    buttonSelected = button.getText();
                                                }
                                            }
                                            isHow2ForegertCommand = buttonSelected.equalsIgnoreCase("ufgt") || buttonSelected.equalsIgnoreCase("deldiary");
                                        }
                                        inntuitive += System.getProperty("line.separator");
                                        if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                                        inntuitive += System.getProperty("line.separator");
                                        while (!textArea.getText().trim().isEmpty() || !isHow2ForegertCommand) {
                                            try {
                                                Thread.sleep(10000);
                                            } catch (Exception f) {
                                                f.printStackTrace();
                                            }
                                            for (Enumeration<AbstractButton> buttons = c1comehere.untoggle.bg.getElements(); buttons.hasMoreElements(); ) {
                                                AbstractButton button = buttons.nextElement();

                                                if (button.isSelected()) {
                                                    buttonSelected = button.getText();
                                                }
                                            }
                                            isHow2ForegertCommand = buttonSelected.equalsIgnoreCase("ufgt") || buttonSelected.equalsIgnoreCase("deldiary");
                                        }
//                                        reloadTAskandrestartPopThread();
                                    }
                                }
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
            currentTaskSearch=t;

            for (Ebbinghaus e : searchebbinghauses) {
                if (e.getJavauid().toString().equalsIgnoreCase(currentTaskSearch.getJavauuid().toString())) {
                    String inntuitive = "";
                    inntuitive += "\n";
                    inntuitive += " ufgt ";
                    inntuitive += "\n";

                    inntuitive += (" found! " + count + "/" +searchtasks.size() + " " +keywords);
                    inntuitive +="\n";
                    inntuitive +="\n";
                    inntuitive+=e.question;
                    if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
                    while (!textArea.getText().trim().equalsIgnoreCase("")) {
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                    }
                    count++;
                    isSearch=true;
                    isSearchCombine=false;

                }
            }
        }
        count =0;
    }

    private void displaysearchtaskscombine() {

        String inntuitive = "";
        for (Task t : searchtasks) {
            currentTaskSearch=t;
            for (Ebbinghaus e : searchebbinghauses) {
                if (e.getJavauid().toString().equalsIgnoreCase(currentTaskSearch.getJavauuid().toString())) {
                    inntuitive += "\n";
                    inntuitive += " ufgtalls ";
                    inntuitive += "\n";

                    inntuitive += (" found! " + count + "/" +searchtasks.size() + " " +keywords);
                    inntuitive +="\n";
                    inntuitive +="\n";
                    inntuitive+=e.question;
                    count++;
                    isSearchCombine=true;
                    isSearch=false;
                }
            }
        }
        while (!textArea.getText().trim().equalsIgnoreCase("")) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        if(!textArea.getText().trim().equalsIgnoreCase("")) try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e9) { e9.printStackTrace(); } textArea.setText(inntuitive);
    }

    public void deltask() {
        for (Ebbinghaus e : ebbinghauses) {
            if (e.getJavauid().toString().equalsIgnoreCase(currentTask.getJavauuid().toString())) {
                m.deleteTask(e.getJavauid());
                System.out.println("delet the " + e.getQuestion());
                if(isSearch==false)reloadTAskandrestartPopThread();
                isSearch=false;
                isSearchCombine=false;
            }
        }
    }


    private static class MyCustomExclusionStrategy implements ExclusionStrategy {

        public boolean shouldSkipClass(Class<?> arg0) {
            return false;
        }

        public boolean shouldSkipField(FieldAttributes f) {
            return (f.getDeclaringClass() == Ebbinghaus.class && f.getName().equals("changes"));
        }

    }

    public static void serialize() {
        Gson gson = new Gson();
        try {
            String str = gson.toJson(ebbinghauses);

            FileWriter writer = new FileWriter(new File("c1comehere\\ebbinghauses.txt").getAbsolutePath());
            writer.write(str);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addWord(String word, String answer) {
        Ebbinghaus ebbinghaus = new Ebbinghaus(word, answer);
        mappingmanager mappingmanager = new mappingmanager();
        mappingmanager.store(ebbinghaus);
        ebbinghauses.add(ebbinghaus);
        textArea.setText("");
    }

    loadolr loadolr;

// they give me uselfss things to cheat on me and make me learn a lot fo things
    // they ask me to do things
    // a person can save the world and he has the same power fto ruin the world

    public void loadTask() {

        solr solr = new solr();
        ebbinghauses = new HashSet<>();

        try {
// i lie to myself
            // i don't see
            // i don't see
            // i am dead
            // i talk to myself
            m = new mappingmanager();
            Set<Ebbinghaus> ebbinghau = m.get();

            for(Ebbinghaus s : ebbinghau) {
                ebbinghauses.add(s);
            }

            searchebbinghauses = new CopyOnWriteArrayList<Ebbinghaus>();

            tasks = new CopyOnWriteArrayList<Task>();

                keywords="what ? come everything nothing something ".trim();
                String[] sts="what ? come everything nothing something ".trim().split(" ");
                if(sts.length==0)return;
                for (Ebbinghaus e : How2Forgert.ebbinghauses) {
                    if (e.getQuestion().replace("ufgt","").trim().isEmpty()){
                        m.deleteTask(e.getJavauid());
                        continue;
                    }

                    boolean flag2=false;
                    for (String s : sts){
                        flag2 = e.getQuestion().indexOf(s) != -1;
                        if(flag2){
                            break;
                        }
                    }
                    if(flag2) {
                        for (Task ct : e.getTasks()) {
                            tasks.add(ct);
                            searchebbinghauses.add(e);
                            break;
                        }
                    }
                }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (null == loadolr) {
            loadolr = new loadolr(ebbinghauses);
        } else {
        }
        if (!loadolr .isAlive()&&loadolr .open())
            loadolr .start();



        //solr
/*

        SolrDataDAO solrDataDAO = null;
        try {
            solrDataDAO = new SolrDataDAO();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            solrDataDAO.addData(e.javauid,e.getQuestion());
        } catch (Exception e1) {
            e1.printStackTrace();
        }
*/



        if (null != tasks && tasks.size()>1)   Collections.sort(tasks, new Task());
    }
// what odes everybody need?

    // bcracking something
    public void searchehabins(String a) {
        textArea.setText("");
        ebbinghauses = m.get();
        searchtasks = new CopyOnWriteArrayList<Task>();
        searchebbinghauses=new CopyOnWriteArrayList<Ebbinghaus>();

        keywords=a.trim();
        String[] sts=a.trim().split(" ");
        if(sts.length==0)return;
        for (Ebbinghaus e : ebbinghauses) {
            boolean flag2=false;
            for (String s : sts){
                flag2 = e.getQuestion().contains(s);
                if(!flag2){
                    break;
                }
            }
            if(flag2) {
                for (Task ct : e.getTasks()) {
                    searchtasks.add(ct);
                    searchebbinghauses.add(e);
                    break;
                }
            }
        }
        count=1;
        isSearch = true;
        isSearchCombine=false;
        if (null != searchtasks ) {
            textArea.setText("");
            Collections.sort(searchtasks, new Task());
            reloadandDiskplaypopup(isSearch);
        }
    }


    public void searchehabinsCombined(String a) {
        textArea.setText("");
        ebbinghauses = m.get();
        searchtasks = new CopyOnWriteArrayList<Task>();
        searchebbinghauses=new CopyOnWriteArrayList<Ebbinghaus>();

        keywords=a.trim();
        String[] sts=a.trim().split(" ");
        if(sts.length==0)return;
        for (Ebbinghaus e : ebbinghauses) {
            boolean flag2=false;
            for (String s : sts){
                flag2 = e.getQuestion().contains(s);
                if(!flag2){
                    break;
                }
            }
            if(flag2) {
                for (Task ct : e.getTasks()) {
                    searchtasks.add(ct);
                    searchebbinghauses.add(e);
                    break;
                }
            }
        }
        count=1;
        isSearch = false;
        isSearchCombine = true;
        if (null != searchtasks ) {
            textArea.setText("");
            Collections.sort(searchtasks, new Task());
            reloadandDiskplaypopupcinbome(isSearchCombine);
        }

        // there is people there si love
        // there is somethign

    }


    public void reloadandDiskplaypopup(boolean is) {
        textArea.setText("");
        reloadTAskandrestartPopThread();
    }

    public void reloadandDiskplaypopupcinbome(boolean is) {
        textArea.setText("");
        reloadTAskandrestartPopThread();
    }

    public void reloadandDiskplaypopup(){
        if(!isSearch){
            loadTask();
        }
        displayTask();
    }

    public void inster(String word, String answer) throws IOException {
        addWord(word, answer);
        isSearch=false;
        isSearchCombine=false;
    }

    private void reloadTAskandrestartPopThread() {
        loadTask();
        textArea.setText("");
        if (null != reloadandDisplayThread || reloadandDisplayThread.isAlive()) {
            reloadandDisplayThread.interrupt();
        }
        d = new Display(this);
        reloadandDisplayThread = new Thread(d);
        reloadandDisplayThread.start();
    }


    public void init() throws Exception {
        loadTask();
        d = new Display(this);
        reloadandDisplayThread = new Thread(d);
        reloadandDisplayThread.start();
    }
}

