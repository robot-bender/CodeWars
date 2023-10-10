package org.example;

/*
Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types.
*/

import java.util.Arrays;

public class ShortestWord {
    public static void main(String[] args) {
        String[] words = {"zupa", "kaczka", "kurczak"};
        System.out.println(Arrays.toString(findShortestWord(words)));
        int[] numbers = findShortestWord(words);

        int small = 0;
        int large = 0;
        int num;

        for (int i = 0; i < numbers.length; i++) {
            num = numbers[i];
            if (num>large) {
                large = num;
            }
        }
        System.out.println("the longest word has " + large + " words");

        for (int i = 0; i < numbers.length; i++) {
            num = numbers[i];
            if(i==0&&num>0)
                small=num;
            if(num<small)
                small=num;
        }
        System.out.println("the shortest word has " + small + " words");
//        String shortestWord = findShortestWord(words);
    }

    public static int[] findShortestWord(String[] listOfWords) {
        int[] lengthOfWord = new int[listOfWords.length];
        for(int i=0; i<listOfWords.length; i++){
            lengthOfWord[i] = listOfWords[i].length();
        }
        return lengthOfWord;
    }
}
