package org.example;

/*
DESCRIPTION:
        You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

        Examples
        [2, 4, 0, 100, 4, 11, 2602, 36] -->  11 (the only odd number)

        [160, 3, 1719, 19, 11, 13, -21] --> 160 (the only even number)
*/

import java.util.ArrayList;
import java.util.List;

public class FindTheParityOutlier {
    public static void main(String[] args) {
        ArrayList<Integer> myListOfNumbers1 = new ArrayList<>(List.of(2, 4, 0, 100, 4, 33, 11, 2602, 36));
        ArrayList<Integer> myListOfNumbers2 = new ArrayList<>(List.of(160, 3, 1719, 19, 11, 13, -21));

        ArrayList<Integer> myListWithOddNumbers = methodToCheckIfIntegerIsOdd(myListOfNumbers1);
        for (Integer i: myListWithOddNumbers) {
            System.out.println("The odd number from the first list is " + i + ".");
        }

        ArrayList<Integer> myListWithEvenNumbers = methodToCheckIfIntegerIsEven(myListOfNumbers2);
        for (Integer i: myListWithEvenNumbers) {
            System.out.println("The even number from the second list is " + i + ".");
        }

    }

    public static ArrayList<Integer> methodToCheckIfIntegerIsOdd(ArrayList<Integer> listOfIntegers) {
        Integer value;
        ArrayList<Integer> myListOfNumbers = new ArrayList<>();
        for (int i = 0; i < listOfIntegers.size(); i++) {
            value = listOfIntegers.get(i);
            if (value % 2 == 0) {
            } else {
                myListOfNumbers.add(value);
            }
        } return myListOfNumbers;
    }

    public static ArrayList<Integer> methodToCheckIfIntegerIsEven(ArrayList<Integer> listOfIntegers) {
        Integer value;
        ArrayList<Integer> myListOfNumbers = new ArrayList<>();
        for (int i = 0; i < listOfIntegers.size(); i++) {
            value = listOfIntegers.get(i);
            if (value % 2 == 0) {
                myListOfNumbers.add(value);
            } else {
            }
        } return myListOfNumbers;
    }

}
