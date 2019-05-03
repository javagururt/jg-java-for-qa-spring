package com.javaguru.lessons.lesson3;

class NumberServiceManualTest {

    public static void main(String[] args) {
        NumberService service = new NumberService();

        int expectedSumResult = 10;
        int actualSumResult = service.sum(5,5);

        System.out.println("Expected sum result: " + expectedSumResult);
        System.out.println("Actual sum result: " + actualSumResult);
    }
}
