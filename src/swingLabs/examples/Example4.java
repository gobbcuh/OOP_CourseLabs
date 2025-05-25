package swingLabs.examples;

import javax.swing.*;

// Simple Text Editor

public class Example4 {
    private JFrame frame;
    private JTextArea textArea;

    public Example4() {
        frame = new JFrame("Simple Text Editor");
        textArea = new JTextArea(10, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true); // Optional: Enable word wrap

        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Example4();
    }
}