public class BitManipulationQ2
{
    public static void main(String args[])
    {
        int x = 10;
        int y = 5;
        System.out.println("Before swap " + "x : " + x  + " and " + "y : " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap " + "x : " + x  + " and " + "y : " + y);
    }
}