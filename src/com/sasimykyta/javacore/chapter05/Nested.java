package com.sasimykyta.javacore.chapter05;

// Циклы могут быть вложенными
public class Nested {
    public static void main(String[] args) {
        int i, j;

        for(i = 0; i < 10; i++){
            for(j = i; j < 10; j++)
                System.out.print(".");
            System.out.println();
        }
    }
}
