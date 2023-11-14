package leetcode75;

import java.util.Stack;

public class DecodeString {

	public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ']'){
                while(st.peek() != '['){
                    sb.append(st.pop());
                }
                String temp = sb.toString();
                if(st.peek() == '['){
                    st.pop();
                }
                int count=0;
                char ch = st.peek();
                int x=0;
                while(!st.empty() && ch-'0'>=0 && ch-'0'<=9)
                {
                    x=(st.pop()-'0')*(int)Math.pow(10,count)+x;
                    if(st.empty())
                        break;
                    ch=st.peek();
                    count++;
                }
                for(int j=0;j<x;j++)
                {
                    for(int k=temp.length()-1;k>=0;k--)
                    {
                        st.push(temp.charAt(k));   
                    }
                }
            }
            else{
                st.push(s.charAt(i));
            }
            sb.delete(0, sb.length());
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
