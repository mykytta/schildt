package com.sasimykyta.javacore.chapter18;

// Продемонстрировать применение класса HashSet
import java.util.*;

public class HashSetDemo {
    public static void main(String args[]) {
        // создать хеш-множество
        HashSet<String> hs = new HashSet<String>();

        // ввести элементы в хеш-множество
        hs.add("Бэта");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        System.out.println(hs);
    }
}
