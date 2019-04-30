package com.javaguru.lessons.lesson3;

class NumberService {

    public void printEvenNumberToConsole(int from, int to) {
//        for (int i = from; i <= to; i++) {
//            if (i % 2 == 0) {
//                System.out.println("i = " + i);
//            }
//        }
        while (from <= to) {
            if (isEven(from)) {
                System.out.println("from = " + from);
            }
            from++;
        }
    }

    public void printOddNumbersToConsole(int from, int to) {
        while (from <= to) {
            if (!isEven(from)) {
                System.out.println("from = " + from);
            }
            from++;
        }
    }

    public boolean isEven(int number) {
        boolean result = (number % 2 == 0);
        return result;
    }

    public int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public int sumInRange(int from, int to) {
        int sumResult = 0;
        while (from <= to) {
            sumResult = sumResult + from;
            from++;
        }
        return sumResult;
    }

}
