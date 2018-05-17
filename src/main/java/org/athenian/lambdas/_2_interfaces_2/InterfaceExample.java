package org.athenian.lambdas._2_interfaces_2;


class InterfaceExample {

  public static void main(String[] args) {

    // Anonymous class
    TextConverter toLower =
        new TextConverter() {
          @Override
          public String convert(String text) {
            return text.toLowerCase();
          }
        };

    TextConverter toUpper =
        new TextConverter() {
          @Override
          public String convert(String text) {
            return text.toUpperCase();
          }
        };

    TextConverter doubler =
        new TextConverter() {
          @Override
          public String convert(String text) {
            return text + text;
          }
        };

    TextConverter reverser =
        new TextConverter() {
          @Override
          public String convert(String text) {
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

  static void apply(String text, TextConverter... converters) {
    System.out.println(String.format("Applying %d converters to [%s]", converters.length, text));
    String result = text;
    for (TextConverter converter : converters) {
      result = converter.convert(result);
      System.out.println(String.format("Applied converter [%s] and got [%s]", converter.getClass().getName(), result));
    }
    System.out.println(result);
    System.out.println();
  }

}
