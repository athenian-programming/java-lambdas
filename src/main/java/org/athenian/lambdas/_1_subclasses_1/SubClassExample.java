package org.athenian.lambdas._1_subclasses_1;

import static java.lang.String.format;

class SubClassExample {

  public static void main(String[] args) {

    TextConverter toLower = new ToLower();
    TextConverter toUpper = new ToUpper();
    TextConverter doubler = new Doubler();

    // Create an anonymous class
    TextConverter reverser =
        new TextConverter() {
          @Override
          String convert(String text) {
            StringBuilder sb = new StringBuilder();
            for (int i = text.length() - 1; i >= 0; i--)
              sb.append(text.charAt(i));
            return sb.toString();
          }
        };

    apply("Hello 1", toLower);
    apply("Hello 2", toUpper);
    apply("Hello 3", doubler);
    apply("Hello 4", reverser);
    apply("Hello 5", toLower, doubler, reverser);
    apply("Hello 6", toUpper, reverser, doubler);
    apply("Hello 7", toUpper, reverser, doubler, reverser);
  }

  private static void apply(String text, TextConverter... converters) {
    System.out.println(format("Applying %d converters to [%s]", converters.length, text));
    var result = text;
    for (TextConverter converter : converters) {
      result = converter.convert(result);
      System.out.println(format("Applied converter [%s] and got [%s]", converter.getClass().getSimpleName(), result));
    }
    System.out.println("Result: " + result + "\n");
  }
}
