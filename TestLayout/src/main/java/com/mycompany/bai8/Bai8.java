package com.mycompany.bai8;


import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Bai8 extends JPanel {
    public Bai8() {
        this.setLayout(new BorderLayout());
        this.setBorder(new EmptyBorder(10, 10, 10, 10));

        Box row = Box.createHorizontalBox();
        row.add(new JButton("Button 1"));
        row.add(new JButton("Button 2"));
        row.add(new JButton("Button 3"));
        row.add(new JButton("Button 4"));
        this.add(row, BorderLayout.NORTH);

        JPanel col = new JPanel();
        col.setLayout(new BoxLayout(col, BoxLayout.Y_AXIS));
        col.setBorder(new TitledBorder(new EtchedBorder(), "Column"));
        col.add(new JButton(" Button 1"));
        col.add(new JButton(" Button 2"));
        col.add(new JButton(" Button 3"));
        this.add(col, BorderLayout.EAST);

        Box buttonbox = Box.createHorizontalBox();
        buttonbox.add(Box.createHorizontalGlue());
        buttonbox.add(new JButton("OK"));
        buttonbox.add(Box.createHorizontalGlue());
        buttonbox.add(new JButton("Cancel"));
        buttonbox.add(Box.createHorizontalGlue());
        buttonbox.add(new JButton("Help"));
        this.add(buttonbox, BorderLayout.SOUTH);

        JTextArea textarea = new JTextArea();
        textarea.setText("01010 10101010 01010 10101 0101010 101010101 010101 010 1001");
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);

        Box fixedcol = Box.createVerticalBox();
        fixedcol.add(Box.createVerticalStrut(12));
        fixedcol.add(textarea);
        fixedcol.add(Box.createVerticalStrut(72));

        Box fixedrow = Box.createVerticalBox();
        fixedrow.add(Box.createVerticalStrut(12));
        fixedrow.add(fixedcol);
        fixedrow.add(Box.createVerticalStrut(72));
        this.add(fixedrow, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setTitle("Layout Manager");
        f.setContentPane(new Bai8());
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
