package zeng.siyuan.C1comehere;

import com.epam.preprod.firefox.model.TestGmail;
import fg.f;
import loli.datepicker.DatePicker;
import main.k.TodoApp;
import zeng.siyuan.betteresearchennebetterthangoogleandfindweehtehrething.findessentioal.findthebestexample;
import zeng.siyuan.betteresearchennebetterthangoogleandfindweehtehrething.findessentioal.findtheshortcut;
import zeng.siyuan.betteresearchennebetterthangoogleandfindweehtehrething.findessentioal.findtutroial.findtheshortcutyoutututouiral;
import zeng.siyuan.betteresearchennebetterthangoogleandfindweehtehrething.findessentioal.gooogle;
import zeng.siyuan.button.untoggle;
import zeng.siyuan.howt2forgert.How2Forgert;
import zeng.siyuan.iamhere.what.dk;
import zeng.siyuan.k.JTextAreaExample;
import zeng.siyuan.reuseutil.r;
import zeng.siyuan.solr.test.param.dao.SolrDataDAO;
import zeng.siyuan.youknowwhat.YouKnowWhat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class C1comehere implements Serializable {
    public transient JFrame lastFrame = null;
    public static JPanel controlPanel;
    public static transient JTextArea textArea;
    public static JFrame frame;
    public How2Forgert how2Forgert;
    public zeng.siyuan.onceaday.How2Forgert dhow2Forgert;
    public zeng.siyuan.onceaday.link.onceaday.How2Forgert dhow2Forgertl;
    public zeng.siyuan.onceaday.link.onceaday.document.onceaday.How2Forgert dhow2ForgDertl;
    public zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.How2Forgert dhow2ForgDertls;
    public zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.How2Forgert dhow2ForgDertlsf;
    public zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.onceaday.How2Forgert dhow2ForgDertlssf;
    public zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.How2Forgert a;
    public zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.How2Forgert j;
    public zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.asdf.How2Forgert jd;
    public static C1comehere c1comehere;
    public static Font font = new Font("Serif", Font.PLAIN, c.SIZE);
    public static untoggle untoggle;
    public static transient Properties prop;
    public static transient Properties pdrop;
    public static transient Properties jk;
    public transient static Map<String, Search> searchEngines = new HashMap<String, Search>();

    public static void main(String ar[]) throws Exception {
        try
        {
            Process p=Runtime.getRuntime().exec("cmd /c C:\\solr-6.2.0\\bin\\solr start");
            p.waitFor();
            BufferedReader reader=new BufferedReader(
                    new InputStreamReader(p.getInputStream())
            );
            String line;
            while((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }

        }
        catch(IOException e1) {}
        catch(InterruptedException e2) {}
        finally {

        }

        System.out.println("Done");








        configureLookAndFeel();
        c1comehere = new C1comehere();
        c1comehere.showFrame();

    }


    public void c1come2melater(String c1, String c1Path) {

        OutputStream output = null;
        OutputStream output_solr = null;
        try {

            output = new FileOutputStream("C:\\Development_Base\\maxcox\\maxcox-master\\c1s.properties");
            c1 = c1.replace(" ", "%20");
            // set the properties value
            prop.setProperty(c1, c1Path);

            // save properties to project root folder
            prop.store(output, null);


            output_solr = new FileOutputStream("C:\\Development_Base\\maxcox\\maxcox-master\\c1s.properties.solr");

            int count = 0;
            for (Map.Entry<Object, Object> e : prop.entrySet()) {
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                output_solr.write(String.valueOf(count).getBytes());
                output_solr.write(',');
                output_solr.write(key.getBytes());
                output_solr.write(',');
                output_solr.write(v.getBytes());
                output_solr.write(System.getProperty("line.separator").getBytes());
                count++;
            }

            c1s();
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                    output_solr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void d(String c1, String c1Path) {

        OutputStream output = null;
        OutputStream output_solr = null;
        try {

            output = new FileOutputStream("C:\\Development_Base\\maxcox\\maxcox-master\\src\\zeng\\siyuan\\C1comehere\\l.properties");
            // set the properties value
            jk.setProperty(c1, c1Path);

            // save properties to project root folder
            jk.store(output, null);


/*
            output_solr = new FileOutputStream("/Users/vn0xrjh/daniel/14_GUIcopymacosx/c1comehere/c1s.properties.solr");

            int count = 0;
            for (Map.Entry<Object, Object> e : prop.entrySet()) {
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                output_solr.write(String.valueOf(count).getBytes());
                output_solr.write(',');
                output_solr.write(key.getBytes());
                output_solr.write(',');
                output_solr.write(v.getBytes());
                output_solr.write(System.getProperty("line.separator").getBytes());
                count++;
            }
*/

            c1ds();
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public void dd(String c1, String c1Path) {

        OutputStream output = null;
        OutputStream output_solr = null;
        try {

            output = new FileOutputStream("C:\\Development_Base\\maxcox\\maxcox-master\\src\\zeng\\siyuan\\C1comehere\\d.properties");
            // set the properties value
            pdrop.setProperty(c1, c1Path);

            // save properties to project root folder
            pdrop.store(output, null);


/*
            output_solr = new FileOutputStream("/Users/vn0xrjh/daniel/14_GUIcopymacosx/c1comehere/c1s.properties.solr");

            int count = 0;
            for (Map.Entry<Object, Object> e : prop.entrySet()) {
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                output_solr.write(String.valueOf(count).getBytes());
                output_solr.write(',');
                output_solr.write(key.getBytes());
                output_solr.write(',');
                output_solr.write(v.getBytes());
                output_solr.write(System.getProperty("line.separator").getBytes());
                count++;
            }
*/

            k();
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void c1s() {
        prop = new Properties();
        Properties temprop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("C:\\Development_Base\\maxcox\\maxcox-master\\c1s.properties");
            // fjlasdjfl a properties file
            temprop.load(input);


            for (Map.Entry<Object, Object> e : temprop.entrySet()) {
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                prop.put(key, v);
            }
            System.out.println("Done Propertiesy loading");

            input = new FileInputStream("C:\\Development_Base\\maxcox\\maxcox-master\\src\\main\\resources\\c1s.properties");
            // fjlasdjfl a properties file
            temprop = new Properties();
            temprop.load(input);


            for (Map.Entry<Object, Object> e : temprop.entrySet()) {
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                prop.put(key, v);
            }
            System.out.println("Done Propertiesy loading");

            input = new FileInputStream("C:\\Development_Base\\maxcox\\maxcox-master\\src\\zeng\\siyuan\\C1comehere\\p.properties");
            // fjlasdjfl a properties file
            temprop = new Properties();
            temprop.load(input);


            for (Map.Entry<Object, Object> e : temprop.entrySet()) {
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                prop.put(key, v);
            }
            System.out.println("Done Propertiesy loading");


            SolrDataDAO solrBaseDAO = null;
            try {
                solrBaseDAO = new SolrDataDAO();
            } catch (Exception e) {
                e.printStackTrace();
            }


            int count =1;
            for (Map.Entry<Object, Object> e : prop.entrySet()) {
                System.out.println(count);
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                try {
                    solrBaseDAO.addData(count, key,v);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                count++;
            }
            System.out.println("stop");





        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public void k() {
        pdrop = new Properties();
        Properties temprop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("C:\\Development_Base\\maxcox\\maxcox-master\\src\\zeng\\siyuan\\C1comehere\\d.properties");
            // fjlasdjfl a properties file
            temprop.load(input);


            for (Map.Entry<Object, Object> e : temprop.entrySet()) {
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                pdrop.put(key, v);
            }
            System.out.println("Done Propertiesy loading");

/*
            SolrDataDAO solrBaseDAO = null;
            try {
                solrBaseDAO = new SolrDataDAO();
            } catch (Exception e) {
                e.printStackTrace();
            }


            int count =1;
            for (Map.Entry<Object, Object> e : prop.entrySet()) {
                System.out.println(count);
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                try {
                    solrBaseDAO.addData(count, key,v);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                count++;
            }
            System.out.println("stop");

*/



        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public static int k=0;

    public void c1ds() {
        jk = new Properties();
        Properties temprop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("C:\\Development_Base\\maxcox\\maxcox-master\\c1s.properties");
            // fjlasdjfl a properties file
            temprop.load(input);


            for (Map.Entry<Object, Object> e : temprop.entrySet()) {
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                jk.put(key, v);
            }
            System.out.println("Done Propertiesy loading");

/*
            SolrDataDAO solrBaseDAO = null;
            try {
                solrBaseDAO = new SolrDataDAO();
            } catch (Exception e) {
                e.printStackTrace();
            }


            int count =1;
            for (Map.Entry<Object, Object> e : prop.entrySet()) {
                System.out.println(count);
                String key = ((String) e.getKey()).replace("%20", " ");
                String v = (String) e.getValue();
                try {
                    solrBaseDAO.addData(count, key,v);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                count++;
            }
            System.out.println("stop");

*/



        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    // takeC1toMe
    public String takeC1toMe(String str) {
        str = str.trim();
        return prop.getProperty(str);
    }

    // takeC1toMe
    public String takeC1dtoMe(String str) {
        str = str.trim();
        return jk.getProperty(str);
    }

    private static void configureLookAndFeel() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break; //preferred!
                }
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception e) {
        }
    }

    public C1comehere() {

    }


    private void showFrame() throws Exception {

        frame = new JFrame();
        controlPanel = new JPanel();


        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
        try {
            Process p = Runtime.getRuntime().exec("cmd /c C:\\solr-6.2.0\\bin\\solr stop -all");
            p.waitFor();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(p.getInputStream())
            );
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {

        }

            }
        });



        frame.setTitle("c1comeherec1");
        frame.setFont(font);
        JLabel label = new JLabel("c1, com ehere , c1, come to me here.....myself MYSELF Hi meeeee....");
        label.setFont(font);
        frame.pack();

        JFrame temp = new JFrame();
        temp.pack();
        Insets insets = temp.getInsets();
        temp = null;
        frame.setSize(new Dimension(insets.left + insets.right + 500,
                insets.top + insets.bottom + 500));
        frame.setResizable(true);


        if (lastFrame == null) {
            frame.setLocationByPlatform(true);
        } else {
            Point p = lastFrame.getLocation();
            p.translate(50, 50);
            frame.setLocation(p);
        }
        lastFrame = frame;


        textArea = new JTextArea(8, 33);
        textArea.setLineWrap(true);
        textArea.setFont(font);
        DatePicker.dateTimePicker(textArea);



        if (null == how2Forgert) {
            how2Forgert = new How2Forgert(c1comehere, textArea, frame);
        }
        how2Forgert.c1comehere = c1comehere;
        how2Forgert.textArea = textArea;
        how2Forgert.frame = frame;
        try {
            how2Forgert.init();
        } catch (Exception e1) {
            e1.printStackTrace();
        }


        if (null == dhow2Forgert) {
            dhow2Forgert = new zeng.siyuan.onceaday.How2Forgert(c1comehere, textArea, frame);
        }
        dhow2Forgert.c1comehere = c1comehere;
        dhow2Forgert.textArea = textArea;
        dhow2Forgert.frame = frame;
        dhow2Forgert.init();


        if (null == dhow2Forgertl) {
            dhow2Forgertl = new zeng.siyuan.onceaday.link.onceaday.How2Forgert(c1comehere, textArea, frame);
        }
        dhow2Forgertl.c1comehere = c1comehere;
        dhow2Forgertl.textArea = textArea;
        dhow2Forgertl.frame = frame;
        dhow2Forgertl.init();




        if (null == dhow2ForgDertl) {
            dhow2ForgDertl= new zeng.siyuan.onceaday.link.onceaday.document.onceaday.How2Forgert(c1comehere, textArea, frame);
        }
        dhow2ForgDertl.c1comehere = c1comehere;
        dhow2ForgDertl.textArea = textArea;
        dhow2ForgDertl.frame = frame;
        dhow2ForgDertl.init();






        if (null == dhow2ForgDertls) {
            dhow2ForgDertls= new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.How2Forgert(c1comehere, textArea, frame);
        }
        dhow2ForgDertls.c1comehere = c1comehere;
        dhow2ForgDertls.textArea = textArea;
        dhow2ForgDertls.frame = frame;
        dhow2ForgDertls.init();



        if (null == dhow2ForgDertlsf) {
            dhow2ForgDertlsf= new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.How2Forgert(c1comehere, textArea, frame);
        }
        dhow2ForgDertlsf.c1comehere = c1comehere;
        dhow2ForgDertlsf.textArea = textArea;
        dhow2ForgDertlsf.frame = frame;
        dhow2ForgDertlsf.init();
//https://www.bing.com/images/search?q=levels+of+knowledge&view=detailv2&id=92D057B6436E27DE427C557F2B3F0BC1FCF08076&selectedindex=40&ccid=2J%2FyDP%2BF&simid=608035630844741033&thid=OIP.Md89ff20cff85e64027ed1a4619ad5222o0&mode=overlay&first=1
//https://www.bing.com/images/search?q=levels+of+knowledge&view=detailv2&id=544326E38B5C8BACF33671825C9F6FBEA2F3B261&selectedindex=37&ccid=0vSFX7zN&simid=608036378175213314&thid=OIP.Md2f4855fbccdc0a74b55d600bf40d3ebo0&mode=overlay&first=1
        //https://www.bing.com/images/search?q=levels+of+knowledge&view=detailv2&id=AF69ED717CA25DF8D3A5A95F77A26B307F26F0A4&selectedindex=31&ccid=h3fxwKOo&simid=608002873133501346&thid=OIP.M8777f1c0a3a8408fa242f5a3f8628531o0&mode=overlay&first=1
        //https://www.bing.com/images/search?q=levels+of+knowledge&view=detailv2&id=875D31716186C2DA9E044102B2AA99933875D54B&selectedindex=29&ccid=Kux%2FNLke&simid=608035424692078905&thid=OIP.M2aec7f34b91ef5b8a6ba0a7ee814f286H0&mode=overlay&first=1
        //https://www.bing.com/images/search?q=levels+of+knowledge&view=detailv2&id=21685358F3EE1CE0D89090BE430EDB3FF9A3C323&selectedindex=28&ccid=BgO3zjKQ&simid=608010728633666851&thid=OIP.M0603b7ce3290a8801b1d1a701f00afdbH0&mode=overlay&first=1
        //https://www.bing.com/images/search?q=levels+of+knowledge&view=detailv2&id=9EBC6A24B6C3E66B092D48FC3579F7D11757EFF2&selectedindex=24&ccid=yPQgbyLu&simid=608052626034133689&thid=OIP.Mc8f4206f22eea87101458bff63783d7bo0&mode=overlay&first=1
        //https://www.bing.com/images/search?q=levels+of+knowledge&view=detailv2&id=B8227DBC3DC6E59C84DED97DC91B4268CDAA768A&selectedindex=21&ccid=Q1pzT4hW&simid=608018635667671210&thid=OIP.M435a734f88565425ece85040b216ef0eo0&mode=overlay&first=1
        //https://www.bing.com/images/search?q=levels+of+knowledge&view=detailv2&id=B32E8FA36D743299954480DDA2213EB11F8FAD62&selectedindex=16&ccid=JvLmHwSU&simid=608050792082900271&thid=OIP.M26f2e61f0494c4335a95ccbd84da27b9o0&mode=overlay&first=1
        //https://www.bing.com/images/search?q=levels+of+knowledge&view=detailv2&id=6703242720FAE0C35546BEB15F360DC41FD0876E&selectedindex=1&ccid=YV6m5ns3&simid=608025112469309866&thid=OIP.M615ea6e67b37c55f9dd18753ecf14b9do0&mode=overlay&first=1
        //https://www.bing.com/images/search?q=levels+of+knowledge&view=detailv2&id=02A8AFA12A29E5CAB29173A89ABA85B53E3729E9&ccid=T8pnDMfT&simid=608033028096852866&thid=OIP.M4fca670cc7d332e9bd9db19a38860defH0&mode=overlay&first=1

        if (null == dhow2ForgDertlssf) {
            dhow2ForgDertlssf= new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.onceaday.How2Forgert(c1comehere, textArea, frame);
        }
        dhow2ForgDertlssf.c1comehere = c1comehere;
        dhow2ForgDertlssf.textArea = textArea;
        dhow2ForgDertlssf.frame = frame;
        dhow2ForgDertlssf.init();



        if (null == a) {
            a= new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.How2Forgert(c1comehere, textArea, frame);
        }
        a.c1comehere = c1comehere;
        a.textArea = textArea;
        a.frame = frame;
        a.init();


        if (null == j) {
            j= new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.How2Forgert(c1comehere, textArea, frame);
        }
        j.c1comehere = c1comehere;
        j.textArea = textArea;
        j.frame = frame;
        j.init();

        k();
        k=pdrop.size();


        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }
// nobody know swhat he is doing
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyChar());
                System.out.println(e.getKeyChar() == KeyEvent.VK_0);
                System.out.println("up");
                System.out.println(e.getKeyChar() == KeyEvent.VK_LEFT);
                System.out.println(e.getKeyChar());
                System.out.println("DOWN");
                System.out.println(e.getKeyChar() == KeyEvent.VK_RIGHT);
                System.out.println(e.getKeyChar());
                System.out.println("contrl");
                System.out.println(e.getModifiers() == KeyEvent.CTRL_MASK);
                if (e.getModifiers() == KeyEvent.CTRL_MASK && e.getKeyChar() == KeyEvent.VK_0) {
                    System.out.println("voice commander");
                    e.consume();
                    Beep.sound(2000, 150);
                    Thread a = new Thread(() -> {
                        try {
                            f.a();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                    );
                    a.start();

                }

                if (e.getModifiers() == KeyEvent.CTRL_MASK && e.getKeyCode()==38) {
                    System.out.println("voice commander");
                    k = k-1;
                    if (k>=0) {
                        textArea.setText((String) pdrop.get(String.valueOf(k)));
                    } else {
                        k=0;
                        textArea.setText("");

                    }
                }

                if (e.getModifiers() == KeyEvent.CTRL_MASK && e.getKeyCode()==40) {
                    System.out.println("voice commander");
                    k = k+1;
                    if (k<pdrop.size()){
                        textArea.setText((String) pdrop.get(String.valueOf(k)));
                    }else {
                        k=pdrop.size()-1;
                        textArea.setText("");
                    }
                }


                //                if (e.getModifiers() == KeyEvent.CTRL_MASK && e.getKeyChar() == KeyEvent.VK_ENTER) {
                //change maxc os mattping to ctrl and enter button
                if (e.getModifiers() == KeyEvent.CTRL_MASK && e.getKeyChar() == KeyEvent.VK_ENTER) {
                    e.consume();
                    Beep.sound(2000, 150);

                    k();
                    int i = pdrop.size();

                    dd(String.valueOf(i), textArea.getText());
                    k = pdrop.size();




                    try {
                        String buttonSelected = "";
                        for (Enumeration<AbstractButton> buttons = untoggle.bg.getElements(); buttons.hasMoreElements(); ) {
                            AbstractButton button = buttons.nextElement();

                            if (button.isSelected()) {
                                buttonSelected = button.getText();
                            }
                        }

                        boolean deleteCommand = buttonSelected.equals("delete");
                        boolean deleteCommand2 = buttonSelected.equals("deldiary");
                        boolean isThoughtRecorderCommand = buttonSelected.equals("rec");
                        boolean isHow2ForegertCommand = buttonSelected.equals("fgt");
                        boolean isHow2ForegertCommand_u = textArea.getText().contains(" ufgt ");
                        boolean isload = buttonSelected.equals("laod");
                        boolean codja = buttonSelected.equals("codeja");
                        boolean saerchdiary = buttonSelected.equals("saerchdiary") && !buttonSelected.contains("saerchdiaryall");
                        boolean saerchdiaryall = buttonSelected.contains("saerchdiaryall");
                        boolean isShowCommand = buttonSelected.equals("sho");// shw
                        Search search = null;


                        boolean DdeleteCommand_X = buttonSelected.equals("Ddelete");
                        boolean DdeleteCommand2 = buttonSelected.equals("Ddeldiary");
                        boolean DisThoughtRecorderCommand_x = buttonSelected.equals("Drec");
                        boolean DisHow2ForegertCommand = buttonSelected.equals("Dfgt");
                        boolean DisHow2ForegertCommand_u = textArea.getText().contains(" Dufgt ");
                        boolean Disload = buttonSelected.equals("Dlaod");
                        boolean Dcodja_x = buttonSelected.equals("Dcodeja");
                        boolean Dsaerchdiary = buttonSelected.equals("Dsaerchdiary");
                        boolean DisShowCommand = buttonSelected.equals("Dsho");// shw
                        Search Dsearch = null;


                        boolean DldeleteCommand_X = buttonSelected.equals("LDdelete");
                        boolean DdleleteCommand2 = buttonSelected.equals("DdeldLiary");
                        boolean DislThoughtRecorderCommand_x = buttonSelected.equalsIgnoreCase("Drec");
                        boolean DisHlow2ForegertCommand = buttonSelected.equalsIgnoreCase("DLfgt");
                        boolean DisHolw2ForegertCommand_u = textArea.getText().contains("DufLgt");
                        boolean Disloald = buttonSelected.equals("DlaodL")&&(!buttonSelected.equals("DlaodLD"));
                        boolean Dcodja_lx = buttonSelected.equals("DcodeLja");
                        boolean Dsaerchdliary = buttonSelected.equals("DsaerLchdiary");
                        boolean DisShowColmmand = buttonSelected.equalsIgnoreCase("DshoL");// shw
                        Search Dsearclh = null;




                        boolean DldeleteCommandd_X = buttonSelected.equals("DLDdelete");
                        boolean DdleleteCoDmmand2 = buttonSelected.equals("DdeldLDiary");
                        boolean DislThoughtDRecorderCommand_x = buttonSelected.equalsIgnoreCase("Drec");
                        boolean DisHlow2ForeDgertCommand = buttonSelected.equalsIgnoreCase("DDLfgt");
                        boolean DisHolw2ForegDertCommand_u = textArea.getText().contains("DuDfLgt");
                        boolean DislDoald = buttonSelected.equals("DlaodLD");
                        boolean DcodjDa_lx = buttonSelected.equals("DcodeLDja");
                        boolean DsaercDhdliary = buttonSelected.equals("DsaerDLchdiary");
                        boolean DisShowDColmmand = buttonSelected.equalsIgnoreCase("DshoDL");// shw
                        Search DsearclhD = null;




                        boolean SDldeleteCommandd_X = buttonSelected.equals("DLDdSelete");
                        boolean DsLSDg = buttonSelected.equals("DsLSDg");
                        boolean SDdleleteCoDmmand2 = buttonSelected.equals("DdeldSLDiary");
                        boolean SDislThoughtDRecorderCommand_x = buttonSelected.equalsIgnoreCase("Drec");
                        boolean SDisHlow2ForeDgertCommand = buttonSelected.equalsIgnoreCase("DDLSfgt");
                        boolean SDisHolw2ForegDertCommand_u = textArea.getText().contains("DuSDfLgt");
                        boolean SDislDoald = buttonSelected.equals("DlaoSdLD");
                        boolean SDcodjDa_lx = buttonSelected.equals("DcodeLSDja");
                        boolean SDsaercDhdliary = buttonSelected.equals("DsaeSrDLchdiary");
                        boolean SDisShowDColmmand = buttonSelected.equalsIgnoreCase("DshSoDL");// shw
                        Search DSsearclhD = null;


                        boolean SDldeleteCommandd_Xf = buttonSelected.equals("DLDdSeletef");
                        boolean b = buttonSelected.startsWith("DsLSDgf");
                        boolean SDdleleteCoDmmand2f = buttonSelected.equals("DdeldSLDiaryf");
                        boolean SDislThoughtDRecorderCommand_xf = buttonSelected.equalsIgnoreCase("Drec");
                        boolean SDisHlow2ForeDgertCommandf = buttonSelected.equalsIgnoreCase("DDLSfgtf");
                        boolean SDisHolw2ForegDertCommand_uf = textArea.getText().contains("DuSDfLgtf");
                        boolean SDislDoaldf = buttonSelected.equals("DlaoSdLDf");
                        boolean SDcodjDa_lxf = buttonSelected.equals("DcodeLSDjaf");
                        boolean SDsaercDhdliaryf = buttonSelected.equals("DsaeSrDLchdiaryf");
                        boolean SDisShowDColmmandf = buttonSelected.equalsIgnoreCase("DshSoDLf");// shw
                        Search DSsearclhDf = null;




                        boolean SDisShowDColmmdandf = buttonSelected.equalsIgnoreCase("saercdhdiaryallf");// shw



                        boolean googleo = buttonSelected.equals("DsLDg");// shw


                        boolean findtheshotcut = buttonSelected.equalsIgnoreCase("DsLg");// shw




                        boolean findtheshotcutviode = buttonSelected.equalsIgnoreCase("Dsg");// shw


                        String searchTrs = "";

                        System.out.println(textArea.getText());
                        if (textArea.getText().indexOf("baby")==1 && textArea.getText().split(" ").length==2) {
                            Thread a = new Thread(() -> {
                                //find *Friends* C:/Users/SiyuanZeng's/Videos/Friends
                                    System.out.println(textArea.getText());
                                try {
                                    t.mains(textArea.getText().split(" ")[0],  textArea.getText().substring(5));
                                } catch (IOException e1) {
                                    e1.printStackTrace();
                                }

                            }
                            );
                            a.start();
                        }

                        else if (textArea.getText().equalsIgnoreCase("history")) {
                                String s = "";

                            Set<Object> objects = pdrop.keySet();
                            ArrayList<Object> keys = new ArrayList<Object>(objects);
                            for(int p=0; p<=keys.size()-1;p++){
                                s+=(String)(pdrop.get(String.valueOf(p))) + "\n";
                            }

                                textArea.setText(s);
                                textArea.moveCaretPosition(s.length()-1);

                        }


                        else if (textArea.getText().equalsIgnoreCase("siyuanzeng@hotmail")) {
                            TestGmail testGmail = new TestGmail();
                            try {
                                testGmail.testOpenLogin3();
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }

                        }

                        else if (textArea.getText().equalsIgnoreCase("abuizeng")) {
                            TestGmail testGmail = new TestGmail();
                                testGmail.testOpenLogin2();

                        }

                        else if (textArea.getText().equalsIgnoreCase("zengb45")) {
                            TestGmail testGmail = new TestGmail();
                                testGmail.testOpenLogin();

                        }

                        else if (textArea.getText().startsWith("history") && textArea.getText().split(" ").length==2) {
                                String s = "";


                            Set<Object> objects = pdrop.keySet();
                            ArrayList<Object> keys = new ArrayList<Object>(objects);

                            int i1 = Integer.parseInt(textArea.getText().split(" ")[1]);
                            int c = keys.size()- i1;
                            for(int p = c; p<=pdrop.size()-1; p++){
                                s+=(String)(pdrop.get(String.valueOf(p))) + "\n";
                            }

                                textArea.setText(s);
                                textArea.moveCaretPosition(s.length()-1);

                        }

                        else if (textArea.getText().startsWith("find ") && textArea.getText().split(" ").length==3) {
                            Thread a = new Thread(() -> {
                                //find *Friends* C:/Users/SiyuanZeng's/Videos/Friends
                                    System.out.println(textArea.getText());
                                    dk.mains(textArea.getText().split(" ")[1], textArea.getText().split(" ")[2]);

                            }
                            );
                            a.start();
                        }

                        else if (searchEngines.containsKey(textArea.getText().substring(0, 3))) {
                            String text = textArea.getText().trim();

                            if (!text.isEmpty()) {
                                Scanner in = new Scanner(text);
                                while (in.hasNext()) {
                                    String line = in.nextLine();
                                    if (line.length() > 4) {
                                        search = searchEngines.get(line.substring(0, 3));
                                        searchTrs = line.substring(3);
                                        search.setURI(searchTrs);

                                        r.o(search.getURIString());
                                    } else {
                                    }
                                }
                            }
                        }



                        /* this can have one more layer of abstraction so that the function can work wfor any strings
                        one
                        group
                        any


                        public static String generate(String str) {
        String textStr[] = str.split("\\r\\n|\\n|\\r");
        StringBuilder stringBuilder = new StringBuilder();

        // fin dthe first tone that doesn't have content


        for (int i = 0; i < textStr.length; i++) {
            String s  = textStr[i];
            if(s.split(":").length>1 ){
                if (s.split(":")[1].trim().isEmpty()!=true) {
                if(stringBuilder.length() > 0 ){
                    stringBuilder.append(r.plusANDplus);
                }
                switch (s.split(":")[0]) {
                    case "subjects(why does)": stringBuilder.append(r.INTEXT_HYPHEN + s.split(":")[1].trim().replace(r.SPACE, r.plusANDplusintextcolon)); break;
                    case "subjects(what is)": stringBuilder.append(r.INTEXT_HYPHEN + s.split(":")[1].trim().replace(r.SPACE, r.plusANDplusintextcolon)); break;
                    case "subjects(how to)": stringBuilder.append(r.INTEXT_HYPHEN + s.split(":")[1].trim().replace(r.SPACE, r.plusANDplusintextcolon)); break;
                    case "operation": stringBuilder.append(r.INTEXT_HYPHEN+s.split(":")[1].trim().replace(r.SPACE, r.plusANDplusintextcolon)); break;
                    case "os": stringBuilder.append(r.INTEXT_HYPHEN+s.split(":")[1].trim().replace(r.SPACE,  r.plusANDplusintextcolon)); break;
                    case "filetype": stringBuilder.append(s); break;
                }
            }}
        }

        stringBuilder.append(r.plusANDplusintextcolon+r.splitStringandAddOnebyone(predefined));

        return String.format("http://www.google.com/#tbs=li:1&q=%s", stringBuilder.toString());
    }

                         */

                        else if (textArea.getText().equalsIgnoreCase("music")) {

                            try {
                                TodoApp.dkk();
                            } catch (ClassNotFoundException e1) {
                                e1.printStackTrace();
                            } catch (InstantiationException e1) {
                                e1.printStackTrace();
                            } catch (IllegalAccessException e1) {
                                e1.printStackTrace();
                            } catch (UnsupportedLookAndFeelException e1) {
                                e1.printStackTrace();
                            }

                        }
                        else if (textArea.getText().equalsIgnoreCase("movie")) {

                                ListFilesUtil.pss("C:\\Users\\SiyuanZeng's\\Videos\\Movie");

                        }
                        else if (textArea.getText().equalsIgnoreCase("TodoApp")) {
                            try {
                                Thread a = new Thread(() -> {
                                    //find *Friends* C:/Users/SiyuanZeng's/Videos/Friends
                                    try {
                                main.k.TodoApp.todo();
                                    } catch (ClassNotFoundException e1) {
                                        e1.printStackTrace();
                                    } catch (InstantiationException e1) {
                                        e1.printStackTrace();
                                    } catch (IllegalAccessException e1) {
                                        e1.printStackTrace();
                                    } catch (UnsupportedLookAndFeelException e1) {
                                        e1.printStackTrace();
                                    }

                                }
                                );
                                a.start();
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            }

                        }


                        else if (textArea.getText().equalsIgnoreCase("interjections")) {
                            try {
                                Thread a = new Thread(() -> {
                                    //find *Friends* C:/Users/SiyuanZeng's/Videos/Friends
                                    try {
                                        main.j.hj.d.d();
                                    } catch (ClassNotFoundException e1) {
                                        e1.printStackTrace();
                                    } catch (InstantiationException e1) {
                                        e1.printStackTrace();
                                    } catch (IllegalAccessException e1) {
                                        e1.printStackTrace();
                                    } catch (UnsupportedLookAndFeelException e1) {
                                        e1.printStackTrace();
                                    }

                                }
                                );
                                a.start();
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            }
                        }

                        else if (deleteCommand) {
                            System.out.println("delete command");
                            prop.remove(textArea.getText());
                            textArea.setText("");
                        } else if (codja && textArea.getText().trim().isEmpty()) {
                            System.out.println("codja");
                            findthebestexample f = new findthebestexample(textArea);
                            f.returnshowsearchquetsry();
                        } else if (codja && !textArea.getText().trim().isEmpty()) {
                            System.out.println("codja");
                            findthebestexample f = new findthebestexample(textArea);
                            f.gogolesearchgsearch();
                        } else if (googleo && textArea.getText().trim().isEmpty()) {
                            System.out.println("codja");
                            gooogle f = new gooogle (textArea);
                            f.returnshowsearchquetsry();
                        } else if (googleo && !textArea.getText().trim().isEmpty()) {
                            System.out.println("codja");
                            gooogle f = new gooogle(textArea);
                            f.gogolesearchgsearch();
                        }  else if (findtheshotcut && textArea.getText().trim().isEmpty()) {
                            System.out.println("codja");
                            findtheshortcut f = new findtheshortcut (textArea);
                            f.returnshowsearchquetsry();
                        } else if (findtheshotcut && !textArea.getText().trim().isEmpty()) {
                            System.out.println("codja");
                            findtheshortcut f = new findtheshortcut(textArea);
                            f.gogolesearchgsearch();
                        } else if (findtheshotcutviode && textArea.getText().trim().isEmpty()) {
                            System.out.println("codja");
                            findtheshortcutyoutututouiral f = new findtheshortcutyoutututouiral(textArea);
                            f.returnshowsearchquetsry();
                        } else if (findtheshotcutviode&& !textArea.getText().trim().isEmpty()) {
                            System.out.println("codja");
                            findtheshortcutyoutututouiral f = new findtheshortcutyoutututouiral(textArea);
                            f.gogolesearchgsearch();
                        } else if (saerchdiary && !textArea.getText().trim().isEmpty()) {
                            System.out.println("saerchdiary ");
                            how2Forgert.searchehabins(textArea.getText().trim());
                        }  else if (saerchdiaryall && !textArea.getText().trim().isEmpty()) {
                            System.out.println("saerchdiary ");
                            how2Forgert.searchehabinsCombined(textArea.getText().trim());
                        } else if (isThoughtRecorderCommand) {
                            System.out.println("isThoughtRecorderCommand");
                            YouKnowWhat.insert(textArea.getText());
                            textArea.setText("");
                        } else if (isload) {
                            System.out.println("isload");
                            how2Forgert.load();
                            textArea.setText("");
                        } else if (deleteCommand2) {
                            System.out.println("deleteCommand2");
                            how2Forgert.deltask();
                            textArea.setText("");
                        } else if (isHow2ForegertCommand_u) {
                            System.out.println("isHow2ForegertCommand_u");
                            //init
                            how2Forgert.updatetask();
                            textArea.setText("");
                            How2Forgert.serialize();
                        } else if (isHow2ForegertCommand) {
                            System.out.println("isHow2ForegertCommand");
                            //init
                            how2Forgert.inster(textArea.getText(), "");
                            textArea.setText("");
                            How2Forgert.serialize();
                        } else if (isShowCommand) {
                            System.out.println("isShowCommand");
                            textArea.setText(takeC1toMe(textArea.getText()));
                            frame.repaint();
                            frame.toFront();
                        } else if (null != search) {
                            System.out.println("search");
                            search.setURI(searchTrs);
                            Desktop.getDesktop().browse(search.getURI());
                            logDictionary(search.searchName, search.keywords, search.getURIString());
                        }



                        else if (Dsaerchdiary && !textArea.getText().trim().isEmpty()) {
                            System.out.println("Dsaerchdiary");
                            dhow2Forgert.searchehabins(textArea.getText().trim());
                        } else if (Disload) {
                            System.out.println("Disload");
                            dhow2Forgert.load();
                            textArea.setText("");
                        } else if (DdeleteCommand2) {
                            System.out.println("DdeleteCommand2");
                            dhow2Forgert.deltask();
                            textArea.setText("");
                        } else if (DisHow2ForegertCommand_u) {
                            System.out.println("DisHow2ForegertCommand_u");
                            dhow2Forgert.updatetask();
                            textArea.setText("");
                            How2Forgert.serialize();
                        } else if (DisHow2ForegertCommand) {
                            System.out.println("DisHow2ForegertCommand");
                            dhow2Forgert.inster(textArea.getText(), "");
                            textArea.setText("");
                            How2Forgert.serialize();
                        } else if (DisShowCommand) {
                            System.out.println("DisShowCommand");
                            textArea.setText(takeC1toMe(textArea.getText()));
                            frame.repaint();
                            frame.toFront();
                        } else if (null != Dsearch) {
                            System.out.println("Dsearch");
                            search.setURI(searchTrs);
                            Desktop.getDesktop().browse(search.getURI());
                            logDictionary(search.searchName, search.keywords, search.getURIString());
                            textArea.setText("");
                        }





                        else if (Dsaerchdliary && !textArea.getText().trim().isEmpty()) {
                            System.out.println("Dsaerchdliary");
                            dhow2Forgertl.searchehabins(textArea.getText().trim());
                        } else if (Disloald ) {
                            System.out.println("Disloadl");
                            dhow2Forgertl.load();
                        } else if (DdleleteCommand2 ) {
                            System.out.println("DdeletleCommand2");
                            dhow2Forgertl.deltask();
                            textArea.setText("");
                        } else if (DisHolw2ForegertCommand_u) {
                            System.out.println("DisHolw2ForegertCommand_u");
                            dhow2Forgertl.updatetask();
                            textArea.setText("");
                            How2Forgert.serialize();
                        } else if (DisHlow2ForegertCommand ) {
                            System.out.println("DisHlow2ForegertCommand");
                            dhow2Forgertl.inster(textArea.getText(), "");
                            textArea.setText("");
                            How2Forgert.serialize();
                        } else if (DisShowColmmand) {
                            System.out.println("DislShowCommand");
                            textArea.setText(takeC1toMe(textArea.getText()));
                            frame.repaint();
                            frame.toFront();
                        } else if (null != Dsearclh) {
                            System.out.println("Dsearlch");
                            search.setURI(searchTrs);
                            Desktop.getDesktop().browse(search.getURI());
                            logDictionary(search.searchName, search.keywords, search.getURIString());
                            textArea.setText("");
                        }






                        else if (DsaercDhdliary && !textArea.getText().trim().isEmpty()) {
                            System.out.println("Dsaerchdliary");
                            dhow2ForgDertl.searchehabins(textArea.getText().trim());
                        } else if (DislDoald ) {
                            System.out.println("Disloadl");
                            dhow2ForgDertl.load();
                        } else if (DdleleteCoDmmand2 ) {
                            System.out.println("DdeletleCommand2");
                            dhow2ForgDertl.deltask();
                            textArea.setText("");
                        } else if (DisHolw2ForegDertCommand_u ) {
                            System.out.println("DisHolw2ForegertCommand_u");
                            dhow2ForgDertl.updatetask();
                            textArea.setText("");
                            How2Forgert.serialize();
                        } else if (DisHlow2ForeDgertCommand ) {
                            System.out.println("DisHlow2ForegertCommand");
                            dhow2ForgDertl.inster(textArea.getText(), "");
                            textArea.setText("");
                            How2Forgert.serialize();
                        } else if (DisShowDColmmand) {
                            System.out.println("DislShowCommand");
                            textArea.setText(takeC1toMe(textArea.getText()));
                            frame.repaint();
                            frame.toFront();
                        } else if (null != DsearclhD ) {
                            System.out.println("Dsearlch");
                            search.setURI(searchTrs);
                            Desktop.getDesktop().browse(search.getURI());
                            logDictionary(search.searchName, search.keywords, search.getURIString());
                            textArea.setText("");
                        }





                        else if (SDsaercDhdliary && !textArea.getText().trim().isEmpty()) {
                            System.out.println("Dsaerchdliary");
                            dhow2ForgDertls.searchehabins(textArea.getText().trim());
                        } else if (DsLSDg) {
                            System.out.println("Disloadl");
                        } else if (SDislDoald ) {
                            System.out.println("Disloadl");
                            dhow2ForgDertls.load();
                        } else if (SDdleleteCoDmmand2 ) {
                            System.out.println("DdeletleCommand2");
                            dhow2ForgDertls.deltask();
                            textArea.setText("");
                        } else if (SDisHolw2ForegDertCommand_u ) {
                            System.out.println("DisHolw2ForegertCommand_u");
                            dhow2ForgDertls.updatetask();
                            textArea.setText("");
                            How2Forgert.serialize();
                        } else if (SDisHlow2ForeDgertCommand ) {
                            System.out.println("DisHlow2ForegertCommand");
                            dhow2ForgDertls.inster(textArea.getText(), "");
                            textArea.setText("");
                            How2Forgert.serialize();
                        } else if (SDisShowDColmmand) {
                            System.out.println("DislShowCommand");
                            textArea.setText(takeC1toMe(textArea.getText()));
                            frame.repaint();
                            frame.toFront();
                        } else if (null != DSsearclhD ) {
                            System.out.println("Dsearlch");
                            search.setURI(searchTrs);
                            Desktop.getDesktop().browse(search.getURI());
                            logDictionary(search.searchName, search.keywords, search.getURIString());
                            textArea.setText("");
                        }







                        else if (SDsaercDhdliaryf && !textArea.getText().trim().isEmpty()) {
                            System.out.println("Dsaerchdliary");
                            dhow2ForgDertlsf.searchehabins(textArea.getText().trim());
                        }

                           else if (SDislDoaldf ) {
                            System.out.println("Disloadl");
                            dhow2ForgDertlsf.fjlasdjfl();
                        }
                           else if (SDldeleteCommandd_X ) {
                            System.out.println("Disloadl");
                            dhow2ForgDertlssf.fjlasdjfl();
                        }

                        else if (SDdleleteCoDmmand2f ) {
                            System.out.println("DdeletleCommand2");
                            dhow2ForgDertlsf.deltask();
                            textArea.setText("");
                        } else if (SDisHolw2ForegDertCommand_uf ) {
                            System.out.println("DisHolw2ForegertCommand_u");
                            dhow2ForgDertlsf.updatetask();
                            textArea.setText("");
                            How2Forgert.serialize();
                        } else if (SDisHlow2ForeDgertCommandf ) {
                            System.out.println("DisHlow2ForegertCommand");
                            dhow2ForgDertlsf.inster(textArea.getText(), "");
                            textArea.setText("");
                            How2Forgert.serialize();
                        } else if (SDisShowDColmmandf) {
                            System.out.println("DislShowCommand");
                            textArea.setText(takeC1toMe(textArea.getText()));
                            frame.repaint();
                            frame.toFront();
                        } else if (null != DSsearclhDf ) {
                            System.out.println("Dsearlch");
                            search.setURI(searchTrs);
                            Desktop.getDesktop().browse(search.getURI());
                            logDictionary(search.searchName, search.keywords, search.getURIString());
                            textArea.setText("");
                        }  else if (SDisShowDColmmdandf ) {
                            System.out.println("SDisShowDColmmdandf");
                            System.out.println("Dsaerchdliary");
                            dhow2ForgDertlsf.displayTask();
                            textArea.setText("");
                        }





                        else if (b) {
                            System.out.println("d");
                            a.d();
                        }



                        else if (SDcodjDa_lxf) {
                            System.out.println("asdf");
                            j.d();
                        }



                        else {
                            try {
                                insert();
                            } catch (AWTException e1) {
                                e1.printStackTrace();
                            }
                            textArea.setText("");
                        }
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    } catch (ParseException e1) {
                        e1.printStackTrace();
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTextAreaExample(frame, textArea, controlPanel);
            }
        });

        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //Add Textarea in to middle panel


        untoggle = new untoggle(frame, controlPanel, textArea, label, scroll);


//        SwingUtilities.invokeLater(() -> new buttons());

        //init
        c1s();
        c1ds();

        if (null == how2Forgert) {
            how2Forgert = new How2Forgert(c1comehere, textArea, frame);
        }
        how2Forgert.c1comehere = c1comehere;
        how2Forgert.textArea = textArea;
        how2Forgert.frame = frame;
        how2Forgert.init();


        if (null == dhow2Forgert) {
            dhow2Forgert = new zeng.siyuan.onceaday.How2Forgert(c1comehere, textArea, frame);
        }
        dhow2Forgert.c1comehere = c1comehere;
        dhow2Forgert.textArea = textArea;
        dhow2Forgert.frame = frame;
        dhow2Forgert.init();


        if (null == dhow2Forgertl) {
            dhow2Forgertl = new zeng.siyuan.onceaday.link.onceaday.How2Forgert(c1comehere, textArea, frame);
        }
        dhow2Forgertl.c1comehere = c1comehere;
        dhow2Forgertl.textArea = textArea;
        dhow2Forgertl.frame = frame;
        dhow2Forgertl.init();




        if (null == dhow2ForgDertl) {
            dhow2ForgDertl= new zeng.siyuan.onceaday.link.onceaday.document.onceaday.How2Forgert(c1comehere, textArea, frame);
        }
        dhow2ForgDertl.c1comehere = c1comehere;
        dhow2ForgDertl.textArea = textArea;
        dhow2ForgDertl.frame = frame;
        dhow2ForgDertl.init();






        if (null == dhow2ForgDertls) {
            dhow2ForgDertls= new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.How2Forgert(c1comehere, textArea, frame);
        }
        dhow2ForgDertls.c1comehere = c1comehere;
        dhow2ForgDertls.textArea = textArea;
        dhow2ForgDertls.frame = frame;
        dhow2ForgDertls.init();



        if (null == jd) {
            jd= new zeng.siyuan.onceaday.link.onceaday.document.onceaday.ssdd.onceaday.onceaday.asdf.asdf.asdf.How2Forgert(c1comehere, textArea, frame, jk);
        }
        jd.c1comehere = c1comehere;
        jd.textArea = textArea;
        jd.frame = frame;
        jd.init();


    }


    static {
        searchEngines.put("sg ", new Search("Bing", "sg ", "http://www.bing.com/search?q=%s", "+"));
        searchEngines.put("sd ", new Search("Dictionary", "sd ", "http://www.dictionary.com/browse/%s?s=t", "%20"));
        searchEngines.put("su ", new Search("UrbanDictionary", "su ", "http://www.urbandictionary.com/define.php?term=%s", "%20"));
        searchEngines.put("st ", new Search("Treasure", "st ", "http://www.thesaurus.com/browse/%s?s=t", "%20"));
        searchEngines.put("sy ", new Search("Youtube", "sy ", "https://www.youtube.com/results?search_query=%s", "+"));
        searchEngines.put("sm ", new Search("Gmail", "sm ", "https://mail.google.com/mail/u/0/#search/%s", "+"));
        searchEngines.put("si ", new Search("Image", "si ", "http://www.bing.com/images/search?q=%s", "+"));
        searchEngines.put("sl ", new Search("I'm Feeling Lucky", "sl ", "http://www.google.com/search?btnI=I%27m+Feeling+Lucky&ie=UTF-8&oe=UTF-8&q=", "+"));
        searchEngines.put("mv ", new Search("I'm Feeling Lucky", "mv ", "http://www.google.com/search?btnI=I%27m+Feeling+Lucky&ie=UTF-8&oe=UTF-8&q=maven+repository+", "+"));
        searchEngines.put("sb ", new Search("Baidu", "sb ", "https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=0&rsv_idx=1&tn=baidu&wd=%s", "%20"));
        searchEngines.put("gi ", new Search("Baidu", "gi ", "https://github.com/search?utf8=%E2%9C%93&q=%s", "+"));
    }

    public static void logDictionary(String search, String word, String uri) throws IOException, ParseException {

        String PATH = String.format("c:/c1/c1comehere/" + search + "/");
        File directory = new File(String.valueOf(PATH));
        if (!directory.exists()) {
            directory.mkdir();
        }

        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date();
        Date todayWithZeroTime = formatter.parse(formatter.format(today));

        RandomAccessFile r = new RandomAccessFile(new File("c:/c1/c1comehere/" + search + "/" + formatter.format(today) + ".txt"), "rw");
        RandomAccessFile rtemp = new RandomAccessFile(new File("c:/c1/c1comehere/" + search + "/" + formatter.format(today) + ".txt" + "~"), "rw");
        long fileSize = r.length();
        FileChannel sourceChannel = r.getChannel();
        FileChannel targetChannel = rtemp.getChannel();
        sourceChannel.transferTo(0, (fileSize - 0), targetChannel);
        sourceChannel.truncate(0);
        r.seek(0);
        r.writeBytes(System.getProperty("line.separator"));
        r.writeBytes(new Date().toString());
        r.writeBytes(System.getProperty("line.separator"));
        r.writeBytes(search + ": " + word);
        r.writeBytes(System.getProperty("line.separator"));
        r.writeBytes(uri);
        r.writeBytes(System.getProperty("line.separator"));
        long newOffset = r.getFilePointer();
        targetChannel.position(0L);
        sourceChannel.transferFrom(targetChannel, newOffset, (fileSize - 0));
        sourceChannel.close();
        targetChannel.close();
        System.out.println("Done");
    }

    public void insert() throws IOException, ParseException, AWTException {

        String textUpcase = new StringBuilder(textArea.getText()).toString();
        String text = textArea.getText();
        String path = "";
        String key = "";

        boolean isHttpCommand = textUpcase.contains("http://") || textUpcase.contains("https://");
        boolean isShortcutButExe = text.contains("=") && !text.contains(".exe") && !text.contains("http");
        boolean isExeShortcut = text.contains(".exe") && text.contains("=");
        if (isHttpCommand&&text.contains("=")&& text.indexOf("http") > text.indexOf("=")) {
            c1come2melater(textUpcase.split("=")[0], textUpcase.substring(textUpcase.indexOf("=") + 1));


            SolrDataDAO solrBaseDAO = null;
            try {
                solrBaseDAO = new SolrDataDAO();
            } catch (Exception e) {
                e.printStackTrace();
            }


            try {
                solrBaseDAO.addData(prop.size()+1, textUpcase.split("=")[0], textUpcase.substring(textUpcase.indexOf("=") + 1));
            } catch (Exception e1) {
                e1.printStackTrace();
            }



        } else if (isShortcutButExe&&text.contains("=")) {
            c1come2melater(text.split("=")[0], text.split("=")[1]);


            SolrDataDAO solrBaseDAO = null;
            try {
                solrBaseDAO = new SolrDataDAO();
            } catch (Exception e) {
                e.printStackTrace();
            }


                try {
                    solrBaseDAO.addData(prop.size()+1, text.split("=")[0], text.split("=")[1]);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
        }

        else if (isExeShortcut&&text.contains("=")) {
            key = text.substring(text.lastIndexOf("\\") + 1, text.lastIndexOf("."));
            c1come2melater(text.split("=")[0], text.split("=")[1]);


            SolrDataDAO solrBaseDAO = null;
            try {
                solrBaseDAO = new SolrDataDAO();
            } catch (Exception e) {
                e.printStackTrace();
            }


                try {
                    solrBaseDAO.addData(prop.size()+1, text.split("=")[0], text.split("=")[1]);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

        }

        else {
            if (text.contains(".exe") && !text.contains("=")) {
                key = text.substring(text.lastIndexOf("\\") + 1, text.indexOf("."));
                c1come2melater(key, text);



                SolrDataDAO solrBaseDAO = null;
                try {
                    solrBaseDAO = new SolrDataDAO();
                } catch (Exception e) {
                    e.printStackTrace();
                }


                    try {
                        solrBaseDAO.addData(prop.size()+1, key, text);
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }

            } else {
                if (text.contains("c:") && !key.trim().isEmpty() && text.contains("=")) {
                    if (text.contains(".") && (text.substring(text.indexOf(".") + 1).equalsIgnoreCase("exe") || text.substring(text.indexOf(".") + 1).equalsIgnoreCase("jar"))) {
                        key = text.substring(text.lastIndexOf("\\") + 1, text.indexOf("."));
                    } else {
                        key = text.substring(text.lastIndexOf("\\") + 1);
                    }
                    if(!key.trim().isEmpty()&&text.contains("=")&&text.trim().isEmpty()!=true)
                    c1come2melater(key.toLowerCase(), text);



                    SolrDataDAO solrBaseDAO = null;
                    try {
                        solrBaseDAO = new SolrDataDAO();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                        try {
                            solrBaseDAO.addData(prop.size() + 1, key.toLowerCase(), text);
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }




                } else if (text.contains("c:") && key.trim().isEmpty()) {
                    Desktop.getDesktop().open(new File(text.trim()));
                } else if (textArea.getText().split("\\r\\n|\\n|\\r")[0].equalsIgnoreCase("song") && (text.contains("http:")||text.contains("https:")) && key.trim().isEmpty()) {
                    String textStr[] = textArea.getText().split("\\r\\n|\\n|\\r");
                    StringBuffer stringBuffer1 = new StringBuffer();
                    for (int i = 1; i < textStr.length; i++) {
                        stringBuffer1.append(textStr[i]);
                    }
                    d(String.valueOf(jk.size()+1), stringBuffer1.toString());


                } else if ((text.contains("http:")||text.contains("https:")) && key.trim().isEmpty()) {
                    try {
                        openUrlInBrowser(text);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    if (!prop.containsKey(text.trim()) && !text.contains(".")) {
                        for (Object e : prop.keySet()) {
                            String tem = (String) e;
                            if (tem.equals(text)) {
                                path = (String) prop.get(tem);
                            }
                        }
                    } else {
                        path = (String) prop.get(text.trim().replace(".", "")) == null ? "" : (String) prop.get(text.trim().replace(".", ""));
                    }
// so deep ho w am i supposed to find it here
                    if ((null != path && !path.isEmpty()) && (path.contains("http://") || path.contains("https://"))) {
                        try {
                            openUrlInBrowser(path);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if ((text.contains("sd") && text.equals("sd")) || (text.contains("shutdown") && text.equals("shutdown"))) {
                        Runtime.getRuntime().exec("shutdown.exe -s -t 0");
                        // what the fuck si the else mean?
                    } else if (null == path || path.trim().isEmpty()) {
                        Desktop.getDesktop().open(new File(text.trim()));
                    } else {
                        Desktop.getDesktop().open(new File(path));

                        if (path.contains("Snagit")) {
                            try {
                                Thread.sleep(Long.parseLong("10000"));
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            Robot r = new Robot();
                            int D = KeyEvent.VK_CONTROL;
                            int Da = KeyEvent.VK_SHIFT;
                            int Dc = KeyEvent.VK_F11;
                            r.keyPress(D);
                            r.keyPress(Da);
                            r.keyPress(Dc);

                            r.keyRelease(D);
                            r.keyRelease(Da);
                            r.keyRelease(Dc);





                        }

                    }
                }
            }
        }
    }



    private void openUrlInBrowser(String url) {
        try {
            Desktop.getDesktop().browse(new URL(url).toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

}
