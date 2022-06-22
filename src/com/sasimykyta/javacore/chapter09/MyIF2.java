package com.sasimykyta.javacore.chapter09;

public interface MyIF2 {
    // Это объявление обычного ме тода в интерфейсе .
    // Он НЕ предоставляет реализацию по умолчанию
    int getNumber();

    // А это объявление ме тода по умолчанию . Обратите
    // внимание на его реализацию по умолчанию
    default String getString() {
        return "Default String";
    }

    // Это объявление статического метода в интерфейсе
    static int getDefaultNumber() {
        return 0;
    }
}

