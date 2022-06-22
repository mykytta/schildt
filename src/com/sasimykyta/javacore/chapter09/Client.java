package com.sasimykyta.javacore.chapter09;

class Client implements Callback {
    // реализовать интерфейс Callback
    public void callback(int p) {
        System.out.println("Метод callback (), вызываемый со значением " + p);
    }
}

