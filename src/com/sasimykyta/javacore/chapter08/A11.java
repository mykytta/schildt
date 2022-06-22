package com.sasimykyta.javacore.chapter08;

class A11 {
    final void meth() {
        System.out.println("Этo завершенный метод .");
    }
}

class B11 extends A11 {
    //void meth() { // ОШИБКА ! Этот метод не может быть переопределен.
    //    System.out.println("Heдonycтимo!");
    //   }
}

