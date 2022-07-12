package com.sasimykyta.javacore.chapter13;

import java.io.*;

public class CopyFileA {
    public static void main(String args[]) throws IOException
    {
        int i;

        // сначала убедиться что заданы оба файла
        if(args.length != 2) {
            System.out.println("Использование: CopyFile откуда куда");
            return;
        }

        // Open and manage two files via the try statement.
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1]))
        {

            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);

        } catch(IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
