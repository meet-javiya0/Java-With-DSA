public class ArraysQ4
{
    public static int trappedWater(int height[]) {
        // My Method
        // int leftMax[] = new int[height.length];
        // int rightMax[] = new int[height.length];
        // leftMax[0] = height[0];
        // rightMax[height.length-1] = height[height.length-1];
        // for (int i = 1; i < height.length; i++) {
        //     if (leftMax[i-1] < height[i]) {
        //         leftMax[i] = height[i];
        //     }
        //     else {
        //         leftMax[i] = leftMax[i-1];
        //     }
        // }
        // for (int i = height.length-2; i >=0; i--) {
        //     if (rightMax[i+1] < height[i]) {
        //         rightMax[i] = height[i];
        //     }
        //     else {
        //         rightMax[i] = rightMax[i+1];
        //     }
        // }
        // int trappedWater = 0;
        // for (int i = 0; i < height.length; i++) {
        //     trappedWater += (int)(Math.min(leftMax[i], rightMax[i])) - height[i];
        // }
        // return trappedWater;

        // Alternate Method
        int trappedWater = 0;
        int left = 0;
        int right = height.length-1;
        int rightMax = height[right];
        int leftMax = height[left];
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                trappedWater = trappedWater + leftMax - height[left];
            }
            else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                trappedWater = trappedWater + rightMax - height[right];
            }
        }
        return trappedWater;
    }
    public static void main(String args[])
    {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedWater(height));
    }
}