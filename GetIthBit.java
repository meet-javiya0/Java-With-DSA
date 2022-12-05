public class GetIthBit
{
    public static void getIthBit(int num,int i) {
        if ((num & (1<<i)) == 0) {
            System.out.println(0);
        }
        else {
            System.out.println(1);
        }
    }
    public static void main(String args[])
    {
        int num = 10;
        int i = 3;
        getIthBit(num, i);
    }
}