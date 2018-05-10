package org.athenian.lambdas._0_subclasses;

public class Doubler
    extends TextConverter {

  @Override
  String convert(String text) {
    return text + text;
  }
}
