import java.util.*;

public class OOPSQ1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            Complex c1 = new Complex();
            c1.realPart1 = sc.nextInt();
            c1.imgPart1 = sc.nextInt();
            c1.realPart2 = sc.nextInt();
            c1.imgPart2 = sc.nextInt();
            c1.sum(c1.realPart1, c1.imgPart1, c1.realPart2, c1.imgPart2);
            c1.differenec(c1.realPart1, c1.imgPart1, c1.realPart2, c1.imgPart2);
            c1.product(c1.realPart1, c1.imgPart1, c1.realPart2, c1.imgPart2);
        }
    }
}

class Complex {
    int realPart1;
    int imgPart1;
    int realPart2;
    int imgPart2;

    void sum(int realPart1, int imgPart1, int realPart2, int imgPart2) {
        System.out.println((realPart1 + realPart2) + " + i(" + (imgPart1 + imgPart2) + ")");
    }

    void differenec(int realPart1, int imgPart1, int realPart2, int imgPart2) {
        System.out.println((realPart1 - realPart2) + " + i(" + (imgPart1 - imgPart2) + ")");
    }

    void product(int realPart1, int imgPart1, int realPart2, int imgPart2) {
        System.out.println((realPart1 * realPart2) + " + i(" + (imgPart1 * imgPart2) + ")");
    }
}