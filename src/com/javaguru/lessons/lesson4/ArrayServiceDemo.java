package com.javaguru.lessons.lesson4;

class ArrayServiceDemo {

    public static void main(String[] args) {
        int[] array = new int[200];

        ArrayService service = new ArrayService();
        service.fillArrayWithRandomNumbers(array, 1001);
        service.printArrayToConsole(array);

    }
}
