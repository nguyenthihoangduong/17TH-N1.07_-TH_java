/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        
        System.out.println("Nhập vào số thứ nhất:");
        int firstNumber= scanner.nextInt();
        System.out.println("Nhập vào số thứ hai:");
        int secondNumber= scanner.nextInt();
        
        int tich= firstNumber * secondNumber;
        System.out.println(firstNumber + "*" + secondNumber + "=" + tich );
        
        float thuong= (float) firstNumber / secondNumber;
        System.out.println(firstNumber + "/" + secondNumber + "=" + thuong );
        
       
        
        
        
    }
    
}
