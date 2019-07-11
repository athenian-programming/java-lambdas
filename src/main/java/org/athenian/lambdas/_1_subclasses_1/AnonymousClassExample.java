package org.athenian.lambdas._1_subclasses_1;

import static java.lang.String.format;

public class AnonymousClassExample {
  int instVal = 2;

  public static void main(String[] args) {
    //regular();
    anonymousClass();
  }

  static void regular() {
    var obj = new AnonymousClassExample();
    var clazz = obj.getClass();

    System.out.println("Class name: " + clazz.getName());
    System.out.println("Simple class name: " + clazz.getSimpleName());
    System.out.println("Package name: " + clazz.getPackage().getName());
    System.out.println("Is it anonymous: " + clazz.isAnonymousClass());
    System.out.println(format("Values: %s %d", obj.getValue(), obj.instVal));
  }

  static void anonymousClass() {
    AnonymousClassExample obj = new AnonymousClassExample() {
      {
        instVal = 4;
      }

      @Override
      String getValue() {
        return super.getValue() + " World";
      }
    };

    var clazz = obj.getClass();

    System.out.println("Class name: " + clazz.getName());
    System.out.println("Simple class name: " + clazz.getSimpleName());
    System.out.println("Package name: " + clazz.getPackage().getName());
    System.out.println("Is it anonymous: " + clazz.isAnonymousClass());
    System.out.println(format("Values: %s %d", obj.getValue(), obj.instVal));
  }

  String getValue() {return "Hello";}
}
