public class ComparisonFunctionInStrings
{
    public static void main(String args[])
    {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        // same because  of it refers to objects so here new keyword is not used so string object refers to same string
        if (s1 == s2) {
            System.out.println("Strings are same!");
        }
        else {
            System.out.println("Strings are not same!");
        }

        //not same because here new keyword is used in s3 string
        if (s1 == s3) {
            System.out.println("Strings are same!");
        }
        else {
            System.out.println("Strings are not same!");
        }

        // compare the strings(value) and returs boolean value
        if (s1.equals(s3)) {
            System.out.println("Strings are same!");
        }
        else {
            System.out.println("Strings are not same!");
        }
    }
}