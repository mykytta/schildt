package com.sasimykyta.javacore.chapter08;

// Использовать ключевое слово super с целью предотвратить сокрытие имен
class A2 {
    int i;
}

// создать подкласс путем расширения класса А
class B2 extends A2 {
    int i; // этот член i скрывает член i из класса А

    B2(int a, int b) {
        super.i = a; // член i из класса А
        i = b; // член i из класса В
    }

    void show() {
        System.out.println("Члeн i в суперклассе : " + super.i);
        System.out.println("Члeн i в подклассе : " + i);
    }
}

class UseSuper {
    public static void main(String args[]) {
        B2 subOb = new B2(1, 2);

        subOb.show();
    }
}
