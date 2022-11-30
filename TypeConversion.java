public class TypeConversion
{
    public static void main(String args[])
    {
        int a = 25;             //Works
        long b = a;
        System.out.println(b);

        // long a = 25;             //Does not works
        // int b = a;
        // System.out.println(b);

        // Scanner sc = new Scanner(System.in); //Works
        // float number = sc.nextFloat();
        // System.out.println(number);

        //double > long > float > int > short > byte
    }
}