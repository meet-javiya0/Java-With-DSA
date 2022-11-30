import java.util.*;

public class ConditionalQ1
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number : ");
            int number = sc.nextInt();
            if(number > 0)
            {
                System.out.println("Number is Positive");
            }
            else if(number < 0)
            {
                System.out.println("Number is Negative");
            }
            else
            {
                System.out.println("It's Zero!!");
            }
        }
    }
}