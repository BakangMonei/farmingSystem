package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
* 1. Log In
* 2. Forgot Password
* 3. SignUp
* */
public class MainMenu extends JFrame{
    private JPanel panelMain;
    private JTextField TxtFieldUserName;
    private JLabel JLabelUserName;
    private JLabel JLabelMainMenu;
    private JLabel JLabelPassword;
    private JPasswordField TxtFieldPassword;
    private JButton ButtonLogin;
    private JButton ButtonSignUpButton;
    private JButton buttonForgotPassword;

    public MainMenu() {
        ButtonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ButtonLogin, TxtFieldUserName.getText() + ", Hello!");
            }
        });
        ButtonSignUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonForgotPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        MainMenu MM = new MainMenu();
        MM.setContentPane(MM.panelMain);
        MM.setTitle("Hello");
        MM.setBounds(600, 200, 200, 200);
        //MM.setSize(300, 400);
        MM.setVisible(true);
        MM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
