package org.athenian._2_interfaces_1;

abstract class Reptile {

  private final boolean shell;

  public Reptile(boolean shell) {
    this.shell = shell;
  }

  public boolean hasShell() {
    return this.shell;
  }
}