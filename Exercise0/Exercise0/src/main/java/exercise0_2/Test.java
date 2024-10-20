/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise0_2;

import javax.swing.JDialog;

/**
 *
 * @author PC 01
 */


    public class Test extends JDialog{
    public Test()	{
    setTitle("Demo	JDialog");	//Tiêu đề của hộp thoại JDialog
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);	//Đóng hộp thoại
    setSize(300,200);
    setResizable(false);
   
    //Các thuộc tính khác
    }
    public static void main(String[]	args)	{
    new Test().setVisible(true);
    }

    private void setJButton(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
    

