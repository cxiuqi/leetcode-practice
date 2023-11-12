package leetcode75;

public class ReverseWordsInString {
	
	public static void main(String[] args) {
		System.out.println(reverseWords("the sky is blue"));
		System.out.println(reverseWords("  hello world  "));
		System.out.println(reverseWords("a good   example"));
	}
	
	public static String reverseWords(String s) {
        s = s.replaceAll("\\s+", " ");
        s = s.trim();
        String tokens[] = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = tokens.length - 1; i >= 0; i--){
            result.append(tokens[i]);
            if(i != 0){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
