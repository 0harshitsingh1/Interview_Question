package StringQuestion;

import java.util.Stack;

class ValidParanthese{
    int validParanthese(String s){
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLength = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push(i);
            }else{
                st.pop();
            }

            if(st.isEmpty()){
                st.push(i);
            }
            else{
                maxLength = Math.max(maxLength, i - st.peek());
            }
        }
        return maxLength;
    }
}

public class LongestValidParentheses{
    public static void main(String[] args) {
        ValidParanthese vp = new ValidParanthese();
        String s = ")()())";
        
        int res = vp.validParanthese(s);
        System.out.println(res);
    }
}
