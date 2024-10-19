package com.FibNum2025Oct19;

public class IterativeFibonacciStrategy implements FibonacciStrategy {

    @Override
    public int getFibonacciNumber(int index) {
        if (index == 0) return 0;
        if (index == 1) return 1;

        int previous = 1;
        int current = 1;
        int fibonacci = 1;

        for (int i = 3; i <= index; i++) {
            fibonacci = previous + current;
            previous = current;
            current = fibonacci;
        }

        return fibonacci;
    }
}

