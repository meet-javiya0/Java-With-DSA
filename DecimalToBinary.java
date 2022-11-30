public class DecimalToBinary
{
    public static int DToB(int n)
    {
        int pow = 0;
        int decimal = 0;

        while(n > 0)
        {
            int reminder = n%2;
            decimal = decimal + (reminder * (int)Math.pow(10,pow) );
            pow++;
            n/=2;
        }
        return decimal;
    }
    public static void main(String args[])
    {
        System.out.println(DToB(10));
    }
}