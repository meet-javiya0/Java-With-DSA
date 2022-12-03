public class Subarrays
{
    public static void subarray(int numbers[]) {
        int totalSubarrays = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(numbers[j2] + " ");
                }
                totalSubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray = " + totalSubarrays);
    }
    public static void main(String args[])
    {
        int numbers[] = {2,4,6,8,10};
        subarray(numbers);
    }
}