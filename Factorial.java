public class Factorial
{
    public static int fac(int a)
    {
        int f=1;
        
        while(a!=0)
        {
            f = f*a;
            a--; 
        }
        return f;
    }
    public static void main(String args[])
    {
        System.out.println(fac(5));
    }
}