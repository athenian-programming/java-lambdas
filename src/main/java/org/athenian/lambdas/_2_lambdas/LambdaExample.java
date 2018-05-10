package org.athenian.lambdas._2_lambdas;

public class LambdaExample {

  public static void main(String[] args) {

    // Use anonymous class
    TextConvert toLower =
        new TextConvert() {
          @Override
          public String convert(String text) {
            return text.toLowerCase();
          }
        };

    // Convert to lambda
    TextConvert toUpper = (String text) -> {
      return text.toUpperCase();
    };

    // Simplify parameter decl
    TextConvert first3 = text -> {
      return text.substring(0, 3);
    };

    // Simplify to single line
    TextConvert stripL = text -> text.replaceAll("l", "");

    System.out.println(toLower.convert("Hello 1"));
    System.out.println(toUpper.convert("Hello 2"));
    System.out.println(first3.convert("Hello 3"));
    System.out.println(stripL.convert("Hello 4"));

    System.out.println(toLower.getClass().getName());
  }
}
