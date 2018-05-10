package org.athenian.lambdas._0_subclasses;

public class SubClassExample {

  public static void main(String[] args) {

    TextConverter toLower = new ToLower();
    TextConverter toUpper = new ToUpper();
    TextConverter doubler = new Doubler();
    TextConverter reverser = new Reverser();

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
