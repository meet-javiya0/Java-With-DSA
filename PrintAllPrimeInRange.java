public class PrintAllPrimeInRange {
    public static boolean prime(int a) {
        if (a == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int end = 50;
        int start = 2;
        for (int i = start; i <= end; i++) {
            if (prime(i) == true) {
                System.out.println(i);
            }
        }
    }
}