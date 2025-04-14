
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class Signup_2 extends JFrame implements ActionListener{
    JTextField religiontf,incometf,Occupationtf,eqtf,nationalitytf;
    JButton next;
    String fno;
    Signup_2(String fno){
        this.fno = fno;
        setLayout(null);
        setTitle("New Application Form");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Resources/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel addDetails = new JLabel("Page 2: Additional Details");
        addDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        addDetails.setBounds(290,60,400,30);
        add(addDetails);
        
        JLabel religion = new JLabel("Religion: ");
        religion.setFont(new Font("Raleway", Font.BOLD, 18));
        religion.setBounds(100,150,100,30);
        add(religion);
        
        religiontf = new JTextField();
        religiontf.setFont(new Font("Arial", Font.BOLD,15));
        religiontf.setBounds(350,150,300,25);
        add(religiontf);
        
        JLabel income = new JLabel("Annual Income: ");
        income.setFont(new Font("Raleway", Font.BOLD, 18));
        income.setBounds(100,200,200,30);
        add(income);
        
        incometf = new JTextField();
        incometf.setFont(new Font("Arial", Font.BOLD,15));
        incometf.setBounds(350,200,300,25);
        add(incometf);
        
        JLabel Occupation = new JLabel("Occupation: ");
        Occupation.setFont(new Font("Raleway", Font.BOLD, 18));
        Occupation.setBounds(100,250,200,30);
        add(Occupation);
        
        Occupationtf = new JTextField();
        Occupationtf.setFont(new Font("Arial", Font.BOLD,15));
        Occupationtf.setBounds(350,250,300,30);
        add(Occupationtf);
        
        JLabel edu = new JLabel("Educational ");
        edu.setFont(new Font("Raleway", Font.BOLD, 18));
        edu.setBounds(100,300,200,30);
        add(edu);
        
        JLabel eq = new JLabel("Qualification: ");
        eq.setFont(new Font("Raleway", Font.BOLD, 18));
        eq.setBounds(100,320,200,30);
        add(eq);
        
        eqtf = new JTextField();
        eqtf.setFont(new Font("Arial", Font.BOLD,15));
        eqtf.setBounds(350,315,300,30);
        add(eqtf);
      
        
        JLabel nationality = new JLabel("Nationality: ");
        nationality.setFont(new Font("Raleway", Font.BOLD, 18));
        nationality.setBounds(100,370,200,30);
        add(nationality);
        
        nationalitytf = new JTextField();
        nationalitytf.setFont(new Font("Arial", Font.BOLD,15));
        nationalitytf.setBounds(350,370,300,25);
        add(nationalitytf);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 15));
        next.setBounds(570,450,80,30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.white);
        setSize(750,700);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String religion = religiontf.getText();
        String income = incometf.getText();
        String occupation = Occupationtf.getText();
        String eq = eqtf.getText();
        String nationality = nationalitytf.getText();
        
        try{
            if(religion.equals("") || income.equals("") || occupation.equals("") || eq.equals("") || nationality.equals("")){
                JOptionPane.showMessageDialog(null,"Please fill up all information");
            }
            else{
                connect c = new connect();
                String query = "insert into signup_two values('"+fno+"', '"+religion+"', '"+income+"', '"+occupation+"', '"+eq+"', '"+nationality+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new Signup_3(fno).setVisible(true);
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        new Signup_2("");
    }
}
