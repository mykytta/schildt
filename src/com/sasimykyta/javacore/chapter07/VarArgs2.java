package com.sasimykyta.javacore.chapter07;

// Использовать аргументы переменной длины вместе
// со стандартными аргументами
class VarArgs2 {

    // В данном примере шsg - обычный параметр,
    // а v - параме тр переменной длины
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length +
                " Contents: ");

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        vaTest("Один параметр переменной длины : ", 10);
        vaTest("Tpи параметра переменной длины : ", 1, 2, 3);
        vaTest("Бeз параметров переменной длины : ");
    }
}