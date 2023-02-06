package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridTest extends JFrame implements ActionListener {



    public static void main(String[]args){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(950,250,800,670);
        frame.setLayout(null);


        JPanel panel = new JPanel();
        panel.setBounds(180,142,320,300);
        panel.setLayout(new GridLayout(5,5));
        panel.setBackground(Color.CYAN);

        frame.add(panel);
        frame.setVisible(true);

        JButton[] button = new JButton[25];

        for(int i = 0;i< button.length;i++){
            button[i] = new JButton();
            panel.add(button[i]);

        }
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}
