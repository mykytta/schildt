package com.sasimykyta.javacore.chapter09;


import com.sasimykyta.javacore.chapter09.MyPack.Balance2;

class TestBalance {
    public static void main(String args[]) {

    /* Класс Balance объявлен как public, поэтому им можно
       восполь зоваться и вызвать его конструктор . */
        Balance2 test = new Balance2("J. J. Jaspers", 99.88);

        test.show(); // можно также вызвать метод show ()
    }
}
