public class CopyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Meet";
        s1.rollNumber = 78;
        s1.password = "abcd@123";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz@123";
        s1.marks[2] = 100;
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int rollNumber;
    String password;
    int marks[];

    // Shallow Copy Constructor
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.rollNumber = s1.rollNumber;
    //     // this.password = s1.password;
    //     this.marks = s1.marks;
    // }

    // Deep Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollNumber = s1.rollNumber;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // Lazy Copy = Shallow Copy (Usually in this stage) + Deep Copy (transsform in this when neccessary)

    Student() {
        marks = new int[3];
        System.out.println("Constructor is called");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int rollNumber) {
        marks = new int[3];
        this.rollNumber = rollNumber;
    }
}