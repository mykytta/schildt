package com.sasimykyta.javacore.chapter13;

import java.io.*;

// Использовать класс BufferReader для чтения с консоли
public class BRRead {
    public static void main(String args[]) throws IOException
    {
        char c;
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите символы, 'q' to quit.");
        // читать символы
        do {
            c = (char) br.read();
            System.out.println(c);
        } while(c != 'q');
    }
}
