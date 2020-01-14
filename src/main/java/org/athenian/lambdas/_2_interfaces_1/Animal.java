package org.athenian.lambdas._2_interfaces_1;

interface Animal {

  String sound();

  int legs();

  default boolean makesASound() {
    return sound().length() > 0;
  }
}
