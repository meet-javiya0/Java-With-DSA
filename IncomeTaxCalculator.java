import java.util.*;

public class IncomeTaxCalculator
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int income = sc.nextInt();
            int Tax;
            
            if(income < 500000)
            {
                Tax = 0;
            }
            else if(income >= 500000 && income < 1000000)
            {
                Tax = (int)((income-500000) * 0.2);
            }
            else
            {
                Tax = (int)(500000 * 0.2) + (int)((income-1000000) * 0.3);
            }
            System.out.println("Your tax is = " + Tax);
        }
    }
}