package com.sasimykyta.javacore.chapter08;

// Простой пример абстракции
abstract class A10 {
    abstract void callme();

    // абстрактные классы все же могут содержать конкретные методы
    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}

class B10 extends A10 {
    void callme() {
        System.out.println("Этo конкретный метод.");
    }
}

class AbstractDemo {
    public static void main(String args[]) {
        B10 b = new B10();

        b.callme();
        b.callmetoo();
    }
}

