import java.util.*;

public class InbuiltSortInJava
{
    public static void printArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr);
        printArray(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        printArray(arr);
        Arrays.sort(arr,2,5);
        printArray(arr);
        Arrays.sort(arr,2,5,Collections.reverseOrder());
        printArray(arr);
    }
}