public class LastOccurenceInArrayByRecursion {
    public static int firstOcc(int arr[], int i, int key) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcc(arr, i - 1, key);
    }

    public static void main(String args[]) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(firstOcc(arr, arr.length-1, 5));
    }
}