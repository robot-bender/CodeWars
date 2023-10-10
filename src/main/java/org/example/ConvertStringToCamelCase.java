package org.example;

/*Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

        Examples
        "the-stealth-warrior" gets converted to "theStealthWarrior"

        "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

        "The_Stealth-Warrior" gets converted to "TheStealthWarrior"*/

public class ConvertStringToCamelCase {
    public static void main(String[] args) {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+toCamelCase(input));
    }

    public static String toCamelCase(String text) {
        String[] words = text.split("[\\W_]+");
        StringBuilder builder = new StringBuilder();
        for (int i=0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                word = word.isEmpty() ? word : word.toLowerCase();
            } else {
                word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }
            builder.append(word);
        }
        return builder.toString();
    }
}