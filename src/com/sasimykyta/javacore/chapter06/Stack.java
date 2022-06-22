package com.sasimykyta.javacore.chapter06;
// В этом классе определяется целоочисленный стек в котором
// можно хранить до 10 целочисленных значений
public class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item){
        if(tos == 9) {
            System.out.println("Стек заполнен");
        }else{
            stck[++tos] = item;
        }
    }

    int pop(){
        if(tos < 0){
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
