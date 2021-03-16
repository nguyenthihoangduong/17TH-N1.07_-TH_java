/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.io.*;
import java.util.*;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Scanner x = new Scanner(System.in);
        System.out.println("nhập mã sinh viên:");
        String masv =  x.nextLine();
        
        System.out.println("nhập tuổi:");
        Byte  tuoi=  x.nextByte();
        
        System.out.println("nhập năm sinh:");
          int ns=  x.nextInt();
          
        System.out.println("nhập điểm trung bình:");
        float  dtb=  x.nextFloat();
    }
    
}
