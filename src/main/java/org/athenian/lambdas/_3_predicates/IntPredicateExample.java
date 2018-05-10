package org.athenian.lambdas._3_predicates;

import java.util.function.Predicate;

public class IntPredicateExample {

  public static void main(String[] args) {

    Predicate<Integer> isEvenLong =
        new Predicate<Integer>() {
          @Override
          public boolean test(Integer val) {
            return val % 2 == 0;
          }
        };

    Predicate<Integer> isEvenMed = (Integer val) -> {
      return val % 2 == 0;
    };

    Predicate<Integer> isEven = val -> val % 2 == 0;

    for (int i = 0; i < 10; i++)
      System.out.println(String.format("%d %s", i, isEven.test(i)));
  }
}
