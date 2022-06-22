package com.sasimykyta.javacore.chapter09;

// Использовать метод по умолчанию
class DefaultMethodDemo {
    public static void main(String args[]) {

        MyIFImp obj = new MyIFImp();

        // Метод qetNWllЬer ( ) можно вызвать , т.к. он явно реализован
        // в классе МyIFImp:
        System.out.println(obj.getNumber());

        // Метод getString () также можно вызвать, т.к. в интерфейсе
        // имеется его реализация по умолчанию :
        System.out.println(obj.getString());
    }
}
