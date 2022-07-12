package com.sasimykyta.javacore.chapter10;

// Продемонстрировать цепочки исключений
public class ChainExcDemo {
    static void demoproc() {
        // создать исключение
        NullPointerException e =
                new NullPointerException("верхний уровень");

        // добвавить причину исключения
        e.initCause(new ArithmeticException("причина"));

        throw e;
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            // вывести исключение верхнего уровня
            System.out.println("Перехвачено исключение: " + e);

            System.out.println("Первопричина: " +
                    e.getCause());
        }
    }
}
