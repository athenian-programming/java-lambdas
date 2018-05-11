package org.athenian.lambdas._2_interfaces_1;

class Snake
    extends Reptile
    implements Animal {

  public Snake() {
    super(false);
  }

  @Override
  public String sound() { return "Hiss";}

  @Override
  public int legs() { return 4;}
}
