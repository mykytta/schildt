package com.sasimykyta.javacore.chapter18;

// Продемонстрировать применение класса ArrayList
import java.util.*;

class ArrayListDemo {
    public static void main(String args[]) {
        // создать списочный массив
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Начальный размер спиисоочногоо массива al: " +
                al.size());

        // ввести элементы в списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println("Размер спсочного массива al после ввода элементов: " +
                al.size());

        // вывести списочный массив
        System.out.println("Contents of al: " + al);

        // удалить элементы из списочного массива
        al.remove("F");
        al.remove(2);

        System.out.println("Размер списочногоо массива al после удаления элементов: " +
                al.size());
        System.out.println("Содержимое списочногоо массива: " + al);
    }
}
