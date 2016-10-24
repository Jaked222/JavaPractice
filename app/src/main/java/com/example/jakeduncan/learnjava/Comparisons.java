package com.example.jakeduncan.learnjava;

/**
 * Created by jakeduncan on 10/23/16.
 */

public class Comparisons {
    public static void main(String[] args) {
        int value = 4;
        for (int i =0; i < 8; i++){
            if (i==value){
                System.out.println(i + " is equal to " + value);
            }
            if (i<=value){
                System.out.println(i + " is less or equal to "+ value);
            }
            if (i>=value){
                System.out.println(i + " is greater or equal to "+ value);
            }
        }
    }
}
