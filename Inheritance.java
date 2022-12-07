public class Inheritance {
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();
    }
}

// Base / Parent class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived / Child / Subclass class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}