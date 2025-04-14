
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class Signup_1 extends JFrame implements ActionListener{
    long random;
    JTextField nametf,fnametf,phonetf,emailtf,nidtf,mstf,areastf,potf,pctf,pstf;
    JRadioButton male,female,others;
    JButton next;
    JDateChooser dateChooser;
    Signup_1(){
        
        setLayout(null);
        setTitle("New Application Form");
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 100000L));
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Resources/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel fno = new JLabel("APPLICATION FORM NO. "+random);
        fno.setFont(new Font("Raleway", Font.BOLD, 25));
        fno.setBounds(200,20,600,40);
        add(fno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        personalDetails.setBounds(290,70,400,30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        name.setBounds(100,150,100,30);
        add(name);
        
        nametf = new JTextField();
        nametf.setFont(new Font("Arial", Font.BOLD,15));
        nametf.setBounds(350,150,300,25);
        add(nametf);
        
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 18));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnametf = new JTextField();
        fnametf.setFont(new Font("Arial", Font.BOLD,15));
        fnametf.setBounds(350,190,300,25);
        add(fnametf);
        
        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 18));
        dob.setBounds(100,230,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(350,230,300,30);
        dateChooser.setForeground(Color.black);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 18));
        gender.setBounds(100,270,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(350,270,100,30);
        male.setBackground(Color.white);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(470,270,100,30);
        female.setBackground(Color.white);
        add(female);
        
        others = new JRadioButton("Others");
        others.setBounds(570,270,100,30);
        others.setBackground(Color.white);
        add(others);
        
        ButtonGroup gengrp = new ButtonGroup();
        gengrp.add(male);
        gengrp.add(female);
        gengrp.add(others);
        
        JLabel phone = new JLabel("Phone Number: ");
        phone.setFont(new Font("Raleway", Font.BOLD, 18));
        phone.setBounds(100,310,200,30);
        add(phone);
        
        phonetf = new JTextField();
        phonetf.setFont(new Font("Arial", Font.BOLD,15));
        phonetf.setBounds(350,310,300,25);
        add(phonetf);
        
        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway", Font.BOLD, 18));
        email.setBounds(100,350,200,30);
        add(email);
        
        emailtf = new JTextField();
        emailtf.setFont(new Font("Arial", Font.BOLD,15));
        emailtf.setBounds(350,350,300,25);
        add(emailtf);
        
        JLabel nid = new JLabel("NID Number: ");
        nid.setFont(new Font("Raleway", Font.BOLD, 18));
        nid.setBounds(100,390,200,30);
        add(nid);
        
        nidtf = new JTextField();
        nidtf.setFont(new Font("Arial", Font.BOLD,15));
        nidtf.setBounds(350,390,300,25);
        add(nidtf);
        
        JLabel marital_status = new JLabel("Marital Status: ");
        marital_status.setFont(new Font("Raleway", Font.BOLD, 18));
        marital_status.setBounds(100,430,200,30);
        add(marital_status);
        
        mstf = new JTextField();
        mstf.setFont(new Font("Arial", Font.BOLD,15));
        mstf.setBounds(350,430,300,25);
        add(mstf);
        
        JLabel address = new JLabel("Address ");
        address.setFont(new Font("Raleway", Font.BOLD, 18));
        address.setBounds(100,470,200,30);
        add(address);
        
        
        JLabel area = new JLabel("Area: ");
        area.setFont(new Font("Raleway", Font.BOLD, 18));
        area.setBounds(150,500,200,30);
        add(area);
        
        areastf = new JTextField();
        areastf.setFont(new Font("Arial", Font.BOLD,15));
        areastf.setBounds(350,500,300,25);
        add(areastf);
        
        JLabel poffice = new JLabel("Post Office: ");
        poffice.setFont(new Font("Raleway", Font.BOLD, 18));
        poffice.setBounds(150,530,200,30);
        add(poffice);
        
        potf = new JTextField();
        potf.setFont(new Font("Arial", Font.BOLD,15));
        potf.setBounds(350,530,300,25);
        add(potf);
        
        JLabel post_code = new JLabel("Postal Code: ");
        post_code.setFont(new Font("Raleway", Font.BOLD, 18));
        post_code.setBounds(150,560,200,30);
        add(post_code);
        
        pctf = new JTextField();
        pctf.setFont(new Font("Arial", Font.BOLD,15));
        pctf.setBounds(350,560,300,25);
        add(pctf);
        
        JLabel pstation = new JLabel("Police Station: ");
        pstation.setFont(new Font("Raleway", Font.BOLD, 18));
        pstation.setBounds(150,590,200,30);
        add(pstation);
        
        pstf = new JTextField();
        pstf.setFont(new Font("Arial", Font.BOLD,15));
        pstf.setBounds(350,590,300,25);
        add(pstf);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 15));
        next.setBounds(570,640,80,30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String fno = "" + random;
        String name = nametf.getText();
        String fname = fnametf.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }
        else if(female.isSelected()){
            gender = "Female";
        }
        else if(others.isSelected()){
            gender = "Others";
        }
        
        String phone = phonetf.getText();
        String email = emailtf.getText();
        String nid = nidtf.getText();
        String ms = mstf.getText();
        String area = areastf.getText();
        String poffice = potf.getText();
        String pcode = pctf.getText();
        String pstation = pstf.getText();
        
        try{
            if((name.equals("")) || (fname.equals("")) || (dob.equals("")) || (gender.equals("")) || (phone.equals("")) || (email.equals("")) || (nid.equals("")) || (area.equals("")) || (poffice.equals("")) || (pcode.equals("")) || (pstation.equals(""))){
                JOptionPane.showMessageDialog(null,"Please fill up all information");
            }
            else{
                connect c = new connect();
                String query = "insert into signup values('"+fno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+phone+"', '"+email+"', '"+nid+"', '"+ms+"', '"+area+"', '"+poffice+"', '"+pcode+"', '"+pstation+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new Signup_2(fno).setVisible(true);
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        new Signup_1();
    }
}
