public class ArraysQ2 {
    // By Binary Search, Time Complexity : O(logn)
    
    public static int findTargetIndex(int arr[], int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int goToLeftOrRight(int arr[], int target) {
        int min = minElementIndex(arr);
        if (arr[min] <= target && arr[arr.length - 1] >= target) {
            return findTargetIndex(arr, min, arr.length - 1, target);
        }
        else {
            return findTargetIndex(arr, 0, min, target);
        }
    }

    public static int minElementIndex(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                return mid;
            } else if (arr[left] <= arr[mid] && arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(goToLeftOrRight(arr, target));
    }
}