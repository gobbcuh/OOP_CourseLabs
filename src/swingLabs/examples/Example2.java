package swingLabs.examples;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;

// Simple Button Click Counter

public class Example2 {
    private JFrame frame;
    private JButton button;
    private JLabel countLabel;
    private int clickCount = 0;

    public Example2() {
        frame = new JFrame("Click Counter");
        button = new JButton("Click Me");
        countLabel = new JLabel("Clicks: 0");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                countLabel.setText("Clicks: " + clickCount);
            }
        });

        frame.add(button);
        frame.add(countLabel, BorderLayout.SOUTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Example2();
    }
}