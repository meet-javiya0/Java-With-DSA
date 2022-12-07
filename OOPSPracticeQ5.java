public class OOPSPracticeQ5 {
    public static void main(String args[]) {
        Vehicle obj1 = new Car();
        obj1.print();   // prints derived class because object is of car class 
        // and function overriding is happened here

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}

class Vehicle {
    void print() {
        System.out.println("Base class(Vehicle)");
    }
}

class Car extends Vehicle {
    void print() {
        System.out.println("Derived class");
    }
}