public class FunctionOverloadingUsingDataType
{
    public static int sum(int a,int b)
    {
        return a+b;
    }
    // We can make diffrent function of same name but different data types
    public static float sum(float a,float b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        System.out.println(sum(5,10));
        System.out.println(sum(5.5f,10.5f));
    }
}