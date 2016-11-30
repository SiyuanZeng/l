package zeng.siyuan.button;

/**
 * Created by SiyuanZeng's on 9/5/2016.
 */

import javax.swing.*;
import java.awt.*;

public class togglebutton {
    public static void main(String args[]) {
        JFrame f = new JFrame("JToggleButton Sample");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container content = f.getContentPane();
        content.add(new JToggleButton("North"), BorderLayout.NORTH);
        content.add(new JToggleButton("East"), BorderLayout.EAST);
        content.add(new JToggleButton("West"), BorderLayout.WEST);
        content.add(new JToggleButton("Center"), BorderLayout.CENTER);
        content.add(new JToggleButton("South"), BorderLayout.SOUTH);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
