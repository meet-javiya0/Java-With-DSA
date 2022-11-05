import java.util.*;

public class TypeCast
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a = 25.12f;
        int b = (int) a;
        System.out.println(b);

        char ch = 'A';
        int number = (int) ch;
        System.out.println(number);
    }
}