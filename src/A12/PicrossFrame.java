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
     * Panels Around the grid
     */
    JPanel topPanel, bottomPanel, rightPanel, leftPanel, pointsPanel;

    /**
     * The Nums.
     */
    JTextField[] nums = new JTextField[11];

    /**
     * The Grid size.
     */
    int gridSize = 25;
    /**
     * The Button panel.
     */
    JPanel buttonPanel;
    /**
     * The Buttons.
     */
    JButton[] buttons = new JButton[gridSize];
    /**
     * The Col.
     */
    int col = 1, /**
     * The Row.
     */
    row = 0; //Row Right //Col down

    /**
     * The Menu.
     */
// Menu, Check, Reset
    JButton menu, /**
     * The Check.
     */
    check, /**
     * The Reset.
     */
    reset;

    /**
     * The Points title.
     */
    JTextField pointsTitle;
    /**
     * The Counter.
     */
    JTextField counter;
    /**
     * The History area.
     */
    JTextArea historyArea;
    /**
     * The Timer.
     */
    JTextField timer;
    /**
     * The Time count.
     */
    JTextField timeCount;
    /**
     * The Seconds.
     */
    int seconds;

    /**
     * Instantiates and creates a new Picross frame using java swing and awt.
     * @param picross_game the picross game
     */
    PicrossFrame(String picross_game){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit when window is closed
        this.setLayout(null);
        this.setBounds(950,250,800,670);
        this.setTitle("Picross");
        this.setVisible(true);

        this.setExtendedState(this.MAXIMIZED_BOTH);

        //Left panel numbers
        nums[1] = new JTextField();
        nums[1].setEditable(false);
        nums[1].setText("(1)");
        nums[1].setHorizontalAlignment(JTextField.CENTER);
        nums[1].setBounds(90,145, 90,55);
        nums[1].setBackground(Color.GRAY);
        nums[1].setBorder(null);
        this.add(nums[1]);

        nums[2] = new JTextField();
        nums[2].setEditable(false);
        nums[2].setText("(1)");
        nums[2].setHorizontalAlignment(JTextField.CENTER);
        nums[2].setBounds(90,200,90,55);
        nums[2].setBackground(Color.GRAY);
        nums[2].setBorder(null);
        this.add(nums[2]);

        nums[3] = new JTextField();
        nums[3].setEditable(false);
        nums[3].setText("(2)");
        nums[3].setHorizontalAlignment(JTextField.CENTER);
        nums[3].setBounds(90,260,90,55);
        nums[3].setBackground(Color.GRAY);
        nums[3].setBorder(null);
        this.add(nums[3]);

        nums[4] = new JTextField();
        nums[4].setEditable(false);
        nums[4].setText("(2)");
        nums[4].setHorizontalAlignment(JTextField.CENTER);
        nums[4].setBounds(90,320,90,55);
        nums[4].setBackground(Color.GRAY);
        nums[4].setBorder(null);
        this.add(nums[4]);

        nums[5] = new JTextField();
        nums[5].setEditable(false);
        nums[5].setText("(1 1)");
        nums[5].setHorizontalAlignment(JTextField.CENTER);
        nums[5].setBounds(90,385,90,55);
        nums[5].setBackground(Color.GRAY);
        nums[5].setBorder(null);
        this.add(nums[5]);

        //Top Panel Numbers
        nums[6] = new JTextField();
        nums[6].setEditable(false);
        nums[6].setText("(3)");
        nums[6].setHorizontalAlignment(JTextField.CENTER);
        nums[6].setBounds(180,90, 65,55);
        nums[6].setBackground(Color.GRAY);
        nums[6].setBorder(null);
        this.add(nums[6]);

        nums[7] = new JTextField();
        nums[7].setEditable(false);
        nums[7].setText("(1)");
        nums[7].setHorizontalAlignment(JTextField.CENTER);
        nums[7].setBounds(245,90, 65,55);
        nums[7].setBackground(Color.GRAY);
        nums[7].setBorder(null);
        this.add(nums[7]);

        nums[8] = new JTextField();
        nums[8].setEditable(false);
        nums[8].setText("(1)");
        nums[8].setHorizontalAlignment(JTextField.CENTER);
        nums[8].setBounds(310,90, 65,55);
        nums[8].setBackground(Color.GRAY);
        nums[8].setBorder(null);
        this.add(nums[8]);

        nums[8] = new JTextField();
        nums[8].setEditable(false);
        nums[8].setText("(1)");
        nums[8].setHorizontalAlignment(JTextField.CENTER);
        nums[8].setBounds(310,90, 65,55);
        nums[8].setBackground(Color.GRAY);
        nums[8].setBorder(null);
        this.add(nums[8]);

        nums[9] = new JTextField();
        nums[9].setEditable(false);
        nums[9].setText("(1)");
        nums[9].setHorizontalAlignment(JTextField.CENTER);
        nums[9].setBounds(373,90, 65,55);
        nums[9].setBackground(Color.GRAY);
        nums[9].setBorder(null);
        this.add(nums[9]);

        nums[10] = new JTextField();
        nums[10].setEditable(false);
        nums[10].setText("(1)");
        nums[10].setHorizontalAlignment(JTextField.CENTER);
        nums[10].setBounds(435,90, 65,55);
        nums[10].setBackground(Color.GRAY);
        nums[10].setBorder(null);
        this.add(nums[10]);

        //Left Panel
        leftPanel = new JPanel();
        leftPanel.setBackground(Color.GRAY);
        leftPanel.setBounds(90,145, 90,300);
        this.add(leftPanel);

        //Top Panel
        topPanel = new JPanel();
        topPanel.setBackground(Color.GRAY);
        topPanel.setBounds(180,90, 320,55);
        this.add(topPanel);

        //History Area
        historyArea = new JTextArea();
        historyArea.setBounds(510,155, 119,225);
        historyArea.setEditable(false);
        historyArea.setText("Text");
        historyArea.append("\n");
        this.add(historyArea);

        //Timer
        timer = new JTextField();
        timer.setBounds(525,400,39,39);
        timer.setEditable(false);
        timer.setText("Time: ");
        timer.setBackground(Color.GRAY);
        timer.setBorder(null);
        this.add(timer);

        timeCount = new JTextField();
        timeCount.setBounds(565,400,39,39);
        timeCount.setEditable(false);
        timeCount.setText("0" + "s");
        timeCount.setBackground(Color.WHITE);
        this.add(timeCount);


        //Right Panel
        rightPanel = new JPanel();
        rightPanel.setBackground(Color.GRAY);
        rightPanel.setBounds(500,145, 140,300);
        this.add(rightPanel);

        //Bottom Panel
        bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.GRAY);
        bottomPanel.setBounds(180,445, 320,55);
        this.add(bottomPanel);

        //Button Grid - 25 Buttons
        buttonPanel = new JPanel();
        buttonPanel.setBounds(180,142,320,300);
        buttonPanel.setLayout(new GridLayout(5,5));

        for(int i = 0; i< buttons.length;i++){
            buttons[i] = new JButton();
            buttons[i].setBackground(Color.WHITE);
            buttons[i].addActionListener(this);
            buttons[i].setFocusable(false);
            buttonPanel.add(buttons[i]);
        }
        this.add(buttonPanel);

        //Check button
        check = new JButton();
        check.setText("Check");
        check.setBounds(90,90,90,55);
        check.addActionListener(this);
        this.add(check);

        //Menu Button
        menu = new JButton();
        menu.setText("Menu");
        menu.setBounds(90,445,90,55);
        menu.addActionListener(this);
        this.add(menu);

        //Reset Button
        reset = new JButton();
        reset.setText("Reset");
        reset.setBounds(525,450,90,45);
        reset.addActionListener(this);
        this.add(reset);

        //Points Counter
        counter = new JTextField();
        counter.setBounds(565,90,40,40);
        counter.setEditable(false);
        counter.setText("0");
        this.add(counter);

        //Points Title
        pointsTitle = new JTextField();
        pointsTitle.setBounds(525,90,80,39);
        pointsTitle.setBorder(null);
        pointsTitle.setEditable(false);
        pointsTitle.setBackground(Color.GRAY);
        pointsTitle.setText("Points");
        this.add(pointsTitle);

    }

    /**
     * Main Class to .
     * @param args the args
     */
    public static void main(String[]args){
        PicrossFrame frame = new PicrossFrame("Picross Game");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == check){
            historyArea.setText("Check Clicked");
        }

        if(e.getSource() == menu){
            historyArea.setText("Menu Clicked");
        }

        if(e.getSource() == reset){
            historyArea.setText("Reset");
            col = 1;
            row = 1;

            for(int i = 0; i<gridSize;i++){
                buttons[i].setBackground(Color.WHITE);
            }
        }
            for(int i = 0; i<gridSize;i++) {
                if (e.getSource() == buttons[i]) {

                        buttons[i].setBackground(Color.CYAN);
                        row = (i+1);
                        historyArea.setText("Pos: "+String.valueOf(col));
//                                +","+String.valueOf(row));
                        if(row >=5){
                            row=0;
                        }
;

                }
            }
    }
}
