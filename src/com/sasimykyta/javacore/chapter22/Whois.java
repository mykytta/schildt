package com.sasimykyta.javacore.chapter22;

// Продемонстрировать обращение с сокетами
import java.net.*;
import java.io.*;

public class Whois {
    public static void main(String args[]) throws Exception {
        int c;

        // Создать  сокетное соединение с вес-сайтом internic.net 11 через порт 43
        Socket s = new Socket("whois.internic.net", 43);

        // получить потоки ввода-вывода
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        //сформировать строку запроса
        String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";
        // преобразовать строку в Сайты
        byte buf[] = str.getBytes();

        // послать запрос
        out.write(buf);

        // прочитать ответ и вывести его на экран
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        s.close();
    }
}

