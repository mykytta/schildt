package com.sasimykyta.javacore.chapter22;

import java.net.*;

public class URLDemo {
    public static void main(String args[]) throws MalformedURLException {
        URL hp = new URL("http://www.HerbSchildt.com/WhatsNew");

        System.out.println("Протокоол: " + hp.getProtocol());
        System.out.println("Порт: " + hp.getPort());
        System.out.println("Хост: " + hp.getHost());
        System.out.println("Файл: " + hp.getFile());
        System.out.println("Полная форма:" + hp.toExternalForm());
    }
}
