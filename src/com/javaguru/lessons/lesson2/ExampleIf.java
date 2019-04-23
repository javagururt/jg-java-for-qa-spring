package com.javaguru.lessons.lesson2;

import java.util.Scanner;

class ExampleIf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if (userInput > 100) {
            System.out.println("User input is more than 100.");
        }

        System.out.println("Anyway");
    }
}
