package com.sasimykyta.javacore.chapter03;
// Демонстрация области действия блока кода
public class Scope {
    public static void main(String[] args) {
        int x;

        x = 10;

        if(x == 10) {   // начало новой области действия,
            int y = 20; // доступной только этому блоку кода

            System.out.println("x и y: " + x + " " + y);
        }

        // y = 100; ОШИБКА!

        System.out.println("x  равно " + x);
    }
}
