public class ClearLastIBits
{
    public static int clearIBits(int num, int i) {
        return num & ((~0)<<i);
    }
    public static void main(String args[])
    {
        System.out.println(clearIBits(15, 2));
    }
}