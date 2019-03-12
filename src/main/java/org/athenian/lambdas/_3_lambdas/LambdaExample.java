package org.athenian.lambdas._3_lambdas;

import static java.lang.String.format;


public class LambdaExample {

  @FunctionalInterface
  public interface TextConverter {
    String convert(String text);
  }

  static void apply(String text, TextConverter... converters) {
    System.out.println(format("Applying %d converters to [%s]", converters.length, text));
    String result = text;
    for (TextConverter converter : converters) {
      result = converter.convert(result);
      System.out.println(format("Applied converter [%s] and got [%s]", converter.getClass().getName(), result));
    }
    System.out.println(result);
    System.out.println();
  }


  public static void main(String[] args) {
    // Anonymous class
    TextConverter toLower =
        new TextConverter() {
          @Override
          public String convert(String text) {
            return text.toLowerCase();
          }
        };

    // Convert to lambda
    TextConverter toUpper = (String text) -> {
      return text.toUpperCase();
    };

    // Simplify to expression body
    TextConverter doubler = text -> text + text;

    // Non-lambda blocks requires curlies
    TextConverter reverser = text -> {
      StringBuilder sb = new StringBuilder();
      for (int i = text.length() - 1; i >= 0; i--)
        sb.append(text.charAt(i));
      return sb.toString();
    };

    apply("Hello 1", toLower);
    apply("Hello 2", toUpper);
    apply("Hello 3", doubler);
    apply("Hello 4", reverser);
    apply("Hello 5", toLower, doubler, reverser);
    apply("Hello 7", toUpper, reverser, doubler, reverser);

    apply("Hello 8", text -> text.toLowerCase());
    apply("Hello 9", text -> text.replaceAll("9", "999"));

    apply("Hello 10",
                text -> text.toUpperCase(),
                text -> text + text,
                text -> {
                  StringBuilder sb = new StringBuilder();
                  for (int i = text.length() - 1; i >= 0; i--)
                    sb.append(text.charAt(i));
                  return sb.toString();
                });
  }
}
