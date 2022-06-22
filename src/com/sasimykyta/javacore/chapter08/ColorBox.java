package com.sasimykyta.javacore.chapter08;

// Этот класс расширяет класс Вох, включая в него свойство цвета
class ColorBox extends Box {
    int color; // цвет параллелепипеда

    ColorBox(double w, double h, double d, int c) {
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}
