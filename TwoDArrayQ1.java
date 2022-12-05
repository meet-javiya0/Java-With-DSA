public class TwoDArrayQ1 {
    public static int countNum(int arr[][], int num) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == num) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String args[]) {
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int num = 7;
        System.out.println(countNum(arr, num));
    }
}