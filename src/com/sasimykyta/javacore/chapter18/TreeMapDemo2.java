package com.sasimykyta.javacore.chapter18;

// исполь зовать компаратор для сортировки счетов
// по фамилиям вкладчиков
import java.util.*;

// сравнить последние слова в обеих символьных строках
class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;

        // Find index of beginning of last name.
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');

        k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        if(k==0) // Фамилии совпадают , проверить имя и фамилию полностью
            return aStr.compareToIgnoreCase(bStr);
        else
            return k;
    }

    // переопределять метод equals () не требуется
}

class TreeMapDemo2 {
    public static void main(String args[]) {
        //создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

        // ввести элементы в древовидное отображение
        tm.put("Джон Доу", 3434.34);
        tm.put("Том Смит", 123.22);
        tm.put("Джейн Бейкер", 1378.00);
        tm.put("Тод Холл", 99.22);
        tm.put("Ральф Смит", -19.08);

        // получить множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // вывести элементы из множества
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // внести сумму 1000 на счет Джона Доу
        double balance =  tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);

        System.out.println("Новый остаток на счете Джона Доу: " +
                tm.get("Джон Доу"));
    }
}
