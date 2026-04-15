class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int countWater = 0;

        int leftMax = 0;
        int rightMax = 0;

        int i = 0;
        int j = n - 1;

        while (i < j) {

            leftMax = Math.max(leftMax, height[i]);
            rightMax = Math.max(rightMax, height[j]);

            if (leftMax < rightMax) {

                countWater = countWater + leftMax - height[i];
                i++;
            } else {

                countWater += rightMax - height[j];
                j--;
            }
        }
        return countWater;
    }
}