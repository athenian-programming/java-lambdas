package org.athenian.lambdas._1_interfaces_1;


class InterfaceExample {

  public static void main(String[] args) {

    Dog dog = new Dog();
    Lion lion = new Lion();
    Snake snake = new Snake();
    Turtle turtle = new Turtle();

    mammalQuestions(dog, lion);
    reptileQuestions(snake, turtle);
    animalQuestions(dog, lion, snake, turtle);

  }

  static void mammalQuestions(Mammal... mammals) {
    for (Mammal mammal : mammals) {
      String name = mammal.getClass().getSimpleName();
      boolean hair = mammal.hasHair();
      System.out.println(String.format("A %s has hair: %s", name, hair));
    }
  }

  static void reptileQuestions(Reptile... reptiles) {
    for (Reptile reptile : reptiles) {
      String name = reptile.getClass().getSimpleName();
      boolean hair = reptile.hasShell();
      System.out.println(String.format("A %s has shell: %s", name, hair));
    }
  }

  static void animalQuestions(Animal... animals) {
    for (Animal animal : animals) {
      String name = animal.getClass().getSimpleName();
      String sound = animal.sound();
      if (animal.makesASound())
        System.out.println(String.format("A %s makes sound: %s", name, sound));
      else
        System.out.println(String.format("A %s is silent", name));
    }
  }

}
