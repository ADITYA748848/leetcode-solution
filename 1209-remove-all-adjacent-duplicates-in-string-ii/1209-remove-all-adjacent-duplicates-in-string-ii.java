class Solution {
    class Pair {
        char ch;
        int count;
        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!st.isEmpty() && st.peek().ch == ch) {
                st.peek().count++;
                if (st.peek().count == k) {
                    st.pop();
                }
            } else {
                st.push(new Pair(ch, 1));
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            Pair top = st.pop();
            for (int i = 0; i < top.count; i++) {
                sb.append(top.ch);
            }
        }
        return sb.reverse().toString();
    }
}
// class Solution {
//     public String removeDuplicates(String s, int k) {
//         Stack<Character> st = new Stack<>();
//         for(int i = 0; i< s.length(); i++){
//             char ch = s.charAt(i);

//             if(!st.isEmpty() && ch == st.peek() && ch == k){
//                  st.pop();
//             }
//             else{
//                 st.push(ch);
//             }
//         }
//         StringBuilder sb = new StringBuilder();
//         while (!st.isEmpty()) {
//             sb.append(st.pop());
//         }
//         return sb.reverse().toString();
//     }
// }
