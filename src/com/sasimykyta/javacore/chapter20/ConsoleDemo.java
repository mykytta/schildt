package com.sasimykyta.javacore.chapter20;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String args[]) {
        String str;
        Console con;

        // получить ссылку на консоль
        con = System.console();
        // выйти из программы, если консоль недоступна
        if(con == null) return;

        // прочитать строку и вывести ее
        str = con.readLine("Введите строку: ");
        con.printf("Бведенная вами строка: %s\n", str);
    }
}
