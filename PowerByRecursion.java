public class PowerByRecursion {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * pow(x, n - 1);
    }

    public static void main(String args[]) {
        System.out.println(pow(2, 10));
    }
}
// Time complexity : O(n)