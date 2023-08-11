
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField, fNameTextField, emailTextField, addressTextField, divisionTextField, districtTextField, policeTextField, pincodeTextField;
    JDateChooser dateChooser;
    JRadioButton male,female, married, unmarried;
    JButton next;
    
    SignupOne(){
        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formNo = new JLabel("Application Form No: " + random);
        formNo.setFont(new Font("Raleway", Font.BOLD, 38));
        formNo.setBounds(140, 20, 600, 40);
        add(formNo);
        
        JLabel personalDetails = new JLabel("Page1:    Personal Details ");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 20));
        personalDetails.setBounds(300, 80, 400, 30);
        add(personalDetails);
        
        JLabel Name = new JLabel("Name: ");
        Name.setFont(new Font("Raleway", Font.BOLD, 16));
        Name.setBounds(100,140,200,30);
        add(Name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
        JLabel fathersName = new JLabel("Father's Name: ");
        fathersName.setFont(new Font("Raleway", Font.BOLD, 16));
        fathersName.setBounds(100,190,200,30);
        add(fathersName);
        
        fNameTextField = new JTextField();
        fNameTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        fNameTextField.setBounds(300,190,400,30);
        add(fNameTextField);
        
        
        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 16));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setFont(new Font("Raleway", Font.BOLD, 16));
        dateChooser.setForeground(new Color(255,255,255));
        add(dateChooser);
        
        
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 16));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,120,30);
        male.setBackground(Color.white);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        
        JLabel email = new JLabel("Email: ");
        email.setFont(new Font("Raleway", Font.BOLD, 16));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        
        JLabel maritalStatus = new JLabel("Marital Status: ");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 16));
        maritalStatus.setBounds(100,390,200,30);
        add(maritalStatus);
        
        married = new JRadioButton("Married");
        married.setBounds(300,390,120,30);
        married.setBackground(Color.white);
        add(married);
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,120,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        ButtonGroup mStatusGroup = new ButtonGroup();
        mStatusGroup.add(married);
        mStatusGroup.add(unmarried);
        
        
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway", Font.BOLD, 16));
        address.setBounds(100,440,200,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        
        JLabel division = new JLabel("Division: ");
        division.setFont(new Font("Raleway", Font.BOLD, 16));
        division.setBounds(100,490,200,30);
        add(division);
        
        divisionTextField = new JTextField();
        divisionTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        divisionTextField.setBounds(300,490,400,30);
        add(divisionTextField);
        
        
        JLabel district = new JLabel("District: ");
        district.setFont(new Font("Raleway", Font.BOLD, 16));
        district.setBounds(100,540,200,30);
        add(district);
        
        districtTextField = new JTextField();
        districtTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        districtTextField.setBounds(300,540,400,30);
        add(districtTextField);
        
        
        JLabel policeStation = new JLabel("Police Station: ");
        policeStation.setFont(new Font("Raleway", Font.BOLD, 16));
        policeStation.setBounds(100,590,200,30);
        add(policeStation);
        
        policeTextField = new JTextField();
        policeTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        policeTextField.setBounds(300,590,400,30);
        add(policeTextField);
        
        
        
        JLabel pincode = new JLabel("Pin Code: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 16));
        pincode.setBounds(100,640,200,30);
        add(pincode);        
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        pincodeTextField.setBounds(300,640,400,30);
        add(pincodeTextField);
        
        
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 690, 80, 30);
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
        String formno = "" +random; //
        String name = nameTextField.getText();
        String fname = fNameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male"; 
        }else if(female.isSelected()){
            gender = "Female";
        }
        
        String email = emailTextField.getText();
        String maritalStatus = null;
        if(married.isSelected()){
            maritalStatus = "Married";
        }else if(unmarried.isSelected()){
            maritalStatus = "Unmarried";
        }

        String address = addressTextField.getText();
        String division = divisionTextField.getText();
        String district = districtTextField.getText();
        String policeStation = policeTextField.getText();
        String pincode = pincodeTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            }else{
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+maritalStatus+"', '"+address+"', '"+division+"', '"+district+"', '"+policeStation+"', '"+pincode+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new SignupOne();
    }
} 
