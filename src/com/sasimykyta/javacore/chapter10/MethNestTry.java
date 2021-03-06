package com.sasimykyta.javacore.chapter10;

// Операторы try могут быть неявно вложены в вызовы методов
public class MethNestTry {
    static void nesttry(int a) {
        try { // вложенный блок оператора try
      /* Если указан один аргумент командной строки
         то исключение в связи с делением на нуль
         будет сгенерировано в следующем коде. */
            if (a == 1) a = a / (a - a); // деление на нуль

      /* Если указаны два аргумента командной строки
      * то генерируется исключение в связи с выходом
      * за передлы массива
      *  */
            if (a == 2) {
                int c[] = {1};
                c[42] = 99; // здесь генерируется исключение в связи
                            // с выходом за передлы массива
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами массива: " + e);
        }
    }

    public static void main(String args[]) {
        try {
            int a = args.length;

      /* Если не указаны аргументы строки,
      * в следующем операторе будет сгенерировано
      * исключение в связи с делением на нуль. */
            int b = 42 / a;

            System.out.println("a = " + a);

            nesttry(a);
        } catch(ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        }
    }
}
