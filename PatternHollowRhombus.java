public class PatternHollowRhombus
{
    public static void main(String args[])
    {
        int col = 5;
        int row = 4;
        for(int i=1 ;i<=row ;i++)
        {
            for(int j=1 ; j<=row-i+1 ; j++)
            {
                System.out.print(" ");
            }
            for(int j=1 ;j<=col ;j++)
            {
                if(i==1 || i==row || j==1 || j==col)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}