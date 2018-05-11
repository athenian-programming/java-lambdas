package org.athenian.lambdas._1_subclasses;

public class ToLower
    extends TextConverter {

  @Override
  String convert(String text) {
    return text.toLowerCase();
  }
}
