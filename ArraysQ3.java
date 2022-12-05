public class ArraysQ3 {
    public static int maxProfit(int prices[]) {
        // My Method
        // int minNumberIndex = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[minNumberIndex] > arr[i]) {
        //         minNumberIndex = i;
        //     }
        // }
        // int maxProfit = 0;
        // int i = minNumberIndex;
        // while (i < arr.length) {
        //     int diff = arr[i] - arr[minNumberIndex];
        //     if (maxProfit < diff) {
        //         maxProfit = diff;
        //     }
        //     i++;
        // }
        // return maxProfit;
        
        // Alternate Method
        int buy = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buy < prices[i]) {
                maxProfit = Math.max(prices[i] - buy, maxProfit);
            }
            else {
                buy = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }
}