package com.sasimykyta.javacore.chapter03;
/*
* Вычислить расстояние, проходимое светом
* используя переменные типа long
* */
public class Light {
    public static void main(String[] args) {
        long lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}
