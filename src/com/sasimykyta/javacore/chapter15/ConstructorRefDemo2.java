package com.sasimykyta.javacore.chapter15;

interface MyFuncF<T> {
    MyClassD<T> func(T n);
}

class MyClassD<T> {
    private T val;

    MyClassD(T v) { val = v; }

    MyClassD( ) { val = null;  }

    // ...

    T getVal() { return val; };
}

public class ConstructorRefDemo2 {
    public static void main(String args[])
    {
        // создать ссылку на конструктор обобщенного класса МyClass<T>
        MyFuncF<Integer> myClassCons = MyClassD<Integer>::new;

        // создать экземпляр класса МyClass<T>
        // по данной ссылке на конструктор
        MyClassD<Integer> mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc равно " + mc.getVal( ));
    }
}
