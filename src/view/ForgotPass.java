package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForgotPass extends JFrame{
    private JLabel JLabelForgotPass;
    private JPanel JPanelForgotPass;
    private JLabel JLabelEmail;
    private JTextField textFieldEmail;
    private JLabel JLabelNewPass;
    private JPasswordField passwordFieldNewPass;
    private JLabel JlabelNewPass2;
    private JPasswordField passwordFieldNewPass2;
    private JButton buttonChangePass;

    public ForgotPass() {
        buttonChangePass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        ForgotPass FP = new ForgotPass();
        FP.setContentPane(FP.JPanelForgotPass);
        FP.setTitle("Forgot Password");
        //FP.setBounds(600, 200, 200, 200);
        FP.setSize(300, 400);
        FP.setVisible(true);
        FP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
