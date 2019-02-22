package org.athenian.lambdas._2_interfaces_1;


import static java.lang.String.format;

class InterfaceExample {

  public static void main(String[] args) {

    Dog dog = new Dog();
    Lion lion = new Lion();
    Snake snake = new Snake();
    Turtle turtle = new Turtle();

    Animal cat = new Dog() {
      @Override
      public String sound() {
        return "Meow";
      }
    };

    mammalQuestions(dog, lion, (Mammal) cat);
    reptileQuestions(snake, turtle);
    animalQuestions(dog, lion, snake, turtle, cat);
  }

  static void mammalQuestions(Mammal... mammals) {
    for (Mammal mammal : mammals) {
      String name = getClassName(mammal);
      boolean hair = mammal.hasHair();
      System.out.println(format("A %s has hair: %s", name, hair));
    }
  }

  static void reptileQuestions(Reptile... reptiles) {
    for (Reptile reptile : reptiles) {
      String name = getClassName(reptile);
      boolean hair = reptile.hasShell();
      System.out.println(format("A %s has shell: %s", name, hair));
    }
  }

  static void animalQuestions(Animal... animals) {
    for (Animal animal : animals) {
      String name = getClassName(animal);
      String sound = animal.sound();
      if (animal.makesASound())
        System.out.println(format("A %s makes sound: %s", name, sound));
      else
        System.out.println(format("A %s is silent", name));
    }
  }

  static String getClassName(Object object) {
    Class clazz = object.getClass();
    return clazz.isAnonymousClass() ? clazz.getName() : clazz.getSimpleName();
  }
}
