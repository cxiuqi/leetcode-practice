package leetcode75;

public class StringCompression {

	public static void main(String[] args) {
		System.out.println(compress(new char[] {'a','a','b','b','c','c','c'}));
		System.out.println(compress(new char[] {'a'}));
		System.out.println(compress(new char[] {'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
	}
	
	public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        sb.append(chars[0]);
    	for(int i = 1; i < chars.length; i++) {
    		if(chars[i] == sb.charAt(sb.length()-1)) {
				counter++;
			}	
			else {
				if(counter != 1) {
					sb.append(counter);
				}
				sb.append(chars[i]);
				counter = 1;
			}
    		
    		if(i == chars.length-1 && counter!=1) {
    			sb.append(counter);
			}
        }
    	for(int i = 0; i < sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
		return sb.toString().length();
    }

}
