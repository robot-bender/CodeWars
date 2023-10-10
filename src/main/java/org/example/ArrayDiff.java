package org.example;

/*Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

        It should remove all values from list a, which are present in list b keeping their order.

        Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
        If a value is present in b, all of its occurrences must be removed from the other:

        Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}*/
public class ArrayDiff {

    public static void main(String[] args) {

        int[] arrayOfNumbers = new int[] {1, 2, 2, 4};
        int numbersWhichShouldBeDeleted = 2;

        int[] result = methodWhichDeletesNumbers(arrayOfNumbers, numbersWhichShouldBeDeleted);
        for (int r : result) {
            System.out.println(r);
        }
    }

    public static int[] methodWhichDeletesNumbers (int[] initialArrayOfNumbers, int numberWhichShouldBeDeleted) {
        int[] arrayWithoutNumbersWhichShouldBeDeleted = new int[initialArrayOfNumbers.length];
        for (int i = 0; i < initialArrayOfNumbers.length; i++) {
            if (initialArrayOfNumbers[i] == numberWhichShouldBeDeleted) {
            } else
                arrayWithoutNumbersWhichShouldBeDeleted[i] = initialArrayOfNumbers[i];
        }
        return arrayWithoutNumbersWhichShouldBeDeleted;
    }

}
