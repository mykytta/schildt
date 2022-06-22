package com.sasimykyta.javacore.chapter07;

class OverloadCons {
    public static void main(String args[]) {
        // создать параллелепипеды, используя разные
        // конструкторы
        Box1 mybox1 = new Box1(10, 20, 15);
        Box1 mybox2 = new Box1();
        Box1 mycube = new Box1(7);

        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        // получить объем куба
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
    }
}