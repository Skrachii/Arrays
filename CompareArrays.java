package com.telerikacademy.Arrays.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class CompareArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many integers will your arrays store?");
         int size = Integer.parseInt(scan.nextLine());
         int[] arr1 = new int[size];
         int[] arr2 = new int[size];


        System.out.println("Add the integers for the first array");
         for (int i = 0; i < arr1.length; i++) {
             arr1[i]= Integer.parseInt(scan.nextLine());
         }
        System.out.println("Add the integers for the second array");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(scan.nextLine());
        }
       if (Arrays.equals(arr1,arr2)){
           System.out.println("Equal");
       }
       else {
           System.out.println("Not equal");
       }
    }
}
