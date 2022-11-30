public class FunctionOverloading
{
    public static int sum(int a,int b)
    {
        return a+b;
    }
    // We can make same type(name) of function but with diffrent number of arguements
    public static int sum(int a,int b, int c)
    {
        return a+b+c;
    }
    public static void main(String args[])
    {
        System.out.println(sum(5,10));
        System.out.println(sum(5,10,20));
    }
}