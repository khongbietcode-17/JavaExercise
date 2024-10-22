/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai22_congtrunhanchia;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 *
 * @author PC 01
 */
public class Bai22_CongTruNhanChia {
    public static void Bai22()
            {
                JFrame frame = new JFrame();
                frame.setTitle("Cong Tru Nhan Chia");
                frame.setSize(400,400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null); // Đặt cửa sổ ở giữa màn hình
                frame.setVisible(true);
                
                //Tao label tren cung
                JLabel label = new JLabel("Cộng Trừ Nhân Chia",SwingConstants.CENTER);
                label.setFont(new Font("Arial",Font.BOLD,18));
                label.setForeground(Color.BLUE);
                frame.add(label,BorderLayout.NORTH);
                
                //Tao panel ben trai
                JPanel panel = new JPanel();
                JButton buttonGiai = new JButton("Giải");// Tao nut
                JButton buttonXoa = new JButton("Xóa");
                JButton buttonThoat = new JButton("Thoát");
                panel.setLayout(new GridLayout(3, 1));// SetLayout 3 hang 1 cot 
                panel.setBorder(new TitledBorder("Chọn tác vụ"));
                panel.add(buttonGiai);//Them cac button vao panel
                panel.add(buttonXoa);
                panel.add(buttonThoat);
                panel.setBorder(new TitledBorder("Chọn tác vụ"));
                frame.add(panel,BorderLayout.WEST);// Dat panel ben trai
                
               
                //Tao panel ben phai
                JPanel xulypanel = new JPanel();
                xulypanel.setLayout(new BorderLayout());
                xulypanel.setBorder(new TitledBorder("Nhập hai số a và b"));
                frame.add(xulypanel,BorderLayout.CENTER);//Cho panel nam chinh giua 
                //Tao panel tren trong panel XULY
                JPanel panelAB = new JPanel();
                panelAB.setLayout(new GridLayout(4, 1));
                JLabel labelA = new JLabel("Nhập A:");
                JTextField inputA = new JTextField();
                JLabel labelB = new JLabel("Nhập B:");
                JTextField inputB = new JTextField();
                panelAB.add(labelA);     
                panelAB.add(inputA);
                panelAB.add(labelB);
                panelAB.add(inputB);
                xulypanel.add(panelAB,BorderLayout.NORTH);
                //Tao panel giua trong panel XULY
                JPanel panelChon = new JPanel();
                panelChon.setBorder(new TitledBorder("Chọn phép tính"));
                panelChon.setLayout(new GridLayout(2, 2));
                JCheckBox congCheck = new JCheckBox("Cộng");
                JCheckBox truCheck = new JCheckBox("Trừ");
                JCheckBox nhanCheck = new JCheckBox("Nhân");
                JCheckBox chiaCheck = new JCheckBox("Chia");
                panelChon.add(congCheck);
                panelChon.add(truCheck);
                panelChon.add(nhanCheck);
                panelChon.add(chiaCheck);
                xulypanel.add(panelChon,BorderLayout.CENTER);
                //Tao panel duoi cung trong panel XULY
                JPanel panelKQ= new JPanel();
                panelKQ.setLayout(new GridLayout(2, 1));
                JLabel labelKQ = new JLabel("Kết quả:");
                JTextField inputKQ = new JTextField();
                panelKQ.add(labelKQ);     
                panelKQ.add(inputKQ);
                xulypanel.add(panelKQ,BorderLayout.SOUTH);
                
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
                        inputA.setText("");
                        inputB.setText("");
                        inputKQ.setText("");
                        inputA.requestFocus();
                    }
                });
                 
                buttonGiai.addActionListener( new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        String numberA=inputA.getText();
                        int a=0,b=0;
                        try
                        {
                            a=Integer.parseInt(numberA);// Doi a thanh so nguyen
                        }catch(Exception ex)
                        {
                            JOptionPane.showMessageDialog(null,	"a nhập sai	 định dạng!");
                            inputA.selectAll();
                            inputA.requestFocus();
                            return;
                        }
                        String numberB=inputB.getText();
                        try
                        {
                            b=Integer.parseInt(numberB);// Doi a thanh so nguyen
                        }catch(Exception ex)
                        {
                            JOptionPane.showMessageDialog(null,	"a nhập sai	 định dạng!");
                            inputA.selectAll();
                            inputA.requestFocus();
                            return; 
                        }
                        double kq=0;
if(congCheck.isSelected()){
kq=(a+b);
}
else if(truCheck.isSelected()){
kq=(a-b);
}
else if(nhanCheck.isSelected()){
kq=(a*b);
}
else{
kq=a*1.0/b*1.0;
}
inputKQ.setText(kq+" ");
}
});
            }
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Bai22_CongTruNhanChia::Bai22);
    }
}
