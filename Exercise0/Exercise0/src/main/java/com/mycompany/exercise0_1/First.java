/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise0_1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author PC 01
 */
public class First extends JFrame
    {
    public First(){
    setTitle("DemoJFrame");//Tiêu đề JFrame
    setSize(300,200);//Kích thước của JFrame
    

    setDefaultCloseOperation(EXIT_ON_CLOSE);//Thoát chương trình khi click nút exit
    setLocationRelativeTo(null);//Canh giữa màn hình
    setResizable(false);//không cho phép thay đổi kích thước JFrame
//các thuộc tính khác JFrame
    setLayout(new FlowLayout());
    JButton button1 = new JButton("Click Me!");
    JButton button2 = new JButton("Click Me!");
    add(button1);
    add(button2);
 
    
    }
    public static void main(String[]args)
    {
    new First().setVisible(true);//Hiển thị JFrame
    }
    }
