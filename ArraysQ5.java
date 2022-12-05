import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class ArraysQ5 {
    public static List<List<Integer>> tripletList(int arr[]) {
        List<List<Integer>> result = new ArrayList<List<Integer>> ();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = i + 2; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>>(result));
        return result;
    }

    public static void main(String args[]) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(tripletList(arr));
    }
}