public class ClearRangeOfBits
{
    public static int clearRangeOfBits(int num, int i, int j) {
        int a = num & ((~0)<<j+1);
        int b = num & (1<<i)-1;
        return (a | b);
    }
    public static void main(String args[])
    {
        System.out.println(clearRangeOfBits(10, 2, 3));
    }
}