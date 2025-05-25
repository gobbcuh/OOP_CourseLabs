package swingLabs.examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Simple Password Checker

public class Example5 extends JFrame {

    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton checkButton;
    private JLabel resultLabel;

    public Example5() {
        setTitle("Password Checker");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        passwordLabel = new JLabel("Enter Password: ");
        passwordField = new JPasswordField(15);
        checkButton = new JButton("Check");
        resultLabel = new JLabel("");

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkPassword(new String(passwordField.getPassword()));
            }
        });

        add(passwordLabel);
        add(passwordField);
        add(checkButton);
        add(resultLabel);
    }

    private void checkPassword(String password) {
        if (password.length() >= 8) {
            resultLabel.setText("Password is strong!");
            resultLabel.setForeground(Color.GREEN);
        } 
        else {
            resultLabel.setText("Password is too short!");
            resultLabel.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
        @Override
            public void run() {
                new Example5().setVisible(true);
            }
        });
    }
}
