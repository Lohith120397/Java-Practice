package org.java.practice2.fileHandling;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;


public class AddFriend {
    public static void main(String[] args) {
        //creating a file in java
        try
        {
            System.out.printf("Enter name and phone number");
            String newName = args[0];

            long newNumber = Long.parseLong(args[1]);

            String nameNumberString;
            String name;
            long number;
            int index;

            File file = new File("abc.txt");
            if(!file.exists())
                file.createNewFile();

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;
            while(raf.getFilePointer() < raf.length())
            {
                nameNumberString = raf.readLine();

                String[] nameNumber = nameNumberString.split("!");
                name = nameNumber[0];
                number = Long.parseLong(nameNumber[1]);

                if(name == newName || number == newNumber)
                {
                    found = true;
                    break;
                }
            }

            if(!found)
            {
                nameNumberString = newName + "!" + String.valueOf(newNumber);

                raf.writeBytes(nameNumberString);
                raf.writeBytes(System.lineSeparator());

                raf.close();

            }
            else
            {
                raf.close();
                System.out.printf(" Input name does not exists. ");
            }

        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        catch (NumberFormatException nfe)
        {
            nfe.printStackTrace();
        }

    }
}
