package com.sasimykyta.javacore.chapter07;
/* В данном примере конструкторы определяются в классе Вох для
   инициализации размеров параллелепипеда тремя разными способами
*/

class Box1 {
    double width;
    double height;
    double depth;

    // конструктор , используемый при указании всех размеров
    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор используемый , когда ни один из размеров не указан
    Box1() {
        width = -1;  // использовать значение - 1 для обозначения
        height = -1; // неинициализированного
        depth = -1;  // параллелепипеда
    }

    // конструктор , используемый при создании куба
    Box1(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

