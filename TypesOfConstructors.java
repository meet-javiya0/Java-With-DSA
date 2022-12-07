public class TypesOfConstructors
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student("Meet");
        Student s3 = new Student(78);
        s1.name = "xyz";
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.rollNumber);
    }
}

class Student {
    String name;
    int rollNumber;

    // Non-Parameterized
    Student() {
        System.out.println("Constructor is called");
    }
    //Parameterized
    Student(String name) {
        this.name = name;
    }
    Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}