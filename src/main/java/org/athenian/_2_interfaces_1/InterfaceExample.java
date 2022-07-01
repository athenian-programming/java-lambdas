package org.athenian._2_interfaces_1;


class InterfaceExample {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Lion lion = new Lion();
        Snake snake = new Snake();
        Turtle turtle = new Turtle();

        Dog cat =
                new Dog() {
                    @Override
                    public String sound() {
                        return "Meow";
                    }
                };

        // System.out.println(dog.getClass().getSimpleName());
        // System.out.println(cat.getClass().getName());

        mammalQuestions(dog, lion, (Mammal) cat);
        reptileQuestions(snake, turtle);
        animalQuestions(dog, lion, snake, turtle, cat);
    }

    static void mammalQuestions(Mammal... mammals) {
        for (Mammal mammal : mammals) {
            var name = getClassName(mammal);
            var hair = mammal.hasHair();
            System.out.printf("A %s has hair: %s%n", name, hair);
        }
    }

    static void reptileQuestions(Reptile... reptiles) {
        for (Reptile reptile : reptiles) {
            var name = getClassName(reptile);
            var shell = reptile.hasShell();
            System.out.printf("A %s has shell: %s%n", name, shell);
        }
    }

    static void animalQuestions(Animal... animals) {
        for (Animal animal : animals) {
            var name = getClassName(animal);
            var sound = animal.sound();
            if (animal.makesASound())
                System.out.printf("A %s makes sound: %s%n", name, sound);
            else
                System.out.printf("A %s is silent%n", name);
        }
    }

    static String getClassName(Object object) {
        var clazz = object.getClass();
        return clazz.isAnonymousClass() ? clazz.getName() : clazz.getSimpleName();
    }
}
