
package bank.mangement.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame{
    SignUpOne(){
        
        //random number genertaor
        setLayout(null);
        Random ran =new Random();
        long random=Math.abs(ran.nextLong()% 9000L)+ 1000L;
        
        //formNumber label
        JLabel formno=new JLabel("APPLICATION FORM NO. "+ random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20, 600,40);
        add(formno);
        
        //personalDetail Label
        JLabel personalDetail=new JLabel("Page 1: Personal Details");
        personalDetail.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetail.setBounds(290,80, 400,30);
        add(personalDetail);
        
        //nameLabel
        JLabel name=new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,200,30);
        add(name);
        
        //nameTextField
        JTextField nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,20));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        //fnameLabel
        JLabel fname=new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,400,30);
        add(fname);
        
        //fnameTextField
        JTextField fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,20));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        //date of birth label
        JLabel dob=new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,400,30);
        add(dob);
        
        //dateChooser
        JDateChooser dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        //gender label
        JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,400,30);
        add(gender);
        
        //male RadioButton
        JRadioButton male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        
        //female RadioButton
        JRadioButton female=new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        //For grouping radio button
        ButtonGroup genderGroup=new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        //email
        JLabel email=new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,400,30);
        add(email);
        
        //emailTextField
        JTextField emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,20));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        //Marital label
        JLabel marital=new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,400,30);
        add(marital);
        
        //Married Radio Button
        JRadioButton married=new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        
        //Unmarried Radio Button
        JRadioButton unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        //other radioButton
        JRadioButton other=new JRadioButton("Other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        //For grouping radio button
        ButtonGroup maritalGroup=new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);
        
        //addressLabel
        JLabel address=new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,400,30);
        add(address);
        
        //addressTextField
        JTextField addressTextField=new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,20));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        //city:abel
        JLabel city=new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490, 400,30);
        add(city);
        
        //cityTextField
        JTextField cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,20));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        //stateLabel
        JLabel state=new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540, 400,30);
        add(state);
        
        //stateTextField
        JTextField stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,20));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        //PinCodeLabel
        JLabel pinCode=new JLabel("PinCode:");
        pinCode.setFont(new Font("Raleway",Font.BOLD,20));
        pinCode.setBounds(100,590, 400,30);
        add(pinCode);
        
        
        //pinCodeTextField
        JTextField pinCodeTextField=new JTextField();
        pinCodeTextField.setFont(new Font("Raleway",Font.BOLD,20));
        pinCodeTextField.setBounds(300,590,400,30);
        add(pinCodeTextField);
        
        //nextButton
        JButton next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        add(next);
       
        //frame color and size etc
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public static void main(String args[]){
       new  SignUpOne();
    }
}
