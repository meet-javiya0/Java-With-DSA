import java.util.*;
public class FunctionsQ2 {
    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }  
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;
            System.out.print("Enter an integer: ");
            num = sc.nextInt();
            if(isEven(num)) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        }
    }
}
