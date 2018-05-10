package org.athenian.lambdas._3_predicates;

import java.util.function.Predicate;

public class StringPredicateExample {

  public static void main(String[] args) {

    Predicate<String> containsHelloLong = new Predicate<String>() {
      @Override
      public boolean test(String val) {
        return val.contains("Hello");
      }
    };

    Predicate<String> containsHelloMed = (String val) -> {
      return val.contains("Hello");
    };

    Predicate<String> containsHello = val -> val.contains("Hello");

    System.out.println(containsHello.test("Hello"));
    System.out.println(containsHello.test("Goodbye"));
  }
}
