package com.sasimykyta.javacore.chapter09;

class MyIFImp2 implements MyIF {
    // В э том классе предоставляются реализации обоих методов
    // qetNumber () и qetString ()
    public int getNumber() {
        return 100;
    }

    public String getString() {
        return "TЭто другая символьная строка.";
    }
}
