package com.ums.ums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {

        List<employee> employees=Arrays.asList(new employee(1,"adam",60000),
        new employee(2,"mike",70000));
        List<employee> newemployees=employees.stream().filter(e->e.getSalary()>5000).collect(Collectors.toList());

        for(employee employee:newemployees){
            System.out.println(employee.getName());
            System.out.println(employee.getSalary());
            System.out.println(employee.getID());

        }
    }

}
