package org.example;

/*DESCRIPTION:
        Implement a function that accepts 3 integer values a, b, c. The function should return true if a triangle can be built with the sides of given length and false in any other case.

        (In this case, all triangles must have surface greater than 0 to be accepted).*/

public class IsThisTriangle {

    public static void main(String[] args) {
        int a,b,c;
        a = 2;
        b = 1;
        c = 2;
        boolean result = checkIfCanBuildTriangle(a,b,c);
        System.out.println(result);

        a = 3;
        b = 4;
        c = 8;
        boolean result2 = checkIfCanBuildTriangle(a,b,c);
        System.out.println(result2);
    }

    public static boolean checkIfCanBuildTriangle(int a, int b, int c) {
        if (c<a+b)
            return true;
        else
            return false;
    }
}
