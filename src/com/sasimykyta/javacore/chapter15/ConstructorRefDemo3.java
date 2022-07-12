package com.sasimykyta.javacore.chapter15;

interface MyFuncG<R, T> {
    R func(T n);
}

// Простой обобщенный класс
class MyClassE<T> {
    private T val;


    MyClassE(T v) { val = v; }

    MyClassE() { val = null; }
    // ...

    T getVal() { return val; };
}

// Простой необобщенный класс
class MyClass2 {
    String  str;

    // Конструктор, принимающий один аргумент
    MyClass2(String s) { str = s; }

    // Конструктор по умолчанию . Этот конструктор в
    // данной программе НЕ используется
    MyClass2() { str = ""; }

    // ...

    String getVal() { return str; };
}

public class ConstructorRefDemo3 {
    // Фабричный метод для объектов разных классов.
    // У каждого класса должен быть свой конструктор,
    // принимающий один параметр типа Т . А параметр R
    // обозначает тип создаваемого объекта
    static <R,T> R myClassFactory(MyFuncG<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String args[])
    {
        // Создать ссылку на конструктор класса MyClassE
        // В данном случае оператор new обращается к конструктору,
        // принимающему аргумент
        MyFuncG<MyClassE<Double>, Double> myClassCons = MyClassE<Double>::new;

        // создать экземпляр типа класса МyClass, используя фабричный метод
        MyClassE<Double> mc = myClassFactory(myClassCons, 100.1);

        // использовать только что созданный экземпляр класса МyClass
        System.out.println("Значение val в объекте mc равно " + mc.getVal( ));

        // А теперь создать экземпляр другого класса ,
        // используя метод myClassFactory()
        MyFuncG<MyClass2, String> myClassCons2 = MyClass2::new;

        // создать экземпляр класса МyClass2, используя фабричный метод
        MyClass2 mc2 = myClassFactory(myClassCons2, "Лямбда");

        // использовать только что созданный экземпляр класса МyClass
        System.out.println("Значение str в объекте mc2 равно " + mc2.getVal( ));
    }
}
