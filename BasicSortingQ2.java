public class BasicSortingQ2 {
    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int maximumElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maximumElementIndex] < arr[j]) {
                    maximumElementIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maximumElementIndex];
            arr[maximumElementIndex] = temp;
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
        SelectionSort(arr);
        printArray(arr);
    }
}