package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    //Globally defining
    JButton login, clear, signUp;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {

        setLayout(null);

        //Image icon
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon.jpg"));
        Image image2 = image1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel label = new JLabel(image3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        //welcome text Label
        JLabel text = new JLabel("Welcome To ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        //card label
        JLabel cardNO = new JLabel("Card No:");
        cardNO.setFont(new Font("Raleway", Font.BOLD, 28));
        cardNO.setBounds(120, 150, 150, 30);
        add(cardNO);

        //card textField
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Airway", Font.BOLD, 14));
        add(cardTextField);

        //pin label
        JLabel pinNo = new JLabel("PIN:");
        pinNo.setFont(new Font("Raleway", Font.BOLD, 28));
        pinNo.setBounds(120, 220, 250, 30);
        add(pinNo);

        //pin TextField
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Airway", Font.BOLD, 14));
        add(pinTextField);

        //login Button
        login = new JButton("Sign In");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);
        login.addActionListener(this);

        //clear button
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        add(clear);
        clear.addActionListener(this);

        //signUp button
        signUp = new JButton("Sign Up");
        signUp.setBounds(300, 350, 230, 30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        add(signUp);
        signUp.addActionListener(this);

        //frame color and size etc
        getContentPane().setBackground(Color.WHITE);
        setTitle("AUTOMATED TELLER MACHINE");
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {

        } else if (ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");

        } else if (ae.getSource() == signUp) {
            setVisible(false);
            new SignUpOne().setVisible(true);
        }

    }

    public static void main(String args[]) throws ClassNotFoundException {
        new Login();
//        Conn a= new Conn();
    }
}

//5 steps to for connecting to database
//  Register the Driver
//Create Connection
//Create Statement
//Execute Query
//Close Connection and my SQL is external entity
