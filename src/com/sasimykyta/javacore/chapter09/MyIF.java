package com.sasimykyta.javacore.chapter09;

public interface MyIF {
    // Это объявление обычного метода в интерфейсе .
    // Он НЕ предоставляет реализацию по умолчанию
    int getNumber();

    // А это объявление метода по умолчанию . Обратите
    // внимание на его реализацию по умолчанию
    default String getString() {
        return "Default String";
    }
}
