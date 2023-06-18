class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for(int i =0 ; i < n ;i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                char p  = st.peek();
                if((ch == ')' && p == '(') || (ch == '}' && p == '{') || (ch == ']' && p == '[')){
                    st.pop();
                }
                else return false;

            }
        }

        if(st.isEmpty()) return true;
        else return false;
        
    }
}
