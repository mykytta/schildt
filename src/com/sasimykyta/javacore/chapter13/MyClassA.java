package com.sasimykyta.javacore.chapter13;

public class MyClassA {
    int a;
    int b;

    MyClassA(int i, int j) {
        a = i;
        b = j;
    }


    MyClassA(int i) {
        this(i, i);
    }


    MyClassA() {
        this(0);
    }
}
