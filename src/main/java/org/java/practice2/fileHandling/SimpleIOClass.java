package org.java.practice2.fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleIOClass {
    public static void main(String[] args) throws IOException {
        /*InputStreamReader isr;
        System.out.println("Enter any character or 0 to exit");
        isr = new InputStreamReader(System.in);
        char c;
        do {
            c = (char)isr.read();
            System.out.println(c);
        }while(c != '0');*/

        FileInputStream fIS = null;
        FileOutputStream fOS = null;

        try {
            fIS = new FileInputStream("abx.txt");
            fOS = new FileOutputStream("file1.txt");

            int temp;
            while((temp = fIS.read()) != -1 )
            {
                fOS.write((byte) temp);
            }
        }
        finally {
            if(fIS != null)
                fIS.close();
            if(fOS != null)
                fOS.close();
        }

    }
}
