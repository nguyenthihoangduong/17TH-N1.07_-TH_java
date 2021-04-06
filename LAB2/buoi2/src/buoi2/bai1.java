
package buoi2;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class bai1 {
   
    public static void main(String[] args) {
        // TODO code application logic here
         int paramA, paramB, paramC;
        float x1, x2, detail;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhap he so a= ");
        paramA = scan.nextInt();
        
        System.out.println("Nhap he so b= ");
        paramB = scan.nextInt();
        
        System.out.println("Nhap he so c= ");
        paramC = scan.nextInt();
        
        detail = (paramB*paramB - (4*paramA*paramC))/(2*paramA);
        if (detail<0) {
            System.out.println("PT  vo nghiem");
        } else if(detail==0) {
            x1=x2= (-paramB/(2*paramA));
            System.out.println("PT co nghiem kep x1 = x2= " + x1);
        }
        else {
            x1 = (float) ((-paramB + sqrt(detail))/(2*paramA));
            x2 = (float) ((-paramB - sqrt(detail))/(2*paramA));
            System.out.println("PT co 2 nghiem:" + "\n" + "x1 = " + x1 + "\n" + "x2 = " + x2);
        } 
    }
    
}
