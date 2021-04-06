/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import javax.swing.*;  
/**
 *
 * @author Admin
 */
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         JFrame myFrame = new JFrame("Hello World!");  
        myFrame.setSize(300, 150); //kích thước JFrame 
        myFrame.setVisible(true);  
        JLabel lbName=new JLabel(); 
        lbName.setText("Chào các bạn!"); 
        myFrame.add(lbName);// Thêm jLabel vài JFrame 
    }
    
}
