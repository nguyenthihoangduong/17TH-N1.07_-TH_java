
package buoi2;
import java.io.*;

public class bai9 {
    public static void main(String args[]) throws IOException{
        try(FileOutputStream os = new FileOutputStream("abc.txt")){
            String s = "Chao cac ban den voi chuong trinh doc xuat file";
            for(int i=0;i<s.length();i++)
            {
                os.write(s.charAt(i));
            }
        }
        
        try(FileInputStream is = new FileInputStream("abc.txt")){
            int ibyts = is.available();
            System.out.println("File co tat ca "+ibyts+" ky tu");
            byte ibuf[] = new byte[ibyts];
            int byrd = is.read(ibuf,0,ibyts);
            System.out.println("Tong so ky tu duoc la:" + byrd);
            System.out.println("Chuoi ky tu la: " + new String(ibuf));
        }
        File fl = new File("abc.txt");
        fl.delete();
    }
}
