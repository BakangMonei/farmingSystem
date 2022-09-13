package view;

import controller.JDBC;
import controller.Search;
import model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

public class SignUp extends JFrame{

    private JLabel JLabelSignUp;
    private JLabel JLabelFName;
    private JTextField textFieldFName;
    private JLabel JLabelLName;
    private JTextField textFieldLName;
    private JLabel JLabelGender;
    private JTextField textFieldGender;
    private JLabel JLabelIDNum;
    private JTextField textFieldIDNum;
    private JLabel JLabelEmail;
    private JTextField textFieldEmail;
    private JLabel JLabelPhoneNum;
    private JTextField textFieldPhoneNum;
    private JLabel JLabelPass1;
    private JPasswordField passwordField1;
    private JLabel JLabelPass2;
    private JPasswordField passwordField2;
    private JLabel JLabelPostAdd;
    private JTextField textFieldPostalAdd;
    private JLabel JLabelDistrict;
    private JTextField textFieldDistrict;
    private JLabel JLabelSubDistrict;
    private JTextField textFieldSubDistrict;
    private JButton REGISTERButton;
    private JPanel SignUpPanel;
    private Search search;
    private Search search2;
    private String isEmpty = "0";

    public JDBC jdbc;

    //list of all records:
    private ArrayList<User> records = new ArrayList<>();

    public SignUp() {
        REGISTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Validation of checking whether it is empty or not
                if(textFieldFName.getText().isEmpty() || textFieldLName.getText().isEmpty() || textFieldGender.getText().isEmpty() || textFieldIDNum.getText().isEmpty() || textFieldEmail.getText().isEmpty() || textFieldPhoneNum.getText().isEmpty() || passwordField1.getText().isEmpty() ||
                        passwordField2.getText().isEmpty() || textFieldPostalAdd.getText().isEmpty() || textFieldDistrict.getText().isEmpty() || textFieldSubDistrict.getText().isEmpty()){
                    JOptionPane.showMessageDialog(REGISTERButton, "Fill in your full details");
                }

                // Validation if the passwords are the same or not
                if(passwordField1 != passwordField2 ){
                    JOptionPane.showMessageDialog(REGISTERButton, "Passwords do not match. Please use same passwords");
                }

                // Validation of same password
                if(passwordField1.getText().length() <= 6){
                    JOptionPane.showMessageDialog(REGISTERButton, "Password is short");
                }
                if(passwordField2.getText().length() <= 6){
                    JOptionPane.showMessageDialog(REGISTERButton, "Password is short");
                }

                else{
                }
            }
        });
    }
    public static void main(String[] args) {
        SignUp MM = new SignUp();
        MM.setContentPane(MM.SignUpPanel);
        MM.setTitle("SignUp");
        MM.setSize(300, 400);
        MM.setVisible(true);
        MM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
