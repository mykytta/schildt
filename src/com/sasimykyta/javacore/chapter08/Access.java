package com.sasimykyta.javacore.chapter08;

/* В иерархии классов закрытые члены остаются закрытыми


   в пределах своего класса .
   Эта программа содержит ошибку, и поэтому
   скомпилировать ее не удастся.
   */

// создать суперкласс
class A1 {
    int i; // public be default
    private int j; // private to A

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

// Член j класса А в этом классе недоступен
class B1 extends A1 {
    int total;

    void sum() {
       // total = i + j; // ОШИБКА: член j в этом классе недоступен
    }
}

class Access {
    public static void main(String args[]) {
        B1 subOb = new B1();

        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}
