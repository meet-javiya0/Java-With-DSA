public class LargestOfThree
{
    public static void main(String args[])
    {
        int A = 10;
        int B = 5;
        int C = 15;

        if(A >= B && A >= C)
        {
            System.out.println("A is largest in all");
        }
        else if(B >= C)
        {
            System.out.println("B is largest in all");
        }
        else
        {
            System.out.println("C is largest in all");
        }
    }
}