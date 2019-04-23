package com.javaguru.lessons.lesson2;

import java.util.Scanner;

class ExampleIfElseIfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int userInput = input.nextInt();

        if (userInput == 0) {
            System.out.println("Number is ZERO");
        } else if (userInput < 0) {
            System.out.println("Number is less than ZERO");
        } else {
            System.out.println("Number is greater than ZERO");
        }
    }
}
