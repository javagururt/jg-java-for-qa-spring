package com.javaguru.lessons.lesson4;

import java.util.Random;

public class ArrayService {

    public void fillArrayWithRandomNumbers(int[] integerArray, int bound) {
        Random randomGenerator = new Random();
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = randomGenerator.nextInt(bound);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
    }

    public int findMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

}
