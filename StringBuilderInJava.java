public class StringBuilderInJava
{
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {      // Time complexity = O(26)
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}