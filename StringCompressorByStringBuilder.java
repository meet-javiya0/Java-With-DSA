public class StringCompressorByStringBuilder
{
    public static StringBuilder compress(String str) {
        StringBuilder newStr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                newStr.append(str.charAt(i));
                newStr.append(count);
            }
        }
        return newStr;
    }
    public static void main(String args[])
    {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}