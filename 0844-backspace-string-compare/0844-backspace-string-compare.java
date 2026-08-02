class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
        
    }

    public String build(String st){
        StringBuilder sb= new StringBuilder();

        for(char c : st.toCharArray()){
            if(c != '#'){
                sb.append(c);
            } else {
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}