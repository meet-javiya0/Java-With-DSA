public class BruteForce
{
    public static void bruteForce(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    sum = sum + numbers[j2];
                    System.out.print(numbers[j2] + " ");
                }
                System.out.println("Sum of this Subarray is : " + sum);
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum sum is : " + maxSum);
    }
    public static void main(String args[])
    {
        int numbers[] = {1,-2,6,-1,3};
        bruteForce(numbers);
    }
}