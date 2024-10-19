package com.FibNum2025Oct19;

public class IterativeFibonacciStrategy extends AbstractFibonacciStrategy {

    @Override
    public int getFibonacciNumber(int index) {

        if (index < 2) return handleBaseCases(index);

        int previous = 0;
        int current = 1;
        int fibonacci = 1;

        for (int i = 2; i <= index; i++) {
            fibonacci = previous + current;
            previous = current;
            current = fibonacci;
        }

        return fibonacci;
    }
}

