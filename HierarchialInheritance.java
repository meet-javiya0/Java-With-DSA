public class HierarchialInheritance {
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();
        Mammal human = new Mammal();
        human.breathe();
        Bird parrot = new Bird();
        parrot.color = "Green";
        System.out.println(parrot.color);
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims in water");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}