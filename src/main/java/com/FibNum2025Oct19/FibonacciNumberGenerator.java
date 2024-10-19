package com.FibNum2025Oct19;


public class FibonacciNumberGenerator {

    private final FibonacciStrategy fibonacciStrategy;

    // Constructor that takes a Fibonacci strategy as an argument
    public FibonacciNumberGenerator(FibonacciStrategy strategy) {
        this.fibonacciStrategy = strategy;
    }

    // Default constructor that assigns the default strategy (Iterative Strategy)
    public FibonacciNumberGenerator() {
        this.fibonacciStrategy = new IterativeFibonacciStrategy(); // Default to iterative strategy
    }

    // Main method that uses the strategy
    public int getFibNum(int index) {
        fibonacciStrategy.validateIndex(index);
        return fibonacciStrategy.getFibonacciNumber(index);
    }

}