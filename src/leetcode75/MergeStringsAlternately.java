package leetcode75;

public class MergeStringsAlternately {

	public static void main(String[] args) {
		String test1_word1 = "abc";
		String test1_word2 = "pqr";
		String test2_word1 = "ab";
		String test2_word2 = "pqrs";
		String test3_word1 = "abcd";
		String test3_word2 = "pq";
		System.out.println(mergeAlternately(test1_word1,test1_word2));
		System.out.println(mergeAlternately(test2_word1,test2_word2));
		System.out.println(mergeAlternately(test3_word1,test3_word2));
	}

	public static String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int maxIndex = Math.max(m, n);
        String result = "";
        for(int i = 0; i < maxIndex; i++){
            if(i < m){
                result += word1.charAt(i);
            }
            if(i < n){
                result += word2.charAt(i);
            }
        }
        return result;
    }
}
