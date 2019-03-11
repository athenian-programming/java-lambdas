package org.athenian.lambdas._6_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamExample2 {

  public static void main(String[] args) {

    // The non-lambda way
    List<Integer> vals0 = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      if (i % 2 != 0)
        continue;
      vals0.add(i * i);
    }
    System.out.println(vals0);

    // Using anonymous classes
    List<Integer> vals1 =
        IntStream.range(0, 10)
                 .filter(
                     new IntPredicate() {
                       @Override
                       public boolean test(int i) {
                         return i % 2 == 0;
                       }
                     })
                 .mapToObj(new IntFunction<Integer>() {
                   @Override
                   public Integer apply(int i) {
                     return i * i;
                   }
                 })
                 .collect(Collectors.toList());
    System.out.println(vals1);

    // Using lambdas
    List<Integer> vals2 =
        IntStream.range(0, 10)
                 .filter(i -> i % 2 == 0)
                 .mapToObj(i -> i * i)
                 .collect(Collectors.toList());
    System.out.println(vals2);
  }
}