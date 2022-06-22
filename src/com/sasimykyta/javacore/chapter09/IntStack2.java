package com.sasimykyta.javacore.chapter09;

interface IntStack2 {
    void push(int item); // сохранить элемент в стеке
    int pop(); // извлечь элемент из стека

    // У метода clear () теперь имеется вариант по умолчанию, поэтому
    // его придется реализоваться в том существующем классе , где уже
    default void clear() {
        System.out.println("Метод clear () не реализован.");
    }
}
