public class StaticKeyword {
    public static void main(String args[]) {
        // Student s1 = new Student();
        // s1.schoolName = "JMV";
        // Student s2 = new Student();
        // System.out.println(s2.schoolName);
        // Student s3 = new Student();
        // s3.schoolName = "ABC";
        // System.out.println(s2.schoolName);
    }
}

class Student {
    static int returnPercentage(int maths, int chem, int phy) {
        return (maths + chem + phy) / 3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}