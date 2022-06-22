package com.sasimykyta.javacore.chapter07;

//Аргументы переменной длины, перегрузка и неоднозначность
//
// Эта программа содержит ошибку, и поэтому не может быть скомпилирована !
class VarArgs4 {

    static void vaTest(int ... v) {
        System.out.print("vaTest(Integer ...): " +
                "Количество аргументов : " + v.length +
                " Содержимое: ");

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ...) " +
                "Количество аргументов: " + v.length +
                " Содерживое: ");

        for(boolean x : v)
            System.out.print(x + " ");

        System.out.println();
    }


    public static void main(String args[])
    {
        vaTest(1, 2, 3);  // верно
        vaTest(true, false, false); // верно

        //vaTest(); // Ошибка : неоднозначность !
    }
}