package org.athenian.lambdas._1_subclasses_2;

import static java.lang.String.format;

class SubClassExample {

  public static void main(String[] args) {

    TextConverter toLower = new ToLower();
    TextConverter toUpper = new ToUpper();
    TextConverter doubler1 = new Doubler();

    TextConverter doubler2 = new TextConverter() {
      @Override
      String convert(String text) {
        return text + text;
      }
    };

    TextConverter tripler = new TextConverter() {
      @Override
      String convert(String text) {
        return text + text + text;
      }
    };

    System.out.println("Doubler1 Class name = " + doubler1.getClass().getName());
    System.out.println("Doubler2 Class name = " + doubler2.getClass().getName());
    System.out.println("Tripler Class name = " + tripler.getClass().getName());

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
    apply("Hello 3", doubler1);
    apply("Hello 4", reverser);
    apply("Hello 5", toLower, doubler1, reverser);
    apply("Hello 6", toUpper, reverser, doubler1);
    apply("Hello 7", toUpper, reverser, doubler1, reverser);
    apply("Hello 8",
          new TextConverter() {
            @Override
            String convert(String text) {
              return text + text;
            }
          });
  }

  static void apply(String text, TextConverter... converters) {
    System.out.println(format("Applying %d converters to [%s]", converters.length, text));
    var result = text;
    for (TextConverter converter : converters) {
      result = converter.convert(result);
      Class<? extends TextConverter> clazz = converter.getClass();

      System.out.println(format("Applied converter [%s] and got [%s]",
                                clazz.isAnonymousClass() ? clazz.getName().replace(clazz.getPackageName() + ".", "") : clazz.getSimpleName(),
                                result));
    }
    System.out.println("Result: " + result + "\n");
  }
}
