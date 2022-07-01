package org.athenian._2_interfaces_1;

abstract class Mammal {

  private final boolean hair;

  public Mammal(boolean hair) {
    this.hair = hair;
  }

  boolean hasHair() {
    return hair;
  }

  //abstract boolean hasScales();
}
