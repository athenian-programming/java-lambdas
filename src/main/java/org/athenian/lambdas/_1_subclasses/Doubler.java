package org.athenian.lambdas._1_subclasses;

public class Doubler
    extends TextConverter {

  @Override
  String convert(String text) {
    return text + text;
  }
}
