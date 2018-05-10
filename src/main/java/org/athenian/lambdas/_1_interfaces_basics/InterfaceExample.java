package org.athenian.lambdas._1_interfaces_basics;


public class InterfaceExample {

  public static void main(String[] args) {

    SubA subA = new SubA();
    SubB subB = new SubB();

    routine1(subA);
    routine1(subB);

    routine2(subA);
    // routine2(subB);

    // routine3(subA);
    routine3(subB);

    routine4(subA);
    // routine4(subB);

    // routine5(subA);
    routine5(subB);

    routine6(subA);
    routine6(subB);
  }

  static void routine1(Parent obj) {
    obj.parentMethod();
  }

  static void routine2(SubA obj) {
    obj.parentMethod();
    obj.methodA();
    obj.methodC();
  }

  static void routine3(SubB obj) {
    obj.parentMethod();
    obj.methodB();
    obj.methodC();
  }

  static void routine4(InterA obj) {
    obj.methodA();
  }

  static void routine5(InterB obj) {
    obj.methodB();
  }

  static void routine6(InterC obj) {
    obj.methodC();
  }
}
