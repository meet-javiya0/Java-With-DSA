public class UpdateIthBit
{
    public static int setIthBit(int num,int i) {
        return num | (1<<i);
    }
    public static int clearIthBit(int num,int i) {
        return num & ~(1<<i);
    }
    public static int updateIthBit(int num,int i,int newBit) {
        // if (newBit == 0) {
        //     return clearIthBit(num, i);
        // }
        // else {
        //     return setIthBit(num, i);
        // }

        // alternative method
        num = clearIthBit(num, i);
        return num | (newBit<<i);
    }
    public static void main(String args[])
    {
        System.out.println(updateIthBit(10, 2,1));
    }
}