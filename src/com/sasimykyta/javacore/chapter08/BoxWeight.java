package com.sasimykyta.javacore.chapter08;

// Теперь в классе BoXWeiqht ключевое слово super используется
// для инициализации собственных свойств объекта типа Вох
class BoxWeight1 extends Box {
    double weight; // вес параллелепипеда

    // инициализировать поля width, heiqht и depth
    // с помощью метода super ()
    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d); // вызвать конструктор суперкласса
        weight = m;
    }
}
