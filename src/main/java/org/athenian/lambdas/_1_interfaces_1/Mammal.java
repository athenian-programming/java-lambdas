package org.athenian.lambdas._1_interfaces_1;

abstract class Mammal {

  private final boolean hair;

  public Mammal(boolean hair) {
    this.hair = hair;
  }

  boolean hasHair() { return hair;}
}
