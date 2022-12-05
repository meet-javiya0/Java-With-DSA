import java.util.*;

public class ArrayInputOutputUpdate {
    public static void main(String args[]) {
        int marks[] = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the marks of Physics : ");
            marks[0] = sc.nextInt();
            System.out.print("Enter the marks of Chemistry : ");
            marks[1] = sc.nextInt();
            System.out.print("Enter the marks of Maths : ");
            marks[2] = sc.nextInt();
        }

        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Maths : " + marks[2]);

        float percentage = (float)(marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = " + percentage + "%");

        System.out.println("Length of an array is : " + marks.length);
    }
}