package A12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * The type Picross frame.
 */
public class PicrossFrame extends JFrame implements ActionListener {

    /**
     * The Col.
     */
    int col = 5;
    /**
     * The Row.
     */
    int row = 5;
    /**
     * The Grid size.
     */
    int gridSize = 25;
    /**
     * The Buttons.
     */
    JButton buttons[] = new JButton[gridSize];
    /**
     * The Mark.
     */
    Checkbox mark;
    /**
     * The Nums.
     */
    JTextField[] nums = new JTextField[10];
    /**
     * The Menu.
     */
    JButton menu, /**
     * The Reset.
     */
    reset;
    /**
     * The History area.
     */
    JTextArea historyArea;


    /**
     * Instantiates a new Picross frame.
     */
    public PicrossFrame(){

        //Window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1000,700);
        this.setLayout(new BorderLayout());
        this.setVisible(true);


        //Left Side
        JPanel left = new JPanel();
        left.setPreferredSize(new Dimension(142,100));
        left.setLayout(new GridLayout(5,1));


        for(int  i = 0; i<5;i++){
            nums[i] = new JTextField();
            nums[i].setEditable(false);
            nums[i].setText("(1)");
            nums[i].setHorizontalAlignment(JTextField.CENTER);
            nums[i].setBorder(null);
            left.add(nums[i]);
        }
        //West Panel
        this.add(left, BorderLayout.WEST);

        //Top
        JPanel top = new JPanel();
        top.setPreferredSize(new Dimension(100,100));
        top.setLayout(new GridLayout(1,col));

        //Mark Checkbox
        mark = new Checkbox("Mark");
        mark.setSize(100,100);
        mark.setBackground(Color.WHITE);
        top.add(mark);


        for(int i = 0; i<5;i++){
            nums[i] = new JTextField();
            nums[i].setEditable(false);
            nums[i].setText("(1)");
            nums[i].setHorizontalAlignment(JTextField.CENTER);
            nums[i].setBorder(null);
            top.add(nums[i]);
        }

        //Right Side
        JPanel right = new JPanel();
        right.setPreferredSize(new Dimension(141,100));

        //History Text Area
        historyArea = new JTextArea();
        historyArea.setPreferredSize(new Dimension(120,360));
        historyArea.setEditable(false);
        historyArea.setText("History");
        right.add(historyArea);

        //Time
        JTextArea time = new JTextArea();
        time.setBackground(Color.WHITE);
        time.setPreferredSize(new Dimension(100,35));
        time.setText("Time: " + 0);
        right.add(time);

        this.add(right, BorderLayout.EAST);

        //Center Buttons
        JPanel cnt = new JPanel();
        cnt.setPreferredSize(new Dimension(100,100));
        cnt.setBackground(Color.LIGHT_GRAY);
        cnt.setLayout(new GridLayout(row,col));

        for(int  i = 0; i<25;i++){
            buttons[i] = new JButton();
            buttons[i].addActionListener(this);
            buttons[i].setFocusable(false);
            cnt.add(buttons[i]);
        }
        this.add(cnt,BorderLayout.CENTER);

        JTextField pointsTitle = new JTextField();
        pointsTitle.setBorder(null);
        pointsTitle.setEditable(false);
        pointsTitle.setBackground(Color.LIGHT_GRAY);
        pointsTitle.setText("Points: " + 0);
        top.add(pointsTitle);

        this.add(top,BorderLayout.NORTH);

        //Bottom Panel
        JPanel bottom = new JPanel();
        bottom.setPreferredSize(new Dimension(100,100));
        bottom.setLayout(new FlowLayout(FlowLayout.LEFT));

        //Menu Button
        menu  = new JButton();
        menu.addActionListener(this);
        menu.setText("Menu");
        menu.setPreferredSize(new Dimension(140,50));
        bottom.add(menu);

        //Picross Logo
        JLabel image  = new JLabel();
        image.setBackground(Color.ORANGE);
        image.setIcon(new ImageIcon("src//picrossLogo.png"));
        image.setHorizontalAlignment(JLabel.CENTER);
        image.setPreferredSize(new Dimension(695,50));
        bottom.add(image);

        //Reset Button
        reset = new JButton();
        reset.setText("Reset");
        reset.addActionListener(this);
        reset.setPreferredSize(new Dimension(120,50));
        bottom.add(reset);
        this.add(bottom, BorderLayout.SOUTH);


    }


    /**
     * Main Method Calls itself to open the JFrame.
     *
     * @param args the args
     */
    public static void main(String[]args){
        PicrossFrame main = new PicrossFrame();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for(int i = 0; i< buttons.length; i++) {
            if (e.getSource() == buttons[i]) {
                //Light Button at index i Cyan
                buttons[i].setBackground(Color.CYAN);
                historyArea.setText("Selected Square: "+i);
            }
        }
        //If the reset button is pressed
        if(e.getSource() == reset){
            historyArea.setText("Reset Clicked");
            //All button colors reset back to white
            for(int i = 0; i<gridSize;i++){
                buttons[i].setBackground(Color.WHITE);
            }
        }
        //If menu option is Selected
        if(e.getSource() == menu){
            historyArea.setText("Menu Clicked");
        }
    }
}
