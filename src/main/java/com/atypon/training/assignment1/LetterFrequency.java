package com.atypon.training.assignment1;

import java.util.Scanner;

/**
 * Created by Mohammad Abu Mayyaleh on 7/30/18.
 */
public class LetterFrequency {

    public static void main(String[] args) {
        System.out.print("Enter line of text to count the alphabets frequency: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int[] alphabets = new int[26];
        for (int i = 0; i < text.length(); i++) {
            int ascii = (int) text.charAt(i);
            if (ascii >= 65 && ascii <= 90) {
                alphabets[ascii - 'A']++;
            } else if (ascii >= 97 && ascii <= 122) {
                alphabets[ascii - 'a']++;
            }
        }
        //display the result in table
        System.out.println("alphabets | frequency");
        System.out.println("---------------------");
        for (int i = 0; i < alphabets.length; i++) {
            System.out.printf("%-8c  | %2d %n", (char) (i + 'A'), alphabets[i]);
        }
    }
}
