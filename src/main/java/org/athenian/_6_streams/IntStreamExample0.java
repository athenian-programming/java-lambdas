package org.athenian._6_streams;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class IntStreamExample0 {

  public static void main(String[] args) {

    // The non-lambda way
    for (int i = 0; i < 10; i++)
      System.out.println(i);

    // Using a verbose anonymous class
    IntStream.range(0, 10)
             .forEach(
                 new IntConsumer() {
                   @Override
                   public void accept(int i) {
                     System.out.println(i);
                   }
                 });

    // Using a lambda
    IntStream.range(0, 10)
             .forEach(i -> System.out.println(i));

  }

}
