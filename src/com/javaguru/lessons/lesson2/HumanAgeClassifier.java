package com.javaguru.lessons.lesson2;

import java.util.Scanner;

class HumanAgeClassifier {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter age: ");
        int userInput = input.nextInt();

        if (userInput < 0 || userInput > 120) {
            System.out.println("Incorrect age");
        } else if (userInput <= 2) {
            System.out.println("Baby");
        } else if (userInput <= 14) {
            System.out.println("Teenager");
        } else if (userInput <= 18) {
            System.out.println("Junior");
        } else if (userInput <= 25) {
            System.out.println("Student (Lucky person)");
        } else if (userInput <= 55) {
            System.out.println("Hard working depressed person");
        } else if (userInput <= 100) {
            System.out.println("Senior");
        } else {
            System.out.println("Lucky person");
        }
    }
}
