package com.sasimykyta.javacore.chapter06;

// Проограмма использующая класс Box


public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();

        double vol;
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.depth * myBox.height * myBox.width;
        System.out.println("Объем равен " + vol);
    }
}
