package org.athenian.lambdas._5_functions;

import java.util.function.Function;

public class StringFunctionExample {

  public static void main(String[] args) {

    Function<String, String> reverser =
        val -> {
          StringBuilder sb = new StringBuilder();
          for (int i = val.length() - 1; i >= 0; i--)
            sb.append(val.charAt(i));
          return sb.toString();
        };

    System.out.println(reverser.apply("Hello Goodbye"));
  }
}
