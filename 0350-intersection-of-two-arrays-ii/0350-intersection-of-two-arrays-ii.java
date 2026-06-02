class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int [] freq = new int[1001];
        List<Integer> ans = new ArrayList<>();

        for(int n1 : nums1){
            freq[n1]++;
        }
        for(int n2 : nums2){
            if(freq[n2] > 0){
                ans.add(n2);
                freq[n2]--;
            }
        }
        int[] res = new int[ans.size()];
        for(int i =0; i< ans.size(); i++){
            res[i] = ans.get(i);
        }
        return res; 




    //     HashMap<Integer, Integer> set = new HashMap<>(); 
    //     List<Integer> ans = new ArrayList<>();
    //  // hashset me (add) used hota hai or hashmap me (put) use karte hai
     
    //     for(int n1 : nums1){
    //         set.put(n1, set.getOrDefault(n1, 0) + 1); // freq increaase kiye hai 
    //     }

    //     for(int n2 : nums2){
    //         if (set.containsKey(n2) && set.get(n2) > 0) {
    //             ans.add(n2);
    //             set.put(n2, set.get(n2) - 1);
    //         }
    //     }
    //     int[] res = new int[ans.size()];
    //     for(int i =0; i< ans.size(); i++){
    //         res[i] = ans.get(i);
    //     }
    //     return res;   
    }   
}