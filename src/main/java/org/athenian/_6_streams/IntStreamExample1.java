package org.athenian._6_streams;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntStreamExample1 {

  public static void main(String[] args) {

    // The non-lambda way
    for (int i = 0; i < 10; i++) {
      if (i % 2 != 0)
        continue;
      System.out.println(i);
    }

    // Using anonymous classes
    IntStream.range(0, 10)
             .filter(
                 new IntPredicate() {
                   @Override
                   public boolean test(int i) {
                     return i % 2 == 0;
                   }
                 })
             .forEach(
                 new IntConsumer() {
                   @Override
                   public void accept(int i) {
                     System.out.println(i);
                   }
                 });

    // Using lambdas
    IntStream.range(0, 10)
             .filter(i -> i % 2 == 0)
             .forEach(i -> System.out.println(i));
  }
}
