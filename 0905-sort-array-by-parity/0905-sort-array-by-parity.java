class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // For even phle 
        
        int  Aditya= 0;
        
         // Aditya ek pointer ka kaam use hoo rha hai jab bhi new Array create karte hai tab pointer ka jarurat hota hai 

        for(int i = 0; i< n; i++){
            if(nums [i] % 2 == 0){
                ans[Aditya++] = nums[i];
            }
        }

           // For odd Last me 

        for(int i = 0 ; i <n ; i++){
            if(nums[i] % 2 != 0){
                ans[Aditya++] = nums[i];
            }
        }       
        return ans;
    }
}