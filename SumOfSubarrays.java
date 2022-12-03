public class SumOfSubarrays
{
    public static void sumOfSubarray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    sum = sum + numbers[j2];
                    System.out.print(numbers[j2] + " ");
                }
                System.out.println("Sum of this Subarray is : " + sum);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int numbers[] = {2,4,6,8,10};
        sumOfSubarray(numbers);
    }
}