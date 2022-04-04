package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int n) {
        return sum(n) + multiply(n) + minus(n) + divide(n);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int resultMinus = Calculator.minus(40);
        System.out.println(resultMinus);
        int resultDivide = calculator.divide(60);
        System.out.println(resultDivide);
        int resultSumAllOperation = calculator.sumAllOperation(50);
        System.out.println(resultSumAllOperation);
    }
}
