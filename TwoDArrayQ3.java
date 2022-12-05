public class TwoDArrayQ3 {
    public static void transposeOfMatrix(int arr[][], int row, int col) {
        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        printArray(transpose);
    }

    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 3, 2 }, { 5, 6, 4 } };
        int row = 2;
        int col = 3;
        printArray(arr);
        System.out.println();
        transposeOfMatrix(arr, row, col);
    }
}