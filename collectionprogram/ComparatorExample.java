package com.collectionprogram;

import java.util.*;

class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class NameComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

public class ComparatorExample {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(3,"Ravi"));
        list.add(new Employee(1,"Kumar"));
        list.add(new Employee(2,"Priya"));

        Collections.sort(list, new NameComparator());

        for(Employee e : list) {
            System.out.println(e.id + " " + e.name);
        }
    }
}