package org.example;

/*DESCRIPTION:
        Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

        Examples
        "This is an example!" ==> "sihT si na !elpmaxe"
        "double  spaces"      ==> "elbuod  secaps"*/
public class ReverseWords {

    public static void main(String[] args) {
        String originalStr = "This is an example!";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: " + reversedStr);
    }

}
