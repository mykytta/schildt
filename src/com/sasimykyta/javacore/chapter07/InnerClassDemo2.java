package com.sasimykyta.javacore.chapter07;

// Эта программа не подлежит компиляции
class Outer1 {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // это внутренний класс
    class Inner {
        int y = 10; // у - локальная переменная класса Inner
        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }

    void showy() {
       // System.out.println(y); //ошибка , здесь переменная
        // у недоступна !

    }
}

class InnerClassDemo2 {
    public static void main(String args[]) {
        Outer1 outer = new Outer1();
        outer.test();
    }
}
