/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author hp
 */
public class calc extends JFrame implements ActionListener{
    private JTextField text;
    private JPanel panel;
    private JButton button1,button2,button3,button4 ,button5,button6,
            button7,button8,button9,button10,button11,button12,
            button13,button14,button15,button16,button17,button18,button19,button20;
     public static String opt = "";
     public static int num_new1 = 0;
     public static int num_new2 = 0;
    public calc(){
     setTitle("Java Calculator");
     setSize(500, 500);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLocation(400,100);
     
      panel = new JPanel();
      panel.setBackground(Color.BLACK);
      panel.setLayout(null);
      add(panel);
     
      text = new JTextField();
      text.setBounds(0,0, 477,50);
      text.setFont(new Font("Serif",Font.BOLD,35));
      text.setHorizontalAlignment(SwingConstants.RIGHT);
      panel.add(text);
      
      button1 = new JButton("C");
      button1.setBounds(10,60,100,50);
      button1.addActionListener(this);
      panel.add(button1);
      
      button2 = new JButton("%");
      button2.setBounds(130,60,100,50);
      button2.addActionListener(this);
      panel.add(button2);
      
      button3 = new JButton("Del");
      button3.setBounds(250,60,100,50);
      button3.addActionListener(this);
      panel.add(button3);
      
      /////////////////////////////////////////
      
       button4 = new JButton("7");
      button4.setBounds(10,130,100,50);
      button4.addActionListener(this);
      panel.add(button4);
      
      button5 = new JButton("8");
      button5.setBounds(130,130,100,50);
      button5.addActionListener(this);
      panel.add(button5);
      
      button6 = new JButton("9");
      button6.setBounds(250,130,100,50);
      button6.addActionListener(this);
      panel.add(button6);
      
      /////////////////////////////////
      button7 = new JButton("4");
      button7.setBounds(10,210,100,50);
      button7.addActionListener(this);
      panel.add(button7);
      
      button8 = new JButton("5");
      button8.setBounds(130,210,100,50);
      button8.addActionListener(this);
      panel.add(button8);
      
      button9 = new JButton("6");
      button9.setBounds(250,210,100,50);
      button9.addActionListener(this);
      panel.add(button9);
      
      //////////////////////////////////////
      button10 = new JButton("1");
      button10.setBounds(10,290,100,50);
      button10.addActionListener(this);
      panel.add(button10);
      
      button11 = new JButton("2");
      button11.setBounds(130,290,100,50);
      button11.addActionListener(this);
      panel.add(button11);
      
      button12 = new JButton("3");
      button12.setBounds(250,290,100,50);
      button12.addActionListener(this);
      panel.add(button12);
      //////////////////////////////
      
      button13 = new JButton("00");
      button13.setBounds(10,370,100,50);
      button13.addActionListener(this);
      panel.add(button13);
      
      button14 = new JButton("0");
      button14.setBounds(130,370,100,50);
      button14.addActionListener(this);
      panel.add(button14);
      
      button20 = new JButton(".");
      button20.setBounds(250,370,100,50);
      button20.addActionListener(this);
      panel.add(button20);
      ////////////////////////////////
      
      button15 = new JButton("÷");
      button15.setBounds(370,60,100,50);
      button15.addActionListener(this);
      panel.add(button15);
      
      button16 = new JButton("X");
      button16.setBounds(370,130,100,50);
      button16.addActionListener(this);
      panel.add(button16);
      
      button17 = new JButton("-");
      button17.setBounds(370,210,100,50);
      button17.addActionListener(this);
      panel.add(button17);
      
      button18 = new JButton("+");
      button18.setBounds(370,290,100,50);
      button18.addActionListener(this);
      panel.add(button18);
      
      button19 = new JButton("=");
      button19.setBounds(370,370,100,50);
      button19.addActionListener(this);
      panel.add(button19);
     setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
     if(e.getSource()==button4){
         String str = text.getText();
         text.setText(str + "7");
     } else if(e.getSource()==button5){
         String str = text.getText();
         text.setText(str + "8");
     } else if(e.getSource()==button6){
         String str = text.getText();
          text.setText(str + "9");
     }else if(e.getSource()==button7){
         String str = text.getText();
           text.setText(str + "4");
     }else if(e.getSource()==button8){
         String str = text.getText();
           text.setText(str + "5");
     }else if(e.getSource()==button9){
         String str = text.getText();
           text.setText(str + "6");
     }else if(e.getSource()==button10){
         String str = text.getText();
           text.setText(str + "1");
     }else if(e.getSource()==button11){
         String str = text.getText();
           text.setText(str + "2");
     }else if(e.getSource()==button12){
         String str = text.getText();
           text.setText(str + "3");
     }else if(e.getSource()==button13){
         String str = text.getText();
           text.setText(str + "00");
     }else if(e.getSource()==button14){
         String str = text.getText();
           text.setText(str + "0");
     }else if(e.getSource()==button20){
         String str = text.getText();
           text.setText(str + ".");
     }else if(e.getSource()==button1){
           text.setText("");
     }else if(e.getSource()==button18){ /// + button
           opt = button18.getText();
           String num = text.getText(); //will store the first set of numbers
           text.setText(""); // will clear text field          
           num_new1 = Integer.parseInt(num);
     }else if(e.getSource()==button16){ /// X button
           opt = button16.getText();
           String num = text.getText(); //will store the first set of numbers
           text.setText(""); // will clear text field          
           num_new1 = Integer.parseInt(num);
     }else if(e.getSource()==button17){ ///- button
           opt = button17.getText();
           String num = text.getText(); //will store the first set of numbers
           text.setText(""); // will clear text field          
           num_new1 = Integer.parseInt(num);
     }else if(e.getSource()==button15){ /// ÷ button
           opt = button15.getText();
           String num = text.getText(); //will store the first set of numbers
           text.setText(""); // will clear text field          
           num_new1 = Integer.parseInt(num);
     }else if(e.getSource()==button2){ /// % button
           opt = button2.getText();
           String num = text.getText(); //will store the first set of numbers
           text.setText(""); // will clear text field          
           num_new1 = Integer.parseInt(num);
     }    
     // The equal sign button
     else if(e.getSource()==button19){
         if(opt == "+"){
           String num = text.getText();// will store the next set of numbers
           num_new2 = Integer.parseInt(num);  
           double ans = num_new1 + num_new2;
           text.setText(" " + ans);
         } else if(opt == "X"){
           String num = text.getText();// will store the next set of numbers
           num_new2 = Integer.parseInt(num);  
           double ans = num_new1 * num_new2;
           text.setText(" " + ans);
         }  else if(opt == "-"){
           String num = text.getText();// will store the next set of numbers
           num_new2 = Integer.parseInt(num);  
           double ans = num_new1 - num_new2;
           text.setText(" " + ans);
         } else if(opt == "÷"){
           String num = text.getText();// will store the next set of numbers
           num_new2 = Integer.parseInt(num);  
           double ans = num_new1 / num_new2;
           text.setText(" " + ans);
         } else if(opt == "%"){
           String num = text.getText();// will store the next set of numbers
           num_new2 = Integer.parseInt(num);  
           double ans = num_new1 % num_new2;
           text.setText(" " + ans);
         }   
    } else if(e.getSource()== button3){
        String content = text.getText();
        int len = content.length();
        text.setText(content.substring(0, len - 1));
    }
 }
}
