import java.util.*;

public class ConditionalQ5
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a year : ");
            int year = sc.nextInt();
            
            if((year%4==0) && ((year%100!=0) || ((year%100==0) && (year%400==0))))
            {
                System.out.println(year + " is a Leap Year");
            }
            else
            {
                System.out.println(year + " is not a Leap Year");
            }
        }
    }
}