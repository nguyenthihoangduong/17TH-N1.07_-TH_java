/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai6 {
private static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhập n:");
        int n = scanner.nextInt();
        
        System.out.printf("Các số nguyên tố nhỏ hơn %d là: \n",n);
        if(n>=2){
            System.out.println("2");
        }
        for(int i=3;i<n;i+=2){
            if(isPrimeNumber(i))
            {
                System.out.println(""+ i);
            }
        }
        
    }
    public static boolean isPrimeNumber (int n){
        if(n<2){
            return  false;
        }
        int squareRoot = (int)Math.sqrt(n);
        for(int i=2 ; i<=squareRoot; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    } 
            
    
}
