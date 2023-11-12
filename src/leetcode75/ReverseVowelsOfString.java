package leetcode75;

import java.util.Stack;

public class ReverseVowelsOfString {

	public static void main(String[] args) {
		System.out.println(reverseVowels("hello"));
		System.out.println(reverseVowels("leetcode"));
	}

	public static String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                stack.push(s.charAt(i));
            }
        }
        String result = "";
        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                result += stack.pop();
            }
            else{
                result += s.charAt(i);
            }
        }
        return result;
    }

    public static Boolean isVowel(char s){
        return(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U');
    }
}
