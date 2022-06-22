package com.sasimykyta.javacore.chapter08;

// Расширение класса BoxWeiqht включением в него
// поля стоимости доставки

// создать сначала класс Вох
class Box4 {
    private double width;
    private double height;
    private double depth;

    // сконструировать клон объекта
    Box4(Box4 ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор , применяемый при указании всех размеров
    Box4(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор , применяемый в отсутствие размеров
    Box4() {
        width = -1;  // значение -1 служит для обозначения
        height = -1; // неинициализированного
        depth = -1;  // параллелепипеда
    }

    // конструктор, применяемый при создании куба
    Box4(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

// добавить поле веса
class BoxWeight4 extends Box4 {
    double weight; // вес параллелепипеда

    // сконструировать клон объекта
    BoxWeight4(BoxWeight4 ob) { // передать объект конструктору
        super(ob);
        weight = ob.weight;
    }

    // конструктор, применяемый при указании всех параметров
    BoxWeight4(double w, double h, double d, double m) {
        super(w, h, d); // call superclass constructor
        weight = m;
    }

    // конструктор , применяемый по умолчанию
    BoxWeight4() {
        super();
        weight = -1;
    }

    // конструктор , применяемый при создании куба
    BoxWeight4(double len, double m) {
        super(len);
        weight = m;
    }
}

// добавить поле стоимости доставки
class Shipment extends BoxWeight4 {
    double cost;

    // сконструировать клон объекта
    Shipment(Shipment ob) { // pass object to constructor
        super(ob);
        cost = ob.cost;
    }

    // конструктор , используемый при указании всех параметров
    Shipment(double w, double h, double d,
             double m, double c) {
        super(w, h, d, m); // call superclass constructor
        cost = c;
    }

    // конструктор, применяемый по умолчанию
    Shipment() {
        super();
        cost = -1;
    }

    // конструктор , применяемый при создании куба
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String args[]) {
        Shipment shipment1 =
                new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 =
                new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println("Oбъeм shipment1 равен " + vol);
        System.out.println("Bec shipment1 равен "
                + shipment1.weight);
        System.out.println("Cтoимocть доставки : $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Oбъeм shipment2 равен " + vol);
        System.out.println("Bec shipment2 равен "
                + shipment2.weight);
        System.out.println("Cтoимocть доставки : $" + shipment2.cost);
    }
}
