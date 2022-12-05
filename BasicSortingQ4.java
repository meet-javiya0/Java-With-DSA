public class BasicSortingQ4 {
    public static void CountingSort(int arr[]) {
        int maxElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxElement < arr[i]) {
                maxElement = arr[i];
            }
        }
        int count[] = new int[maxElement + 1];
        for (int i = 0; i < count.length; i++) {
            count[arr[i]]++;
        }
        int j = count.length;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j--;
                count[i]--;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        CountingSort(arr);
        printArray(arr);
    }
}