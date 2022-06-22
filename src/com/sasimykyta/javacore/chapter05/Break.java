package com.sasimykyta.javacore.chapter05;

// Применение ооператора break в качестве цивилизованной
// формы оператора goto
public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Предшествуетоператору break");
                    if(t) break second; //выход из блока second
                    System.out.println("Этот оператор не будет выполоняться");
                }
                System.out.println("Этот оператор не будет выполоняться");
            }
            System.out.println("Этот оператор следует за блоком second");
        }
    }
}
