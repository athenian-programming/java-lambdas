package org.athenian._1_subclasses_2;

public class ToUpper
    extends TextConverter {

  @Override
  String convert(String text) {
    return text.toUpperCase();
  }
}
