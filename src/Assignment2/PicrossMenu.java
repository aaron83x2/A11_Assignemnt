package Assignment2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PicrossMenu extends JFrame implements ActionListener {




    PicrossMenu(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] sizes = {"5x5","6x6","7x7"};
//        this.setSize(420,550);
//        this.setLayout(null);
        JComboBox comboBox = new JComboBox(sizes);

        this.add(comboBox);



        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
