package com.sasimykyta.javacore.chapter09.p2;

import com.sasimykyta.javacore.chapter09.p1.Protection;

class Protection2 extends Protection {
    Protection2() {
        System.out.println("конструктор , унаследованный иэ другого пакета");

//  доступно только для данного класса или пакета
//  System.out.println("n = " + n);

//  доступно только для класса
//  System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("конструктор из другого пакета");

//  доступно только для данного класса или пакета
//  System.out.println("n = " + p.n);

//  доступно только для данного класса
//  System.out.println("n_pri = " + p.n_pri);

//  доступно только для данного класса, подкласса или пакета
//  System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}