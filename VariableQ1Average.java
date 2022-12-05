import java.util.*;

public class VariableQ1Average
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            float average = (float)(a+b+c)/3;
            System.out.println(average);
        }
    }
}