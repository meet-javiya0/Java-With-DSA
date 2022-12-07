public class HybridInheritance {
    public static void main(String args[]) {
        Cat american = new Cat();
        american.walk();
        Tuna tuna = new Tuna();
        tuna.swim();
        Parrot bajri = new Parrot();
        bajri.fly();
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

class Dog extends Mammal {
    void breed() {
        System.out.println("German Shepherd");
    }
}

class Cat extends Mammal {
    void breed() {
        System.out.println("British Shorthair");
    }
}

class Human extends Mammal {
    void Walks() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims in water");
    }
}

class Tuna extends Fish {
    void dangereous() {
        System.out.println("No");
    }
}

class Shark extends Fish {
    void dangereous() {
        System.out.println("Yes");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

class Peacock extends Bird {
    void voice() {
        System.out.println("nice");
    }
}

class Parrot extends Bird {
    void voice() {
        System.out.println("different");
    }
}