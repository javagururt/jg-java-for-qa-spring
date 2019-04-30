package com.javaguru.lessons.lesson3;

import java.util.Scanner;

class PrintNumbersExample {

    public static void main(String[] args) {
        System.out.println("Please enter from: ");
        Scanner scanner = new Scanner(System.in);
        int from = scanner.nextInt();
        System.out.println("Please enter to: ");
        int to = scanner.nextInt();

        NumberService service = new NumberService();
        System.out.println("EVEN NUMBERS");
        service.printEvenNumberToConsole(from, to);
        System.out.println("ODD NUMBERS");
        service.printOddNumbersToConsole(from, to);

        System.out.println("SUM");
        int sumResult = service.sum(from, to);
        System.out.println("Result: " + sumResult);
    }
}
