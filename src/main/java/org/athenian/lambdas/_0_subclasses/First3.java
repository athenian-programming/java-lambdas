package org.athenian.lambdas._0_subclasses;

public class First3
    extends TextConvert {

  @Override
  String convert(String text) {
    return text.substring(0, 3);
  }
}
