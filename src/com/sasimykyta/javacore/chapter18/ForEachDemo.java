package com.sasimykyta.javacore.chapter18;

// применение цикла for в стиле for each
// для перебора элементов в массиве
import java.util.*;

public class ForEachDemo {
    public static void main(String[] args) {
        // создать списочный массив для целых чисел
        ArrayList<Integer> vals = new ArrayList<Integer>();

        // ввести числовые значения в списочный массив
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        // организовать цикл для вывода числовых значений
        System.out.print("Исходное содержимое массива vals: ");
        for(int v : vals)
            System.out.print(v + " ");
        System.out.println();

        // Суммировать числовые значения в цикле for
        int sum = 0;
        for(int v : vals)
            sum += v;

        System.out.println("Сумма числовых значений: " + sum);
    }
}
