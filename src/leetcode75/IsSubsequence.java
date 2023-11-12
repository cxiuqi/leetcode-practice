package leetcode75;

public class IsSubsequence {

	public static void main(String[] args) {
		System.out.println(isSubsequence("abc", "ahbgdc"));
		System.out.println(isSubsequence("axc", "ahbgdc"));
	}
	
    public static boolean isSubsequence(String s, String t) {
        if(t.length() < s.length()){
            return false;
        }
        else if(s.length() == 0){
            return true;
        }
        else{
            int j = 0; 
            for(int i = 0; i < t.length(); i++){
                if(t.charAt(i) == s.charAt(j)){
                    j++;
                    if(j == s.length()){
                        return true;
                    }
                }
            }
            return false;
        }
    }

}
