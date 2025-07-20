
class Animal {

    void eat() {
        System.out.println("Animal wants to eat");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Cat eats bread");
    }
}

class Horse extends Animal {

    void run() {
        System.out.println("Horse runs fast");
    }
}

public class AnimalTest {

    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.run();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
