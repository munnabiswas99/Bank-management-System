package bank.management.system;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Image;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Login extends JFrame implements ActionListener{
    JButton login,clear,singup;
    JTextField card_field;
    JPasswordField pin_field;
    Login(){
        getContentPane().setBackground(Color.white);
        setTitle("Automated Teller Machine");       
        setSize(800,480);
        setLocation(350,200);
        
        //LOgo
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank-logo.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        //header
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        //card_no field
        JLabel card_no = new JLabel("Card No");
        card_no.setFont(new Font("Raleway",Font.BOLD,25));
        card_no.setBounds(120, 150, 150, 30);
        add(card_no);
        
//        card_no input Field
        card_field = new JTextField();
        card_field.setBounds(300,150,200,30);
        card_field.setFont(new Font ("Arial",Font.BOLD,14));
        add(card_field);
        
        //pin field
        JLabel pin = new JLabel("Pin");
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(120, 220, 150, 30);
        add(pin);
        
//        password input field
        pin_field = new JPasswordField();
        pin_field.setBounds(300,220,200,30);
        pin_field.setFont(new Font ("Arial",Font.BOLD,14));
        add(pin_field);
        
        //login button
        login = new JButton("Login");
        login.setBounds(300,300,80,25);
        add(login);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        
        
        clear = new JButton("Clear");
        clear.setBounds(420,300,80,25);
        add(clear);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        
        singup = new JButton("singup");
        singup.setBounds(300,340,200,25);
        add(singup);
        singup.setBackground(Color.BLACK);
        singup.setForeground(Color.WHITE);
        clear.addActionListener(this);
        
        setVisible(true);

    }
//    action field
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            card_field.setText(null);
            pin_field.setText(null);
        }
        else if(ae.getSource() == login){
            
        }
        else if(ae.getSource() == singup){
            
        }
    }
//    main Method
    public static void main(String[] args) {
        new Login();
    }
}