package leetcode75;

public class GreatestCommonDivisorOfStrings {

	public static void main(String[] args) {
		System.out.println(gcdOfStrings("ABCABC", "ABC"));
		System.out.println(gcdOfStrings("ABABAB", "ABAB"));
		System.out.println(gcdOfStrings("LEET", "CODE"));
	}
	
	public static String gcdOfStrings(String str1, String str2) {
        if(str1.length() < str2.length()){
            return gcdOfStrings(str2, str1);
        }
        
        else if(!str1.startsWith(str2)){
            return "";
        }

        else if(str2.isEmpty()){
            return str1;
        }
        else{
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
    }
}
