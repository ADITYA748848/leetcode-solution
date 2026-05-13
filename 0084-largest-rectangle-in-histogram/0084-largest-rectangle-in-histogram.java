class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int [] nse =new int[n];    // nse jo hai right to left (next smallest element ) 
        int [] pse = new int [n];  // pse jo hai left to right(Privious smallest elem)

        st.push(n -1); // last index as it is push kar diya stack me

        // Caluating nse[]
        nse[ n-1] = n;   // n esliye ku ki ek jyada liye hai      

        for(int i = n-2; i>=0; i--){ // jab first elemnt as it is push huwa esliye next elemnt se start huwa
           while (st.size()>0 && heights[st.peek()] >= heights[i]){ //heights[ans.peek()] means st ke under index fill kar rhe hai 
            st.pop();          
           } 
           if(st.size() == 0) nse[i] = n;
           else nse[i] = st.peek();
           st.push(i);
        }
        // empting stack kiya again;
        while(st.size()>0) st.pop();

        // Calculate pse[]
        st.push(0);
        pse[0] = -1;
        for(int i = 1; i<=n-1; i++){
            while(st.size()>0 && heights[st.peek()] >= heights[i]){
                st.pop();
            // iska mtlb hai kya stack me heights per jo value hai kya usse bara hai agar hai toh pop karo

            }
            if(st.size() == 0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }
               
    
       // Maximum area of reactangle 
        int max = -1;
        for(int i= 0; i< n; i++){
            int area = heights[i] * (nse[i] - pse[i] - 1);
            max = Math.max(max, area);
        }
        return max;
    }
}