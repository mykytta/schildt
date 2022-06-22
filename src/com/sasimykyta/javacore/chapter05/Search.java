package com.sasimykyta.javacore.chapter05;

// Поиск в массиве с примением цикла for в стиле for each
public class Search {
    public static void main(String[] args) {
         int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4};
         int val = 5;
         boolean found = false;

         for(int x: nums){
             if(val == x){
                 found = true;
                 break;
             }
         }
         if(found)
             System.out.println("Знайчение найдено!");
    }
}
