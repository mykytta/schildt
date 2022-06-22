package com.sasimykyta.javacore.chapter08;

// Переопределение метода
class A6 {
    int i, j;

    A6(int a, int b) {
        i = a;
        j = b;
    }

    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B6 extends A6 {
    int k;

    B6(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // вывести содержимое переменной k с помощью метода ,
    // переопределяющего метод show () из класса А
    void show() {
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String args[]) {
        B6 subOb = new B6(1, 2, 3);

        subOb.show(); // здесь вызывается метод show () из класса В
    }
}
