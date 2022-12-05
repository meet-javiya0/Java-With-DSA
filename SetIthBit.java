public class SetIthBit
{
    public static int setIthBit(int num,int i) {
        return num | (1<<i);
    }
    public static void main(String args[])
    {
        System.out.println(setIthBit(10, 2));
    }
}