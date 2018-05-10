package org.athenian.lambdas._1_interfaces_anonymous;


public class InterfaceExample {

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

    singleConvertText("Hello 1", toLower);
    singleConvertText("Hello 2", toUpper);
    singleConvertText("Hello 3", doubler);
    singleConvertText("Hello 4", reverser);

    multiConvertText("Hello 1", toLower, doubler, reverser);
    multiConvertText("Hello 2", toUpper, reverser, doubler);
    multiConvertText("Hello 3", toUpper, reverser, doubler, reverser);
  }

  static void singleConvertText(String text, TextConverter converter) {
    String result = converter.convert(text);
    System.out.println(result);
    System.out.println(String.format("Applied %s to [%s] and got [%s]", converter.getClass().getName(), text, result));
    System.out.println();
  }

  static void multiConvertText(String text, TextConverter... converters) {
    System.out.println(String.format("Applying %d filters to [%s]", converters.length, text));
    String result = text;
    for (TextConverter converter : converters) {
      result = converter.convert(result);
      System.out.println(String.format("Applied [%s] and got [%s]", converter.getClass().getName(), result));
    }
    System.out.println(result);
    System.out.println();
  }

}
