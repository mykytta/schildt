package com.sasimykyta.javacore.chapter05;
// Продемонстрироовать применение оператора цикла while
public class While {
    public static void main(String[] args) {
        int n = 10;

        while(n > 0) {
            System.out.println("такт " + n);
            n--;
        }
    }
}
