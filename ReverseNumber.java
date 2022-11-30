public class ReverseNumber
{
    public static void main(String args[])
    {
        int num = 10899;
        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10;
        }
        System.out.println();
    }
}