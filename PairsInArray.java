public class PairsInArray
{
    public static void printPairs(int numbers[]) {
        int totalPairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = " + totalPairs);
    }
    public static void main(String args[])
    {
        int numbers[] = {2,4,6,8,10,12,14,16};
        printPairs(numbers);
    }
}