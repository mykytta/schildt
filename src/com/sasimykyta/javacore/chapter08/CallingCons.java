package com.sasimykyta.javacore.chapter08;

// Продемонстрировать порядок вызова конструкторов

// создать суперкласс
class A5 {
    A5() {
        System.out.println("B конструкторе А .");
    }
}

// Create a subclass by extending class A.
class B5 extends A5 {
    B5() {
        System.out.println("B конструкторе B.");
    }
}

// Create another subclass by extending B.
class C extends B5 {
    C() {
        System.out.println("B конструкторе C");
    }
}

class CallingCons {
    public static void main(String args[]) {
        C c = new C();
    }
}
