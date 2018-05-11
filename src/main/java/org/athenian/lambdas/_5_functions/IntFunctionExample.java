package org.athenian.lambdas._5_functions;

import java.util.function.Function;

public class IntFunctionExample {

  public static void main(String[] args) {

    Function<Integer, Integer> squareLong =
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
      System.out.println(String.format("%d %s", i, square.apply(i)));
  }

}
