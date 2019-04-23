package com.javaguru.lessons.lesson2;

import java.util.Scanner;

class ExampleIfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if (userInput >= 1000) {
            System.out.println("User input is >= than 1000");
        } else {
            System.out.println("User input is < than 1000");
        }
    }
}
