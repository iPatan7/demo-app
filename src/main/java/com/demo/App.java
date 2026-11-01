package com.demo;

/**
 * Entry point: prints a few calculations.
 */
public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("12 + 30 = " + calc.add(12, 30));
        System.out.println("12 * 30 = " + calc.multiply(12, 30));
    }
}
