/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai21_giaiphuongtrinhbac2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author PC 01
 */
public class Bai21_GiaiPhuongTrinhBac2 {
    public static void Bai21()
    {
                JFrame frame = new JFrame();
                frame.setTitle("Giải Phương Trình Bậc 2");
                frame.setSize(400,400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null); // Đặt cửa sổ ở giữa màn hình
                frame.setVisible(true);
                
                //Tạo Tiêu đề phía trên cùng
                JPanel panelNorth= new JPanel();
                panelNorth.setLayout(new GridLayout(2, 1));
                JLabel label = new JLabel("Giải Phương Trình Bậc 2",SwingConstants.CENTER);
                JLabel label2 = new JLabel("Có dạng ax2 + bx + c = 0",SwingConstants.CENTER);
                label.setFont(new Font("Arial",Font.BOLD,18));
                label.setForeground(Color.BLUE);
                panelNorth.add(label);
                panelNorth.add(label2);
                frame.add(panelNorth,BorderLayout.NORTH);
               
                
                JPanel panelCenter = new JPanel();
                // Thêm khoảng cách giữa panelCenter và các thành phần khác
                panelCenter.setBorder(BorderFactory.createCompoundBorder
                (
                BorderFactory.createTitledBorder("Nhập a, b, c"),
                new EmptyBorder(10, 10, 10, 10) // Khoảng cách bên trong
                ));
                panelCenter.setLayout(new GridLayout(4, 2));
                // Tạo các thành phần
                JLabel labelA = new JLabel("Nhập a:");
                JTextField txtSoa = new JTextField();
                JLabel labelB = new JLabel("Nhập b:");
                JTextField txtSob = new JTextField();
                JLabel labelC = new JLabel("Nhập c:");
                JTextField txtSoc = new JTextField();
                JLabel labelKQ = new JLabel("Kết quả là:");
                JTextField txtKQ = new JTextField();
                // Thêm các thành phần vào panelCenter
                panelCenter.add(labelA);
                panelCenter.add(txtSoa);
                panelCenter.add(labelB);
                panelCenter.add(txtSob);
                panelCenter.add(labelC);
                panelCenter.add(txtSoc);
                panelCenter.add(labelKQ);
                panelCenter.add(txtKQ);
                frame.add(panelCenter,BorderLayout.CENTER);

                
                JPanel panelSouth= new JPanel();
                panelSouth.setLayout(new GridLayout(1, 3));
                panelSouth.setBorder(BorderFactory.createCompoundBorder
                (
                BorderFactory.createTitledBorder("Nhập a, b, c"),
                new EmptyBorder(10, 10, 10, 10) // Khoảng cách bên trong
                ));
                //Tạo các nút 
                JButton buttonGiai = new JButton("Giải");
                JButton buttonXoa = new JButton("Xóa");
                JButton buttonThoat = new JButton("Thoát");
                //Thêm nút vào Panel South
                panelSouth.add(buttonGiai);
                panelSouth.add(buttonXoa);
                panelSouth.add(buttonThoat);
                frame.add(panelSouth,BorderLayout.SOUTH); 
                
                buttonThoat.addActionListener( new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        int ret=JOptionPane.showConfirmDialog(null,"Muốn thoát hả?", "Thoát",JOptionPane.YES_NO_OPTION); 
                        if(ret==JOptionPane.YES_OPTION);
                        System.exit(0);
                    }
                });
                buttonXoa.addActionListener( new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        txtSoa.setText("");
                        txtSob.setText("");
                        txtSoc.setText("");
                        txtKQ.setText("");
                        txtSoa.requestFocus();
                    }
                });
                 buttonGiai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtSoa.getText());
                    double b = Double.parseDouble(txtSob.getText());
                    double c = Double.parseDouble(txtSoc.getText());
                    String result = giaiPhuongTrinhBac2(a, b, c);
                    txtKQ.setText(result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        }
        
        // Phương thức giải phương trình bậc 2
        private static String giaiPhuongTrinhBac2(double a, double b, double c) {
        if (a == 0) {
            return "Đây không phải là phương trình bậc 2!";
        }
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Có 2 nghiệm: x1 = " + x1 + ", x2 = " + x2;
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return "Có 1 nghiệm: x = " + x;
        } else {
            return "Phương trình vô nghiệm!";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Bai21_GiaiPhuongTrinhBac2::Bai21);
    }
}
