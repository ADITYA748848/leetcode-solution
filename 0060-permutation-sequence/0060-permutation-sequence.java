class Solution {
    private int k;
    private String result = "";

    public String getPermutation(int n, int k) {
        this.k = k;

        StringBuilder current = new StringBuilder();
        boolean[] used = new boolean[n + 1];
        backtrack(n, new StringBuilder(), used);
        return result;
    }
    private void backtrack(int n, StringBuilder current, boolean[] used) {      
        // Base case
        if (current.length() == n) {
            k--;
            if (k == 0) {
                result = current.toString();  // k-th permutation store karo
            }
            return;
        }
        // Pruning: agar answer mil gaya toh aage mat jao 
        if (k == 0) return;

        for (int digit = 1; digit <= n; digit++) {
            if (!used[digit]) {
                used[digit] = true;
                current.append(digit);

                backtrack(n, current, used);

                // Backtrack karo
                current.deleteCharAt(current.length() - 1);
                used[digit] = false;
            }
        }
    }
}