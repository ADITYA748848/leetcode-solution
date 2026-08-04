class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res =  new ArrayList<>();
        Arrays.sort(nums);
        int  min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i= 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];

            }
            else{
                max = nums[i];
            }

        }
        int j =0;
        for(int i= min; i<max; i++){
            if(nums[j] != i){
                res.add(i);
            }
            else{
                j++;
            }
        }
        return res;

        
    }
}