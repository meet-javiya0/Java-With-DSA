import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FunctionsQ4
{
    public static int min(int a,int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    public static int max(int a,int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public static double sqrt(int a) {
        return Math.sqrt(a);
    }
    public static double pow(int a,int b, int c) {
        return Math.pow(a, Math.pow(b, c));
    }
    public static double avg(int a, int b, int c) {
        IntStream intStream = IntStream.of(a,b,c);
        OptionalDouble res = intStream.average();
        return res.getAsDouble();
    }
    public static int abs(int a) {
        return Math.abs(a);
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter three numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(min(a, b, c));
            System.out.println(max(a, b, c));
            System.out.println(sqrt(a));
            System.out.println(pow(a, b, c));
            System.out.println(avg(a, b, c));
            System.out.println(abs(-5));
        }
    }
}