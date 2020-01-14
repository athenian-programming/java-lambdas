package org.athenian._2_interfaces_1;

public class Lion extends Mammal implements Animal {

  public Lion() {
    super(true);
  }

  @Override
  public String sound() {
    return "Roar";
  }

  @Override
  public int legs() {
    return 4;
  }
}
