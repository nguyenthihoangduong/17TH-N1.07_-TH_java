
package buoi2;
import java.io.*;
import java.util.Scanner;
import java.math.*;
import java.util.Random;

public class bai2 {
   public static void main(String[] args) {
        int[] a;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = scanner.nextInt();

        a = new int[n];
        nhap(a,n);

        System.out.print("Cac so nguyen to la: ");
        for (int i=0;i<n;i++) {
            if (check(a[i])  )
                System.out.print(a[i] + " ");
        }
        System.out.println("");
        //g?i hàm s?p x?p
        //in hàm sau khi s?p x?p         
        sapxep(a,n);

    }
    public static void nhap(int a[],int n){
         Random rand = new Random();
        // t?o d?i tu?ng scanner d? nh?p
        for (int i=0;i<n;i++)
            a[i] = rand.nextInt(50);
    }
    
    public static void xuat(int a[],int n){
    for (int i=0;i<n;i++)
        System.out.print("\t" + a[i]);
    }

    public static boolean check(int n){
        if(n<=1) return false;
        for (int i = 2;i<= Math.sqrt(n); i++)
            if(n%i==0) return false;
        //N?u không chia h?t thì tr? v? true
        return true;
    }
 
    public static void sapxep(int a[],int n){
        for (int i =0;i<n;i++)
            for (int j=0;j<n-1;j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
    }
}
