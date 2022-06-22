package com.sasimykyta.javacore.chapter09;

class TestIface {
    public static void main(String args[]) {
        Callback c = new Client2();
        c.callback(42);
    }
}