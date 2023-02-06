package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {


    JFrame frame;
    JTextField textField;
    JButton[] numButtons = new JButton[10];
    JButton[] funButtons = new JButton[8];
    JButton add, sub, mul, div;
    JButton dec, equ, del, clr;

    JPanel buttonPanel;
    Font font  = new Font("Ink Free", Font.BOLD,30);

    double num1=0, num2=0,result=0;
    char operator;

    Calculator(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);


        textField = new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(font);
        textField.setEditable(false); //Use this for picross


        //Operation Button
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");

        dec = new JButton(".");
        equ = new JButton("=");
        del = new JButton("Delete");
        clr = new JButton("Clear");

        funButtons[0] = add;
        funButtons[1] = sub;
        funButtons[2] = mul;
        funButtons[3] = div;

        funButtons[4] = dec;
        funButtons[5] = equ;
        funButtons[6] = del;
        funButtons[7] = clr;


        for(int i = 0;i<8;i++){
            funButtons[i].addActionListener(this);
            funButtons[i].setFont(font);
            funButtons[i].setFocusable(false);
        }

        for(int i = 0;i<10;i++){
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
            numButtons[i].setFont(font);
            numButtons[i].setFocusable(false);
        }

        del.setBounds(50,430,145,50);
        clr.setBounds(205,430,145,50);

        buttonPanel = new JPanel();
        buttonPanel.setBounds(50,100,300,300);
        buttonPanel.setLayout(new GridLayout(4,4,10,10));


        buttonPanel.add(numButtons[1]);
        buttonPanel.add(numButtons[2]);
        buttonPanel.add(numButtons[3]);
        buttonPanel.add(add);

        buttonPanel.add(numButtons[4]);
        buttonPanel.add(numButtons[5]);
        buttonPanel.add(numButtons[6]);
        buttonPanel.add(sub);

        buttonPanel.add(numButtons[7]);
        buttonPanel.add(numButtons[8]);
        buttonPanel.add(numButtons[9]);


        buttonPanel.add(mul);
        buttonPanel.add(dec);
        buttonPanel.add(numButtons[0]);
        buttonPanel.add(equ);
        buttonPanel.add(div);

        frame.add(buttonPanel);
        frame.add(del);
        frame.add(clr);
        frame.add(textField);
        frame.setVisible(true);

    }

    public static void main(String[]args){
        Calculator calc = new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<10;i++){
            if(e.getSource() == numButtons[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        if(e.getSource() == dec){
            textField.setText(textField.getText().concat("."));
        }

        //Add
        if(e.getSource() == add){
           num1 = Double.parseDouble(textField.getText());
           operator = '+';
            textField.setText("");
        }

        //Sub
        if(e.getSource() == sub){
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }

        //Multiply
        if(e.getSource() == mul){
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        //Div
        if(e.getSource() == div){
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        if(e.getSource() == equ){
            num2=Double.parseDouble(textField.getText());
            switch(operator){

                case '+':
                    result=num1+num2;
                    break;

                case '-':
                    result=num1-num2;
                    break;

                case '*':
                    result=num1*num2;
                    break;

                case '/':
                    result=num1/num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;


//            if(e.getSource() == clr){
//                textField.setText("");
//            }

            if(e.getSource() == del){
                String string = textField.getText();
                textField.setText("");
                for(int i = 0;i<string.length()-1;i++){
                    textField.setText(textField.getText()+string.charAt(i));
                }

            }

        }

    }
}
