package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener {

    JTextField panTextField;
    JButton next;
    JRadioButton SYes, SNo, EYes, ENo;
    JComboBox religionBox, categoryBox, incomeBox, QualficationBox, OccupationBox;
    String formno;

    SignUpTwo(String formno) {
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APLLICATION FORM PAGE-2");

        //additionlDetail Label
        JLabel additionalDetail = new JLabel("Page 2: Additional Details");
        additionalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetail.setBounds(290, 80, 400, 30);
        add(additionalDetail);

        //religionLabel
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 200, 30);
        add(religion);

        //religionComboBox
        String valReligion[] = {"Muslim", "Sikh", "Hindu", "Christian", "other"};
        religionBox = new JComboBox(valReligion);
        religionBox.setBounds(300, 140, 400, 30);
        religionBox.setBackground(Color.WHITE);
        add(religionBox);

        //categoryLabel
        JLabel Category = new JLabel("Category:");
        Category.setFont(new Font("Raleway", Font.BOLD, 20));
        Category.setBounds(100, 190, 400, 30);
        add(Category);

        //categoryComboBox
        String valCategory[] = {"General", "OBC", "SC", "ST", "other"};
        categoryBox = new JComboBox(valCategory);
        categoryBox.setBounds(300, 190, 400, 30);
        categoryBox.setBackground(Color.WHITE);
        add(categoryBox);

        //incomelabel
        JLabel Income = new JLabel("Income:");
        Income.setFont(new Font("Raleway", Font.BOLD, 20));
        Income.setBounds(100, 240, 400, 30);
        add(Income);

        //IncomeComboBox
        String valIncome[] = {"Null", "<1,50,000", "<2,50,0000", "<5,00,0000", "<upto 10,00,000"};
        incomeBox = new JComboBox(valIncome);
        incomeBox.setBounds(300, 240, 400, 30);
        incomeBox.setBackground(Color.WHITE);
        add(incomeBox);

        //Qualificationlabel
        JLabel Qualification = new JLabel("Qualification :");
        Qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        Qualification.setBounds(100, 290, 400, 30);
        add(Qualification);

        //QualificationuComboBox
        String valQualfication[] = {"Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "other"};
        QualficationBox = new JComboBox(valQualfication);
        QualficationBox.setBounds(300, 290, 400, 30);
        QualficationBox.setBackground(Color.WHITE);
        add(QualficationBox);

        //OccupationLabel
        JLabel Occupation = new JLabel("Occupation:");
        Occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        Occupation.setBounds(100, 340, 400, 30);
        add(Occupation);

        //OccupationComboBox
        String valOccupation[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired"};
        OccupationBox = new JComboBox(valOccupation);
        OccupationBox.setBounds(300, 340, 400, 30);
        OccupationBox.setBackground(Color.WHITE);
        add(OccupationBox);

        //panlabel
        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 390, 400, 30);
        add(pan);

        //panTextField
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 20));
        panTextField.setBounds(300, 390, 400, 30);
        add(panTextField);

        //citizenLabel
        JLabel citizen = new JLabel("Senior Citizen");
        citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        citizen.setBounds(100, 440, 400, 30);
        add(citizen);
        //yes Radio Button
        SYes = new JRadioButton("Yes");
        SYes.setBounds(300, 440, 100, 30);
        SYes.setBackground(Color.WHITE);
        add(SYes);

        //No Radio Button
        SNo = new JRadioButton("No");
        SNo.setBounds(450, 440, 100, 30);
        SNo.setBackground(Color.WHITE);
        add(SNo);

        //For grouping radio button
        ButtonGroup SeniorGroup = new ButtonGroup();
        SeniorGroup.add(SYes);
        SeniorGroup.add(SNo);

        //Accountlabel
        JLabel account = new JLabel("Exsiting Account:");
        account.setFont(new Font("Raleway", Font.BOLD, 20));
        account.setBounds(100, 490, 400, 30);
        add(account);

        //yes Radio Button
        EYes = new JRadioButton("Yes");
        EYes.setBounds(300, 490, 100, 30);
        EYes.setBackground(Color.WHITE);
        add(EYes);

        //No Radio Button
        ENo = new JRadioButton("No");
        ENo.setBounds(450, 490, 100, 30);
        ENo.setBackground(Color.WHITE);
        add(ENo);

        //For grouping radio button
        ButtonGroup AccountGroup = new ButtonGroup();
        AccountGroup.add(EYes);
        AccountGroup.add(ENo);

        //nextButton
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        //frame color and size etc
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String religion = (String) religionBox.getSelectedItem();
        String category = (String) categoryBox.getSelectedItem();
        String income = (String) incomeBox.getSelectedItem();
        String Qualification = (String) QualficationBox.getSelectedItem();
        String Occupation = (String) OccupationBox.getSelectedItem();
        String citizen = null;
        if (SYes.isSelected()) {
            citizen = "Yes";
        } else if (SNo.isSelected()) {
            citizen = "No";
        }
        String pan = panTextField.getText();
        String account = null;
        if (SYes.isSelected()) {
            account = "Yes";
        } else if (SNo.isSelected()) {
            account = "No";
        }

        //if you want validations in project
        try {
            Conn connect = new Conn();
            String insertQuery = "insert into signUpTwo values('" + formno + "','" + religion + "','" + category + "','" + income + "','" + Qualification + "','" + Occupation + "','" + pan + "','" + citizen + "','" + account + "')";
            connect.statement.executeUpdate(insertQuery);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new SignUpTwo("");
    }
}
