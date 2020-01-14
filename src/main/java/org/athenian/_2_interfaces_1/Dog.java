package org.athenian._2_interfaces_1;

public class Dog extends Mammal implements Animal {

  public Dog() {
    super(false);
  }

  @Override
  public String sound() {
    return "Woof";
  }

  @Override
  public int legs() {
    return 4;
  }
}
