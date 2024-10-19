package com.FibNum2025Oct19;

public class RecursiveFibonacciStrategy extends AbstractFibonacciStrategy {

    @Override
    public int getFibonacciNumber(int index) {
        if (index < 2) return handleBaseCases(index);
        return getFibonacciNumber(index - 1) + getFibonacciNumber(index - 2);
    }
}

