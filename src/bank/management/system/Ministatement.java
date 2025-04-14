package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Ministatement extends JFrame implements ActionListener{
 
    JButton b1, b2;
    JLabel l1,l2,l3,l4;
    Ministatement(String pin){
        super("Mini Statement");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(400,600);
        setLocation(20,20);
        
        l1 = new JLabel();
        add(l1);
        
        l2 = new JLabel("Banladesh Bank");
        l2.setBounds(150, 20, 100, 20);
        add(l2);
        
        l3 = new JLabel();
        l3.setBounds(20, 80, 300, 20);
        add(l3);
        
        l4 = new JLabel();
        l4.setBounds(20, 450, 300, 20);
        add(l4);
        
        try{
            connect c = new connect();
            ResultSet rs = c.s.executeQuery("select * from login where pin = '"+pin+"'");
            while(rs.next()){
                l3.setText("Card Number:    " + rs.getString("cardno").substring(0, 4) + "XXXXXXXX" + rs.getString("cardno").substring(12));
            }
        }catch(Exception e){}
        	 
        try{
            int balance = 0;
            connect c1  = new connect();
            ResultSet rs = c1.s.executeQuery("select * from balance where pin = '"+pin+"'");
            while(rs.next()){
                l1.setText(l1.getText() + "<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            l4.setText("Your total Balance is Tk. "+balance);
        }catch(Exception e){
            System.out.println(e);
        }
        
        setLayout(null);
        b1 = new JButton("Exit");
        add(b1);
        
        b1.addActionListener(this);
        
        l1.setBounds(20, 150, 400, 300);
        b1.setBounds(20, 500, 100, 25);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
    public static void main(String[] args){
        new Ministatement("").setVisible(true);
    }
    
}