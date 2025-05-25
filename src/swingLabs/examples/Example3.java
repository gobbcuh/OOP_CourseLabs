package swingLabs.examples;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;

// Text Field Input and Display

public class Example3 {
    private JFrame frame;
    private JTextField nameField;
    private JButton submitButton;
    private JLabel nameLabel;

    public Example3() {
        frame = new JFrame("Name Input");
        nameField = new JTextField(20);
        submitButton = new JButton("Submit");
        nameLabel = new JLabel("");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                nameLabel.setText("Hello, " + name + "!");
            }
        });
        
        frame.add(nameField);
        frame.add(submitButton);
        frame.add(nameLabel, BorderLayout.SOUTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Example3();
    }
}