package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame implements ActionListener{


    JPanel panel;
    JButton button;
    static JTextField textField;


    public Test(){

    }


    public static void main(String[]args){

        textField = new JTextField();
        textField.setBounds(50,25,300,50);
//        textField.setFont(font);
        textField.setEditable(false); //Use this for picross




    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
