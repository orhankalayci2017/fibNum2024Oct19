package com.FibNum2025Oct19;

import java.util.HashMap;
import java.util.Map;

public class MemoizedFibonacciStrategy extends AbstractFibonacciStrategy {

    // Memoization cache to store already computed Fibonacci values
    private Map<Integer, Integer> memo = new HashMap<>();

    @Override
    public int getFibonacciNumber(int index) {

        if (index < 2) return handleBaseCases(index);

        if (memo.containsKey(index)) {
            return memo.get(index);
        }

        // Calculate Fibonacci recursively and store the result in the cache
        int fibNumber = getFibonacciNumber(index - 1) + getFibonacciNumber(index - 2);

        // Memoize the result
        memo.put(index, fibNumber);

        return fibNumber;
    }
}