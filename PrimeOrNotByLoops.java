import java.util.*;

public class PrimeOrNotByLoops
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the no : ");
            int n=sc.nextInt();
            boolean flag = true;

            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    System.out.println("not prime");
                    flag = false;
                }
            }
            if(flag==true)
            {
                System.out.println("prime");
            }
        }
    }
}