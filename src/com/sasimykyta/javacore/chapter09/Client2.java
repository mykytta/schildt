package com.sasimykyta.javacore.chapter09;

class Client2 implements Callback {
    // реализовать интерфейс Callback
    public void callback(int p) {
        System.out.println("Метод callback (), вызываемый со значением " + p);
    }

    void nonIfaceMeth() {
        System.out.println("B классах , реализующих интерфейсы , " +
                "могут определяться и другие члены.");
    }
}
