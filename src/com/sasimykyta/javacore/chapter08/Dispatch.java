package com.sasimykyta.javacore.chapter08;

// Динамическая диспетчеризация методов
class A9 {
    void callme() {
        System.out.println("B методе callme () из класса А");
    }
}

class B9 extends A9 {
    // переопределить метод callme ()
    void callme() {
        System.out.println("B методе callme () из класса В");
    }
}

class C2 extends A9 {
    // переопределить метод callme ()
    void callme() {
        System.out.println("B методе callme () из класса С");
    }
}

class Dispatch {
    public static void main(String args[]) {
        A9 a = new A9(); // объект класса А
        B9 b = new B9(); // объект класса B
        C2 c = new C2(); // объект класса C
        A9 r; // получить ссылку на объект типа А

        r = a; // переменная r ссылается на объект типа A
        r.callme(); // вызвать вариант ме тода callme ( ) ,
        // определенный в классе А

        r = b; // переменная r ссылается на объект типа B
        r.callme(); // вызвать вариант ме тода callme ( ) ,
        // определенный в классе B

        r = c; // переменная r ссылается на объект типа C
        r.callme(); // вызвать вариант ме тода callme ( ) ,
        // определенный в классе C
    }
}
