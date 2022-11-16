package com.nology.numbergame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class NumberGame {
    public static void main(String[] args) {

        boolean correct = false;
        int tries = 10;
        int min = 0;
        int max = 100;
        int number = 0;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        Scanner myObj = new Scanner(System.in);
        System.out.println(random_int);


        ArrayList<Integer> ans = new ArrayList<>();


        while (!correct) {
            System.out.println("You are limited to " + tries + " attempts."
                    + " Guess a number between 1 and 100: ");
            tries--;
            number = myObj.nextInt();
            boolean alreadyExist = false;
            if (!alreadyExist) {
                for (Integer integer : ans) {
                    if (integer.equals(number)) {
                        alreadyExist = true;
                    }
                }
                if (alreadyExist == false) {
                    ans.add(number);
                } else {
                    System.out.println("this number has already been used");
                    tries++;
                }
            }
            if (number == random_int) {
                System.out.println("correct! you win :)");
                correct = true;
            } else if (tries == 0) {
                System.out.println("game over!");
                correct = true;
            } else if (number <= random_int + 3 && number >= random_int - 3) {
                System.out.println("Very very warm");
            } else if (number <= random_int + 6 && number >= random_int - 6) {
                System.out.println("Very warm");
            } else if (number <= random_int + 10 && number >= random_int - 10) {
                System.out.println("Warm");
            } else if (number <= random_int + 16 && number >= random_int - 16) {
                System.out.println("Cold");
            } else if (number <= random_int + 21 && number >= random_int - 21) {
                System.out.println("Very very warm");
            } else if (number <= random_int + 25 && number >= random_int - 25) {
                System.out.println("freezing");
            } else if (number <= random_int + 30 && number >= random_int - 30) {
                System.out.println("Artic");
            } else System.out.println("No where near");
        }
    }
}
