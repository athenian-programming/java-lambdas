package org.athenian._1_subclasses_1;

public class AnonymousClassExample {
    int instVal = 2;

    public static void main(String[] args) {
        regular();
        System.out.println();
        anonymousClass();
    }

    static void regular() {
        var obj = new AnonymousClassExample();
        var clazz = obj.getClass();

        System.out.println("Class name: " + clazz.getName());
        System.out.println("Simple class name: " + clazz.getSimpleName());
        System.out.println("Package name: " + clazz.getPackage().getName());
        System.out.println("Is it anonymous: " + clazz.isAnonymousClass());
        System.out.printf("Values: %s %d%n", obj.getGreeting(), obj.instVal);
    }

    static void anonymousClass() {
        AnonymousClassExample obj = new AnonymousClassExample() {
            {
                instVal = 4;
            }

            @Override
            String getGreeting() {
                return super.getGreeting() + " World";
            }
        };

        var clazz = obj.getClass();

        System.out.println("Class name: " + clazz.getName());
        System.out.println("Simple class name: " + clazz.getSimpleName());
        System.out.println("Package name: " + clazz.getPackage().getName());
        System.out.println("Is it anonymous: " + clazz.isAnonymousClass());
        System.out.printf("Values: %s %d%n", obj.getGreeting(), obj.instVal);
    }

    String getGreeting() {
        return "Hello";
    }
}
