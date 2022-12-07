public class OOPSPracticeQ2 {
    public static void main(String args[]) {
        Person p = new Person();
        p.name = "Meet";
        p.weight = 60;
        System.out.println(p.name);
        System.out.println(p.weight);
    }
}

class Person {
    String name;
    int weight;
}

class Student extends Person {
    int rollNumber;
    String schoolName;
}