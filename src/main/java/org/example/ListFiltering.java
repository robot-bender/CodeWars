package org.example;

/*
DESCRIPTION:
        In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

        Example
        Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
        Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
        Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)
*/


import java.util.List;

public class ListFiltering {
    public static void main(String[] args) {
        List<Object> mojalista = new java.util.ArrayList<>(List.of(1, 2, "a", "b"));


            if (mojalista.contains("a")) {
                mojalista.remove("a");
            }
            if (mojalista.contains("b")) {
                mojalista.remove("b");
            }


        for (Object element : mojalista) {
            System.out.println(element);
        }


    }
}
