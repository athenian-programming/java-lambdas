package org.athenian.lambdas._4_predicates;

import java.util.function.Predicate;

public class StringPredicateExample {

  public static void main(String[] args) {

    // Verbose
    Predicate<String> containsHelloVerbose =
        new Predicate<String>() {
          @Override
          public boolean test(String val) {
            return val.contains("Hello");
          }
        };

    // Better
    Predicate<String> containsHelloMed = (String val) -> {
      return val.contains("Hello");
    };

    // Terse
    Predicate<String> containsHelloTerse = val -> val.contains("Hello");

    System.out.println(containsHelloTerse.test("Hello"));
    System.out.println(containsHelloTerse.test("Goodbye"));
  }
}
