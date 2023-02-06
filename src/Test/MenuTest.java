package Test;

import javax.naming.ldap.ExtendedRequest;
import javax.swing.*;
import java.awt.*;

public class MenuTest {



    public static void main(String[]args){

        new MenuTest();
    }


    public MenuTest(){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
//        frame.setLayout(null);
        frame.setSize(800,600);

        JTextPane text = new JTextPane();
        frame.add(text);


        //Tabs btw
//        JTabbedPane tab = new JTabbedPane();
//        frame.add(tab);
//        JLabel label1 = new JLabel("This is Tab 1");
//        JLabel label2 = new JLabel("This is Tab 2");
//        tab.add("Tab 1",label1);
//        tab.add("Tab 2",label2);

//        frame.setVisible(true);

        //Panel
//        JPanel panel = new JPanel();
//        panel.setBounds(180,142,320,300);
//        panel.setBackground(Color.black);
//        frame.add(panel);

        //Images

//        //Label
//        JLabel label = new JLabel("Text");
//        label.setBounds(180,442,  0,49);
//        frame.add(label);


    }



}
