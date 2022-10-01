package com.telerikacademy.Arrays.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first string.");
        String firstString = scan.nextLine();
        System.out.println("Enter your second string.");
        String secondString = scan.nextLine();

        char[] firstChar = firstString.toCharArray();
        char[] secondChar = secondString.toCharArray();

        //Every char has int value in ascii table

        int sumFirstChar = 0;
        int sumSecondChar = 0;
        for (int i = 0; i < firstChar.length; i++) {
            sumFirstChar += firstChar[i];
        }
        for (int i = 0; i < secondChar.length; i++) {
            sumSecondChar += secondChar[i];
        }
        if (sumFirstChar == sumSecondChar) {
            System.out.println("Equals");
        } else if (sumFirstChar > sumSecondChar) {
            System.out.println("Second");
        } else {
            System.out.println("First");
        }
    }
}
