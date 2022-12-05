public class OddOrEvenInBinary
{
    public static void main(String args[])
    {
        int num = 5;
        if ((num & 1) == 1) {
            System.out.println("Odd");
        }
        else if((num & 1) == 0){
            System.out.println("Even");
        }
    }
}