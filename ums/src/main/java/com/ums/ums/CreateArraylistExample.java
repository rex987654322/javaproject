package com.ums.ums;

import java.util.ArrayList;
import java.util.List;

public class CreateArraylistExample {


    public static void main(String []args) {
        List<String> animals=new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("fish");
        System.out.println(animals);
        animals.add(2,"elephant");

        System.out.println(animals);
        System.out.println(animals.indexOf("cat"));
        System.out.println(animals.lastIndexOf("cat"));
        System.out.println(animals.lastIndexOf("bird"));
        System.out.println(animals.lastIndexOf("dog"));




//        List<Integer>firstfivenumbers=new ArrayList<>();
//        firstfivenumbers.add(1);
//        firstfivenumbers.add(2);
//        firstfivenumbers.add(3);
//        firstfivenumbers.add(4);
//        firstfivenumbers.add(5);
//        System.out.println(firstfivenumbers);
//        List<Integer>firsttennumbers=new ArrayList<>(firstfivenumbers);
//        System.out.println(firsttennumbers);
//      List<Integer>secondfivenumbers=new ArrayList<>();
//       secondfivenumbers.add(6);
//       secondfivenumbers.add(7);
//       secondfivenumbers.add(8);
//       secondfivenumbers.add(9);
//       secondfivenumbers.add(10);
//       System.out.println(secondfivenumbers);
//       firsttennumbers.addAll(secondfivenumbers);
//       System.out.println(firsttennumbers);
    }
}