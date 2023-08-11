
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener{
    
    JComboBox valReligion, valCatagory, valIncome, valEducation, valOccupation;
    JTextField birthTextField, nidTextField;
    JRadioButton yes, no;
    JButton next;
    String formno; 
    long random;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        JLabel formNo = new JLabel("Application Form: ");
        formNo.setFont(new Font("Raleway", Font.BOLD, 38));
        formNo.setBounds(255, 20, 600, 40);
        add(formNo);
        
        JLabel additionalDetails = new JLabel("Page2:    Additional Details ");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        additionalDetails.setBounds(300, 80, 400, 30);
        add(additionalDetails);
        
        JLabel religion = new JLabel("Religion: ");
        religion.setFont(new Font("Raleway", Font.BOLD, 16));
        religion.setBounds(100,140,200,30);
        add(religion);
        
        String riligionArr[] = {"Islam", "Hinduism", "Buddhism", "Christianity" };
        valReligion = new JComboBox(riligionArr);
        valReligion.setFont(new Font("Raleway", Font.BOLD, 16));
        valReligion.setBounds(300,140,400,30);
        add(valReligion);
        
        
        JLabel catagory = new JLabel("Catagory: ");
        catagory.setFont(new Font("Raleway", Font.BOLD, 16));
        catagory.setBounds(100,190,200,30);
        add(catagory);
        
        String catagoryArr[] = {"General", "Student", "Others"};
        valCatagory = new JComboBox(catagoryArr);
        valCatagory.setFont(new Font("Raleway", Font.BOLD, 16));
        valCatagory.setBounds(300,190,400,30);
        add(valCatagory);
        
        
        
        JLabel income = new JLabel("Income: ");
        income.setFont(new Font("Raleway", Font.BOLD, 16));
        income.setBounds(100,240,200,30);
        add(income);
        
        String incomeArr[] = {"less than 5000", "5000", "10000", "20000", "50000", "more than 100000"};
        valIncome = new JComboBox(incomeArr);
        valIncome.setFont(new Font("Raleway", Font.BOLD, 16));
        valIncome.setBounds(300,240,400,30);
        add(valIncome);
        
        
        JLabel education = new JLabel("Educational Qualification: ");
        education.setFont(new Font("Raleway", Font.BOLD, 16));
        education.setBounds(100,290,200,30);
        add(education);
        
        String educationArr[] = {"Under SSC", "SSC", "HSC", "Bachelor", "Masters", "PHD"};
        valEducation = new JComboBox(educationArr);
        valEducation.setFont(new Font("Raleway", Font.BOLD, 16));
        valEducation.setBounds(300,290,400,30);
        add(valEducation);
        
        
        JLabel occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Raleway", Font.BOLD, 16));
        occupation.setBounds(100,340,200,30);
        add(occupation);
        
        String occupationArr[] = {"Engineer", "Teacher", "Doctor", "Buisnessman", "Service Holder", "Farmer", "Others"};
        valOccupation = new JComboBox(occupationArr);
        valOccupation.setFont(new Font("Raleway", Font.BOLD, 16));
        valOccupation.setBounds(300,340,400,30);
        add(valOccupation);
        
        
        JLabel birthCrtNo = new JLabel("Birth Crt. No. : ");
        birthCrtNo.setFont(new Font("Raleway", Font.BOLD, 16));
        birthCrtNo.setBounds(100,390,200,30);
        add(birthCrtNo);
        
        birthTextField = new JTextField();
        birthTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        birthTextField.setBounds(300,390,400,30);
        add(birthTextField);
        
        
        JLabel nid = new JLabel("NID No. : ");
        nid.setFont(new Font("Raleway", Font.BOLD, 16));
        nid.setBounds(100,440,200,30);
        add(nid);
        
        nidTextField = new JTextField();
        nidTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        nidTextField.setBounds(300,440,400,30);
        add(nidTextField);
        
        
        JLabel acExistance = new JLabel("Existing Account: ");
        acExistance.setFont(new Font("Raleway", Font.BOLD, 16));
        acExistance.setBounds(100,490,200,30);
        add(acExistance);
        
        yes = new JRadioButton("Yes");
        yes.setBounds(300,490,80,30);
        yes.setBackground(Color.white);
        add(yes);
        no = new JRadioButton("No");
        no.setBounds(450,490,80,30);
        no.setBackground(Color.white);
        add(no);
        ButtonGroup acExistanceGroup = new ButtonGroup();
        acExistanceGroup.add(yes);
        acExistanceGroup.add(no);
        
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 590, 80, 30);
        next.setFont(new Font("Raleway", Font.BOLD, 16));
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.white);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String formno = "" +random;
        String religion = (String) valReligion.getSelectedItem();
        String catagory = (String) valCatagory.getSelectedItem();
        String income = (String) valIncome.getSelectedItem();
        String education = (String) valEducation.getSelectedItem();
        String occupation = (String) valOccupation.getSelectedItem();
        String birthCrtNo = birthTextField.getText();
        String nid = nidTextField.getText();
        
        String acExistance = null;
        if(yes.isSelected()){
            acExistance = "Yes"; 
        }else if(no.isSelected()){
            acExistance = "No";
        }
        
        
        try{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+religion+"', '"+catagory+"', '"+income+"', '"+education+"', '"+occupation+"', '"+birthCrtNo+"', '"+nid+"', '"+acExistance+"')";
                c.s.executeUpdate(query);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new SignupTwo("");
    }
} 
