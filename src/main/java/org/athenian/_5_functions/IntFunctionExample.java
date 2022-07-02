package org.athenian._5_functions;

import java.util.function.Function;

public class IntFunctionExample {

    public static void main(String[] args) {

        // Verbose
        Function<Integer, Integer> squareVerbose =
                new Function<>() {
                    @Override
                    public Integer apply(Integer val) {
                        return val * val;
                    }
                };

        Function<Integer, Integer> squareMed = (Integer val) -> {
            return val * val;
        };

        Function<Integer, Integer> square = val -> val * val;

        for (int i = 0; i < 10; i++)
            System.out.printf("%d %s%n", i, square.apply(i));
    }
}