package com.javaguru.lessons.lesson4;

import java.util.Random;

class RandomArrayExample {

    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        Random randomGenerator = new Random();

        for (int element : randomNumbers) {
            System.out.print(element + " ");
        }

        System.out.println();

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = randomGenerator.nextInt(101);
        }

        for (int element : randomNumbers) {
            System.out.println(element);
        }
    }
}
