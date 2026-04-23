class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            //  count = n/ 2 esliye likhe hai suppose n = 6 div 2 = 3 so ab jao number 3 se jyada baar aaye ga wahi majrority elemnt hoga ;

            if (count > n / 2) {
                return nums[i];
            }
        }
        //  -1 esliye ku ki agar koi bhi elemnt majority nhi aay aso -1
        return -1;
    }
}