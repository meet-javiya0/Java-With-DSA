public class TrappingRainwater {
    public static int trappingRainwater(int height[]) {
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        int trappedwater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterlevel = Math.min(leftMax[i], rightmax[i]);
            trappedwater = trappedwater + waterlevel - height[i];
        }
        return trappedwater;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Trapped water is : " + trappingRainwater(height));
    }
}