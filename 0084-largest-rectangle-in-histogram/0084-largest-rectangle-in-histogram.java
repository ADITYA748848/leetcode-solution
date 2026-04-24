class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> ans = new Stack<>();
        int maxArea =0;

        for(int i = 0; i< n; i++){
           while (!ans.isEmpty() && heights[ans.peek()] >= heights[i]){
            int height = heights[ans.pop()];
            int width = ans.isEmpty() ? i : i- ans.peek() - 1;
            maxArea = Math.max(maxArea , height * width);
           } 
           ans.push(i) ;
        }
        while(!ans.isEmpty()){
            int height = heights[ans.pop()];
            int width = ans.isEmpty() ? n : n-ans.peek()-1;
            maxArea = Math.max(maxArea , height * width);
        }
        return maxArea;
    }
}