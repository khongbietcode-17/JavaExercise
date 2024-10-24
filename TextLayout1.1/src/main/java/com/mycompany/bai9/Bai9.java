package com.mycompany.bai9;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai9 {

    private String[] buttonText = {"C", ".", "/", "*", "7", "8", "9", "-","4", "5", "6", "+", "1", "2", "3","=", "0", "+/-"};
    private JButton[] button = new JButton[buttonText.length];
    private int counter = 0;

    private void createAndDisplayGUI() {
        JFrame frame = new JFrame("Caculator");// Ten cua JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Bam x dong JFrame
        
        JPanel contentPane = new JPanel();// Tao Panel
        contentPane.setLayout(new BorderLayout()); // Set BorderLayout
        
        JPanel northPanel = new JPanel(new BorderLayout());
        
        JTextField tfield = new JTextField();
        northPanel.add(tfield, BorderLayout.CENTER);
        
        JPanel centerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.anchor = GridBagConstraints.PAGE_START;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(2, 2, 2, 2);
        
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton(buttonText[i]);
            System.out.println("Button Text: " + buttonText[i]);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (counter < button.length) {
                    gbc.gridx = j;
                    gbc.gridy = i;
                    centerPanel.add(button[counter++], gbc);
                }
            }
        }

        contentPane.add(northPanel, BorderLayout.PAGE_START);
        contentPane.add(centerPanel, BorderLayout.CENTER);
        
        frame.setContentPane(contentPane);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Bai9().createAndDisplayGUI();
    }
}
