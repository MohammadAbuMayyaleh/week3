package com.atypon.training.assignment3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mohammad Abu Mayyaleh on 7/30/18.
 */
public class TestRegex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter regex : ");
        String regex = input.nextLine();
        System.out.print("Enter Text  : ");
        String text = input.nextLine();
        /*
        A Pattern object is a compiled representation of a regular expression.
        The Pattern class provides no public constructors. To create a pattern,
        you must first invoke one of its public static compile() methods,which will then return a Pattern object.
        These methods accept a regular expression as the first argument.
        */
        Pattern expression = Pattern.compile(regex);
        /*
        A Matcher object is the engine that interprets the pattern and performs match operations against an input string.
        Like the Pattern class, Matcher defines no public constructors.
        You obtain a Matcher object by invoking the matcher() method on a Pattern object.
        */
        Matcher matcher = expression.matcher(text);
        System.out.println("The occurances of the regex in the text : ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
