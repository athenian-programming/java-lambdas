package org.athenian._2_interfaces_1;

class Turtle extends Reptile implements Animal {

  public Turtle() {
    super(true);
  }

  @Override
  public String sound() {
    return "";
  }

  @Override
  public int legs() {
    return 4;
  }
}