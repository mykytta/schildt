package com.sasimykyta.javacore.chapter29;

import java.util.*;
import java.util.stream.*;

class NamePhoneEmailA {
    String name;
    String phonenum;
    String email;

    NamePhoneEmailA(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}

class NamePhoneA {
    String name;
    String phonenum;

    NamePhoneA(String n, String p) {
        name = n;
        phonenum = p;
    }
}

public class StreamDemo7 {
    public static void main(String[] args) {

        // A list of names, phone numbers, and e-mail addresses.
        ArrayList<NamePhoneEmailA> myList = new ArrayList<>( );

        myList.add(new NamePhoneEmailA("Ларри", "555-5555",
                "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmailA("Джеймс", "555-4444",
                "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmailA("Мэри", "555-3333",
                "Mary@HerbSchildt.com"));

        Stream<NamePhone> nameAndPhone = myList.stream().map(
                (a) -> new NamePhone(a.name,a.phonenum)
        );

        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("Имена и номера телефонов в списке типа  List:");
        for(NamePhone e : npList)
            System.out.println(e.name + ": " + e.phonenum);

        nameAndPhone = myList.stream().map(
                (a) -> new NamePhone(a.name,a.phonenum)
        );

        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());

        System.out.println("\nИмена и номера телефонов в множестве типа Set:");
        for(NamePhone e : npSet)
            System.out.println(e.name + ": " + e.phonenum);
    }
}
