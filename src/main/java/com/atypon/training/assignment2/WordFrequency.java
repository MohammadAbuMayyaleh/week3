package com.atypon.training.assignment2;

import java.util.Scanner;

/**
 * Created by Mohammad Abu Mayyaleh on 7/30/18.
 */
public class WordFrequency {

    public static void main(String[] args) {
        System.out.print("Enter line of text to count words frequency: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String words[] = text.split(" ");
        int longestWord = words[0].length();
        for (String word : words) {
            longestWord = Math.max(longestWord, word.length());
        }
        int wordsFrequency[] = new int[longestWord + 1];
        for (String word : words) {
            wordsFrequency[word.length()]++;
        }
        //display the result in table
        System.out.println("Word length | Occurrences");
        System.out.println("-------------------------");
        for (int i = 1; i <= longestWord; i++) {
            System.out.printf("%-11d | %2d %n", i, wordsFrequency[i]);
        }
    }
}
