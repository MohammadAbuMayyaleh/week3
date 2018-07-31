package com.atypon.training.assignment5;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Mohammad Abu Mayyaleh on 7/30/18.
 */
public class PrintFilesAndDirectories {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String directoryPath = input.nextLine();
        //We need to use recursive method to show the subDirectories And Files for subDirectories and so on ...
        //We use space variable only to have some space before the file or directory name
        showSubDirectoriesAndFiles(new File(directoryPath), "|__");
    }

    public static void showSubDirectoriesAndFiles(File directory, String space) {
        try {
            //listFiles method return the files and directories that the received directory contains
            File[] files = directory.listFiles();
            for (File file : files) {
                System.out.println(space + file.getName());
                if (file.isDirectory()) {
                    showSubDirectoriesAndFiles(file, "   " + space);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
