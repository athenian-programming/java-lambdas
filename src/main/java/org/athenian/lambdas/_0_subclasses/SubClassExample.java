package org.athenian.lambdas._0_subclasses;

public class SubClassExample {

  public static void main(String[] args) {

    TextConvert toLower = new ToLower();
    TextConvert toUpper = new ToUpper();
    TextConvert first3 = new First3();
    TextConvert stripL = new StripL();

    System.out.println(toLower.convert("Hello 1"));
    System.out.println(toUpper.convert("Hello 2"));
    System.out.println(first3.convert("Hello 3"));
    System.out.println(stripL.convert("Hello 4"));

    System.out.println(toLower.getClass().getName());
  }

}
