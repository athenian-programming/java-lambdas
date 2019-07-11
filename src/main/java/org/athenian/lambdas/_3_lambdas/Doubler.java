package org.athenian.lambdas._3_lambdas;

import static org.athenian.lambdas._2_interfaces_2.InterfaceExample.TextConverter;

public class Doubler
    implements TextConverter {
  @Override
  public String convert(String text) {
    return text + text;
  }
}
