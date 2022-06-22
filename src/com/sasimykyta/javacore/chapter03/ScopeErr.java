package com.sasimykyta.javacore.chapter03;
// Скомпилировать эту программу нельзя
public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
            // int bar = 2; переменная bar уже определена!
        }


    }
}
