package com.sasimykyta.javacore.chapter07;

class Box {
    double width;
    double height;
    double depth;

    // Это конструктор класса Box.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}