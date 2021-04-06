
package Bai1415;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class NewMain1 {

   
    public static void main(String[] args) {
        // TODO code application logic here String inputPath = "data.txt";
        String inputPath = "data.txt";
        String thisLine;
        try {
            BufferedReader myInput = new BufferedReader(new InputStreamReader(new FileInputStream(new File(inputPath))));
            while ((thisLine = myInput.readLine()) != null) {
                if (thisLine.isEmpty()) {
                    continue;
                }
                String Split[] = thisLine.split(" ");
                for (int i = 0; i < Split.length; i++) {
                    System.out.println(Split[i]);
                }
            }
        } catch (IOException e) {
        }
    }

}
