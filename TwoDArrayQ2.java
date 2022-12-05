public class TwoDArrayQ2 {
    public static int sumOfRow(int nums[][], int row) {
        int sum = 0;
        for (int i = 0; i < nums[0].length; i++) {
            sum = sum + nums[row - 1][i];
        }
        return sum;
    }

    public static void main(String args[]) {
        int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int row = 2;
        System.out.println(sumOfRow(nums, row));
    }
}