public class BinaryToDecimal {
    public static int bintodec(int n) {
        int pow = 0;
        int decimal = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            decimal = decimal + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            n /= 10;
        }
        return decimal;
    }

    public static void main(String args[]) {
        System.out.println(bintodec(10));
        // dont enter the number like this 0010 ,enter 10
    }
}