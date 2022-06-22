package com.sasimykyta.javacore.chapter08;

class B7 extends A6 {
    int k;

    B7(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show(); // эдесь вызывается метод show () из класса А
        System.out.println("k: " + k);
    }
}

