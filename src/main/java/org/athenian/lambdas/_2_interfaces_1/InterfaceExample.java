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
      var name = getClassName(mammal);
      var hair = mammal.hasHair();
      System.out.println(format("A %s has hair: %s", name, hair));
    }
  }

  static void reptileQuestions(Reptile... reptiles) {
    for (Reptile reptile : reptiles) {
      var name = getClassName(reptile);
      var shell = reptile.hasShell();
      System.out.println(format("A %s has shell: %s", name, shell));
    }
  }

  static void animalQuestions(Animal... animals) {
    for (Animal animal : animals) {
      var name = getClassName(animal);
      var sound = animal.sound();
      if (animal.makesASound())
        System.out.println(format("A %s makes sound: %s", name, sound));
      else
        System.out.println(format("A %s is silent", name));
    }
  }

  static String getClassName(Object object) {
    var clazz = object.getClass();
    return clazz.isAnonymousClass() ? clazz.getName() : clazz.getSimpleName();
  }
}
