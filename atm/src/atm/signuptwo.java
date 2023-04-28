
package atm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class signuptwo extends JFrame {
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes, eno, sno, eyes;
    JComboBox religion, category, occupation, education, income;
    String formno;
    signuptwo(String formno){
        this.formno=formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setBounds(140, 20, 600, 40); 
        additionalDetails.setFont(new Font("Raleway",Font.BOLD, 38));
        add(additionalDetails);
        
        JLabel name = new JLabel("Religion:");
        name.setBounds(100, 140, 100, 30);
        name.setFont(new Font("Raleway",Font.BOLD, 20));
        add(name);
        
        String valReligion[]={"Hindu", "Muslim", "Sikh", "Christian", "other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
                
        JLabel fname = new JLabel("Category:");
        fname.setBounds(100, 190, 200, 30);
        fname.setFont(new Font("Raleway",Font.BOLD, 20));
        add(fname);
        
        String valcategory[]={"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
       
        
        JLabel dob = new JLabel("Income:");
        dob.setBounds(100, 240, 200, 30);
        dob.setFont(new Font("Raleway",Font.BOLD, 20));
        add(dob);
        
        String incomecategory[]={"Null", "<1,50,000", "<2,50,000", "<5,00,000", "upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel gender = new JLabel("Educational");
        gender.setBounds(100, 315, 200, 30);
        gender.setFont(new Font("Raleway",Font.BOLD, 20));
        add(gender);
       
        JLabel email = new JLabel("Qualification:");
        email.setBounds(100, 340, 200, 30);
        email.setFont(new Font("Raleway",Font.BOLD, 20));
        add(email);
        
        String educationalValues[]={"Non-Graduation", "Graduate", "Post Graduation", "Doctrate", "Others"};
        education = new JComboBox(educationalValues);
        education.setBounds(300, 340, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
      
        
        JLabel marital = new JLabel("Occupation:");
        marital.setBounds(100, 390, 200, 30);
        marital.setFont(new Font("Raleway",Font.BOLD, 20));
        add(marital);
        
        String occupationValues[]={"Salaried", "Self-Employed", "Business", "Student", "Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 240, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        
        JLabel address = new JLabel("PAN number:");
        address.setBounds(100, 440, 200, 30);
        address.setFont(new Font("Raleway",Font.BOLD, 20));
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        JLabel city = new JLabel("Aadhar number:");
        city.setBounds(100, 490, 200, 30);
        city.setFont(new Font("Raleway",Font.BOLD, 20));
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        JLabel state = new JLabel("Senior citizen:");
        state.setBounds(100, 540, 200, 30);
        state.setFont(new Font("Raleway",Font.BOLD, 20));
        add(state);
        
        syes = new JRadioButton("YES");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("NO");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
       
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        
        
        JLabel pincode = new JLabel("Existing Account:");
        pincode.setBounds(100, 590, 200, 30);
        pincode.setFont(new Font("Raleway",Font.BOLD, 20));
        add(pincode);
        
        eyes = new JRadioButton("YES");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("NO");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
       
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        add(next);
        
        getContentPane().setBackground(Color.WHITE); 
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome=(String) income.getSelectedItem();
        String seducation=(String) education.getSelectedItem();
        String soccupation=(String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
            
        }else if(sno.isSelected()){
            seniorcitizen="No";
        }
        
        String existingaccount=null;
        if(eyes.isSelected()){
            existingaccount="Yes";
            
        }else if(eno.isSelected()){
            existingaccount="No";
        }
        String span = pan.getText();
        String saadhar = aadhar.getText();
        try{
            
                Conn c= new Conn();
                setVisible(false);
                new Signup3(formno).setVisible(true);
                
        }catch (Exception e){
            System.out.println(e);
        }
    }
 

    public static void main(String args[]) {
        new signuptwo("");
    }
}
