import java.util.*;

public class LargestAndSmallestInTwoDArray
{
    public static void LargestAndSmallestInArray(int matrix[][]) {
        int min = matrix[0][0];
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Largest value is : " + min);
        System.out.println("Smallest value is : " + max);
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int matrix[][] = new int[3][3];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            LargestAndSmallestInArray(matrix);
        }
    }
}