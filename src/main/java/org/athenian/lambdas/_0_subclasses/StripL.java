package org.athenian.lambdas._0_subclasses;

public class StripL
    extends TextConvert {

  @Override
  String convert(String text) {
    return text.replaceAll("l", "");
  }
}
