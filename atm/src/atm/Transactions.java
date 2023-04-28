
package atm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame{
    JButton pinchange,ministatement,withdrawl,exit,deposit;
    String pinnumber;
    Transactions(String pinnumber){
        setLayout(null);
        this.pinnumber=pinnumber;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm4.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Please select your Transaction:");
        text.setBounds(210,415,700,35);
        image.add(text);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("System",Font.BOLD,16));
        
        deposit = new JButton("Deposit");
        deposit.setBounds(210,450,150,30);
        image.add(deposit);
        
        withdrawl = new JButton("Cash withdraw");
        withdrawl.setBounds(365,450,150,30);
        image.add(withdrawl);
        
        ministatement = new JButton("Balance enquiry");
        ministatement.setBounds(365,515,150,30);
        image.add(ministatement);
        
        pinchange = new JButton("Pin change");
        pinchange.setBounds(210,515,150,30);
        image.add(pinchange);
        
        exit = new JButton("Exit");
        exit.setBounds(290,550,150,30);
        image.add(exit);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        setUndecorated(true);
    }
    public void acrtionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
            System.exit(0);
        }else if(ae.getSource()==deposit){
            setVisible(false);
            new deposit(pinnumber).setVisible(true);
            
        }else if(ae.getSource()==withdrawl){
            setVisible(false);
            new withdrawl(pinnumber).setVisible(true);
        }
    }

    public static void main(String args[]) {
        new Transactions("");
    }
}
