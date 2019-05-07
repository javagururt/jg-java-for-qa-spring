package com.javaguru.lessons.lesson4;

class FindMaxInArrayExample {

    public static void main(String[] args) {
        int[] array = new int[10];
        ArrayService service = new ArrayService();
        service.fillArrayWithRandomNumbers(array, 101);
        service.printArrayToConsole(array);

        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }

        System.out.println();
        System.out.println("Max: " + max);
        System.out.println("Max index: " + maxIndex);

        int temp = array[0];
        array[0] = max;
        array[maxIndex] = temp;

        service.printArrayToConsole(array);
    }
}
