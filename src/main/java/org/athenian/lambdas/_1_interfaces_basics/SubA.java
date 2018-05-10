package org.athenian.lambdas._1_interfaces_basics;

public class SubA
    extends Parent
    implements InterA, InterC {


  @Override
  public void methodA() {
    System.out.println("SubA performing methodA()");
  }

  @Override
  public void methodC() {
    System.out.println("SubA performing methodC()");
  }

  @Override
  void parentMethod() {
    System.out.println("SubA performing parentMethod()");

  }
}
