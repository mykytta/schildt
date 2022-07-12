package com.sasimykyta.javacore.chapter15;

//Продемонстрировать применение ссылки на конструктор
// В функциональном интерфейсе МyFunc определяется метод,
// возвращающий ссылку на класс МyClass
interface MyFuncE {
    MyClassC func(int n);
}

class MyClassC {
    private int val;

    MyClassC(int v) { val = v; }

    MyClassC() { val = 0; }

    // ...

    int getVal() { return val; };
}

public class ConstructorRefDemo {
    public static void main(String args[])
    {
        // Создать ссылку на конструктор класса МyClass .
        // Метод func() из интерфейса МyFunc принимает аргумент,
        // поэтому оператор new обращается к параметризированному
        // конструктору класса МyClass, а не к его конструктору по умолчанию
        MyFuncE myClassCons = MyClassC::new;

        // создать экземпляр класса МyClass по ссылке на его конструктор
        MyClassC mc = myClassCons.func(100);

        // использовать только что созданный экземпляр класса МyClass
        System.out.println("Значение val в объекте mc равно " + mc.getVal( ));
    }
}
