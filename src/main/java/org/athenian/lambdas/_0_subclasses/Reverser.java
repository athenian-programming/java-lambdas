package org.athenian.lambdas._0_subclasses;

public class Reverser
    extends TextConverter {

  @Override
  String convert(String text) {
    StringBuilder sb = new StringBuilder();
    for (int i = text.length() - 1; i >= 0; i--)
      sb.append(text.charAt(i));
    return sb.toString();
  }
}
