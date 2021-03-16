/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author Administrator
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        
        System.out.println("Nhập vào số nguyên dương a:");
        int firstNumber= scanner.nextInt();
        System.out.println("Nhập vào số nguyên dương b:");
        int secondNumber= scanner.nextInt();
        
        System.out.println("UCLN của"+ firstNumber + " và" + secondNumber + " là:" + UCLN(firstNumber,secondNumber));
        System.out.println("BCNN của"+ firstNumber + " và" + secondNumber + " là:" + BCNN(firstNumber,secondNumber));
        
    }
    public static int UCLN(int firstNumber,int secondNumber ) {
        if (secondNumber == 0) return firstNumber;
        return UCLN(secondNumber,firstNumber % secondNumber );
    }
    public static int BCNN(int firstNumber,int secondNumber ) {
        
        return (firstNumber * secondNumber)/UCLN(firstNumber,secondNumber) ;
    }
}

