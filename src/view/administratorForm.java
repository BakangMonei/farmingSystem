package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class administratorForm extends JFrame {
    private JPanel adminPanel;
    private JLabel JLabeelAdmin;
    private JTextArea textAreaDetailsAdmi;
    private JButton UPDATEButton;
    private JButton DELETEButton;
    private JButton ADDButton;
    private JButton VIEWButton;
    private JTextField textFieldSearch;
    private JButton SearchButton;

    public administratorForm() {
        UPDATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        DELETEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ADDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        VIEWButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        administratorForm MM = new administratorForm();
        MM.setContentPane(MM.adminPanel);
        MM.setTitle("SignUp");
        MM.setSize(300, 400);
        MM.setVisible(true);
        MM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
