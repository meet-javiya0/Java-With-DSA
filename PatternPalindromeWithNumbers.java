public class PatternPalindromeWithNumbers
{
    public static void main(String args[])
    {
        int num = 5;
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num - i; j++)
                System.out.print("  ");
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}