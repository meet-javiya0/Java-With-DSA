public class PatternNumberPyramid
{
    public static void main(String args[])
    {
        int num = 5;
        for(int i=1;i<=num;i++)
        {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}