package com.sasimykyta.javacore.chapter18;

// Продемонстрировать применение класса LinkedList
import java.util.*;

public class LinkedListDemo {
    public static void main(String args[]) {
        // создать связной список
        LinkedList<String> ll = new LinkedList<String>();

        // добавить элементы в связной список
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");

        ll.add(1, "A2");

        System.out.println("Исходное содержмое связного списка ll: " + ll);

        // удалить элементы из связногоо списка
        ll.remove("F");
        ll.remove(2);

        System.out.println("Содержимое связного списка ll после удаления элементов: "
                + ll);

        // удалить первый и последний элемент из связного списка
        ll.removeFirst();
        ll.removeLast();

        System.out.println("Содержимое связного списка ll после удаления : "
                + ll);

        // получить и присвоить значение
        String val = ll.get(2);
        ll.set(2, val + " Changed");

        System.out.println("Содержимое связного списка ll после зминениия: " + ll);
    }
}
