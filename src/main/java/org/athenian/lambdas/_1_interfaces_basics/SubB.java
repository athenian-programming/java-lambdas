package org.athenian.lambdas._1_interfaces_basics;

public class SubB
    extends Parent
    implements InterB, InterC {

  @Override
  public void methodB() {
    System.out.println("SubB performing methodB()");
  }

  @Override
  public void methodC() {
    System.out.println("SubB performing methodC()");
  }

  @Override
  void parentMethod() {
    System.out.println("SubB performing parentMethod()");

  }
}
