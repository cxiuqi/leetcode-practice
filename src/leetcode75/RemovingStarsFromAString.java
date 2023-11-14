package leetcode75;

public class RemovingStarsFromAString {

    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        char arr[] = s.toCharArray();
        for(char i : arr){
            if(i == '*'){
                sb.deleteCharAt(sb.length() - 1);
            }
            else{
                sb.append(i);
            }
        }
        return sb.toString();
    }
}
