package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login,clear,signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        setTitle("ATM Machine");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Resources/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text = new JLabel("LOGIN");
        text.setFont(new Font("NewTimesRoman", Font.BOLD, 50));
        text.setBounds(300,40,400,40);
        add(text);
        
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Releway", Font.BOLD, 30));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 15));
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 30));
        pin.setBounds(120,220,250,30);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 15));
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);
                
        getContentPane().setBackground(Color.white);
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    // Actions for Buttons
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource() == login){
            connect cn = new connect();
            String cardno = cardTextField.getText();
            String pinno = pinTextField.getText();
            String query = "select * from login where cardno = '"+cardno+"' and pin = '"+pinno+"'";
            try{
                ResultSet rs = cn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transation(pinno).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                }
            }catch(Exception e){
                System.out.println(ae);
            }
        }
        else if(ae.getSource() == signup){
            setVisible(false);
            new Signup_1().setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
