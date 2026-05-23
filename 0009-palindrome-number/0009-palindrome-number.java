class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0) return false;
      int answer = 0;
      int temp = x;

      while (x !=0){
        answer = (answer * 10) + x % 10;
        x= x/10;

      }

      if(temp==answer) return true;
      return false;
       
    } 
}