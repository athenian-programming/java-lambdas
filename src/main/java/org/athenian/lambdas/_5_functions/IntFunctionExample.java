package org.athenian.lambdas._5_functions;

import java.util.function.Function;

import static java.lang.String.format;

public class IntFunctionExample {

  public static void main(String[] args) {

    // Verbose
    Function<Integer, Integer> squareVerbose =
        new Function<Integer, Integer>() {
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
      System.out.println(format("%d %s", i, square.apply(i)));
  }

}
