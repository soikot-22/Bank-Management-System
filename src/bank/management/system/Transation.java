package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Transation extends JFrame implements ActionListener{

    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6;
    String pin;
    Transation(String pin){
        this.pin = pin;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Resources/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 900);
        add(l2);
        
        l1 = new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        
       
        b1 = new JButton("DEPOSIT");
        b2 = new JButton("CASH WITHDRAWL");
        b3 = new JButton("MINI STATEMENT");
        b4 = new JButton("PIN CHANGE");
        b5 = new JButton("BALANCE ENQUIRY");
        b6 = new JButton("EXIT");
        
        setLayout(null);
        
        l1.setBounds(200,300,700,35);
        l2.add(l1);
        
        b1.setBounds(170,350,150,35);
        l2.add(b1);
        
        b2.setBounds(350,350,150,35);
        l2.add(b2);
        
        b3.setBounds(170,400,150,35);
        l2.add(b3);
        
        b4.setBounds(350,400,150,35);
        l2.add(b4);
        
        b5.setBounds(170,450,150,35);
        l2.add(b5);
        
        b6.setBounds(350,450,150,35);
        l2.add(b6);
        
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        
        
        setSize(900,900);
        setLocation(250,0);
        setUndecorated(true);
        setVisible(true);  
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b6){ 
            System.exit(0);
        }
        else if(ae.getSource() == b1){
            setVisible(false);
            new Deposite(pin).setVisible(true);
        }
        else if(ae.getSource() == b2){
            setVisible(false);
            new Withdraw(pin).setVisible(true);
        }
        else if(ae.getSource() == b4){
            setVisible(false);
            new Changepin(pin).setVisible(true);
        }
        else if(ae.getSource() == b5){
            setVisible(false);
            new BalanceEnq(pin).setVisible(true);
        }
        else if(ae.getSource() == b3){
            //setVisible(false);
            new Ministatement(pin).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Transation("").setVisible(true);
    }
}