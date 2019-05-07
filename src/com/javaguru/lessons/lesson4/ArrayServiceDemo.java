package com.javaguru.lessons.lesson4;

class ArrayServiceDemo {

    public static void main(String[] args) {
        int[] array = new int[200];

        ArrayService arrayService = new ArrayService();
        arrayService.fillArrayWithRandomNumbers(array, 1001);
        arrayService.printArrayToConsole(array);

    }
}
