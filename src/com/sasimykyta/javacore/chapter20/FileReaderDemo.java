package com.sasimykyta.javacore.chapter20;

import java.io.*;

public class FileReaderDemo {
    public static void main(String args[]) {

        try ( FileReader fr = new FileReader("src/com/sasimykyta/javacore/chapter20/FileReaderDemo.java") )
        {
            int c;

            //прочитать и вывести содержимое файла
            while((c = fr.read()) != -1) System.out.print((char) c);

        } catch(IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
