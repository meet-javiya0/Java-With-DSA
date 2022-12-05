public class PrefixSum
{
    public static void prefixSum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for (int i = 0; i < prefix.length; i++) {
            for (int j = i; j < prefix.length; j++) {
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maximum sum = " + maxSum);
    }
    public static void main(String args[])
    {
        int numbers[] = {1,-2,6,-1,3};
        prefixSum(numbers);
    }
}