package com.javaguru.lessons.lesson1;

import java.util.Scanner;

class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int userInputNumber = sc.nextInt();
        System.out.println("Result: " + userInputNumber);
    }
}
