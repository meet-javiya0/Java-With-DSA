public class MultiLevelInheritance {
    public static void main(String args[]) {
        Dogs dobby = new Dogs();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
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
class Mammals extends Animal {
    int legs;
}

// Derived / Child / Subclass class
class Dogs extends Mammals {
    String breed;
}