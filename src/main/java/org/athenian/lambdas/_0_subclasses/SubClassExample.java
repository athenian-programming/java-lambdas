package org.athenian.lambdas._0_subclasses;

class SubClassExample {

  static void main(String[] args) {

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

    convertText("Hello 1", toLower);
    convertText("Hello 2", toUpper);
    convertText("Hello 3", doubler);
    convertText("Hello 4", reverser);
    convertText("Hello 5", toLower, doubler, reverser);
    convertText("Hello 6", toUpper, reverser, doubler);
    convertText("Hello 7", toUpper, reverser, doubler, reverser);
  }

  static void convertText(String text, TextConverter... converters) {
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
