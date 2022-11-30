import java.util.*;

public class FunctionWithParameter
{
    public static int sum(int a, int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum of these number is : " + sum(a, b));
        }
    }
}