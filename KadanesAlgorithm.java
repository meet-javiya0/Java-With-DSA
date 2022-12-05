public class KadanesAlgorithm {
    public static void kadanesAlgorithm(int numbers[]) {            // if all numbers of array is negative then this code isn't work
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            if (sum < 0 ) {
                sum = 0;
            }
            maxSum = Math.max(sum, maxSum);
        }
        System.out.println("Our maximum subarray sum is : " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanesAlgorithm(numbers);
    }
}