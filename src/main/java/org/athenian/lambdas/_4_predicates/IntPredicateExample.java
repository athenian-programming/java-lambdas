package org.athenian.lambdas._4_predicates;

import java.util.function.Predicate;

import static java.lang.String.format;

public class IntPredicateExample {

  public static void main(String[] args) {

    // Verbose
    Predicate<Integer> isEvenVerbose =
        new Predicate<Integer>() {
          @Override
          public boolean test(Integer val) {
            return val % 2 == 0;
          }
        };

    // Better
    Predicate<Integer> isEvenMed = (Integer val) -> {
      return val % 2 == 0;
    };

    // Terse
    Predicate<Integer> isEvenTerse = val -> val % 2 == 0;

    for (int i = 0; i < 10; i++)
      System.out.println(format("%d %s", i, isEvenTerse.test(i)));
  }
}
