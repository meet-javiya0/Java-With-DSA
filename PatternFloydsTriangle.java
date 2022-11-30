public class PatternFloydsTriangle {
    public static void main(String args[]) {
        int num = 5;
        int n = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}