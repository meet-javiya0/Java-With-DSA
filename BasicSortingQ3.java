public class BasicSortingQ3 {
    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int previousIndex = i - 1;
            int currentElement = arr[i];
            while (previousIndex >= 0 && arr[previousIndex] < currentElement) {
                arr[previousIndex + 1] = arr[previousIndex];
                previousIndex--;
            }
            arr[previousIndex + 1] = currentElement;
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
        InsertionSort(arr);
        printArray(arr);
    }
}