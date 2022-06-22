package com.sasimykyta.javacore.chapter08;

class RefDemo {
    public static void main(String args[]) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Oбъeм weightbox равен " + vol);
        System.out.println("Bec weightbox равен " + weightbox.weight);
        System.out.println();

        // nрисвоить ссылке на объект ВO:itWeight ссылки на объект ВОх
        plainbox = weightbox;

        vol = plainbox.volume(); // Верно , т.к. метод volume ()
        // определен в классе Вох
        System.out.println("Volume of plainbox is " + vol);

    /* Следующий оператор ошибочен , поскольку член plainbox
       не определяет член weight . */
//  System.out.println("Bec plainbox равен " + plainbox.weight);
    }
}
