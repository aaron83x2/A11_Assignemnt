package A12;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * The type Picross menu.
 */
public class PicrossMenu extends JFrame implements ActionListener {



    JButton okButton, cancelButton;


    /**
     * Instantiates a new Picross menu.
     */
    PicrossMenu(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(950,250,220,220);
        this.setTitle("Main Menu");
        this.setVisible(true);

        //Grid Sizes
        JTextField size = new JTextField();
        size.setText("Picross Game Sizes");
        size.setBounds(50,20,110,30);
        size.setEditable(false);
        size.setBorder(null);
        this.add(size);

        //Grid size Options
        String[] gridSizes = {"5x5","6x6","7x7", "8x8"};
        JComboBox sizes = new JComboBox(gridSizes);
        sizes.setBounds(50,50,60,30);
        this.add(sizes);

        //Language
        JTextField langs = new JTextField();
        langs.setBounds(50,80,110,30);
        langs.setText("Languages");
        langs.setEditable(false);
        langs.setBorder(null);
        this.add(langs);

        //Language Options
        String[] langOptions = {"English","French"};
        JComboBox languages = new JComboBox(langOptions);
        languages.setBounds(50,110,80,30);
        this.add(languages);

        //Ok button
        okButton = new JButton();
        okButton.setText("Ok");
        okButton.setBounds(50,150,50,30);
        okButton.addActionListener(this);
        this.add(okButton);

        //Cancel Button
        cancelButton = new JButton();
        cancelButton.setText("Cancel");
        cancelButton.setBounds(105,150,80,30);
        cancelButton.addActionListener(this);
        this.add(cancelButton);


    }

    /**
     * Main Menu
     * @param args
     */
    public static void main(String[]args){
        PicrossMenu menu = new PicrossMenu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource() == okButton){
            PicrossFrame game = new PicrossFrame("Picross");
            this.setVisible(false);
        }

    }
}
