import java.util.*;

public class ReverseTheNumber {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();

            int lastdigit;
            int rev = 0;
            while (a > 0) {
                lastdigit = a % 10;
                rev = (rev * 10) + lastdigit;
                a /= 10;

            }
            System.out.println(rev);
        }
    }
}