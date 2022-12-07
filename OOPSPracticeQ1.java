public class OOPSPracticeQ1
{
    public static void main(String args[])
    {
        Student s = new Student();
        s.name = "Meet";
        System.out.println(s.name);
    }
}

class Student {
    String name;
    int marks;
}