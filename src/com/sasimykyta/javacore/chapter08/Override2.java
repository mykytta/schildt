package com.sasimykyta.javacore.chapter08;

// Методы с отличающимися сигнатурами считаются
// перегружаемыми, а не переопределяемыми
class A8 {
    int i, j;

    A8(int a, int b) {
        i = a;
        j = b;
    }

    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

// создать подкласс путем расширения класса А
class B8 extends A8 {
    int k;

    B8(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // перегрузить метод show ()
    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Override2 {
    public static void main(String args[]) {
        B8 subOb = new B8(1, 2, 3);

        subOb.show("This is k: "); // вызвать метод show () из класса В
        subOb.show(); // вызвать метод show () из класса А
    }
}