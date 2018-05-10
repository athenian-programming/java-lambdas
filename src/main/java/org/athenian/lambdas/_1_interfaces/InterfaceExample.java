package org.athenian.lambdas._1_interfaces;


public class InterfaceExample {

  public static void main(String[] args) {

    // Anonymous class
    TextConvert toLower =
        new TextConvert() {
          @Override
          public String convert(String text) {
            return text.toLowerCase();
          }
        };

    TextConvert toUpper =
        new TextConvert() {
          @Override
          public String convert(String text) {
            return text.toUpperCase();
          }
        };

    TextConvert first3 =
        new TextConvert() {
          @Override
          public String convert(String text) {
            return text.substring(0, 3);
          }
        };

    TextConvert stripL =
        new TextConvert() {
          @Override
          public String convert(String text) {
            return text.replaceAll("l", "");
          }
        };

    System.out.println(toLower.convert("Hello 1"));
    System.out.println(toUpper.convert("Hello 2"));
    System.out.println(first3.convert("Hello 3"));
    System.out.println(stripL.convert("Hello 4"));

    System.out.println(toLower.getClass().getName());
  }

}
