package leetcode75;

public class MaximumNumberOfVowelsInSubstringOfGivenLength {

	public static void main(String[] args) {
		System.out.println(maxVowels("abciiidef", 3));
		System.out.println(maxVowels("aeiou", 2));
		System.out.println(maxVowels("leetcode", 3));
	}
	
	public static int maxVowels(String s, int k) {
        int maxStreak = 0;
        int streak = 0;
        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))){
                streak++; 
            }
        }
        maxStreak = streak;
        for(int i = k; i < s.length(); i++){
            if(isVowel(s.charAt(i-k))){
                streak--;
            }
            if(isVowel(s.charAt(i))){
                streak++;
            }
            maxStreak = streak > maxStreak ? streak : maxStreak;
        }
        return maxStreak;
    }

    public static boolean isVowel(char c){
        return(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
