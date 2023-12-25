package leetcode75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

	List<String> output = new ArrayList<>();
    Map<Character, String> dialPad = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0){
            return output;
        }    
        // dialPad.put('', "");
        dialPad.put('2', "abc");
        dialPad.put('3', "def");
        dialPad.put('4', "ghi");
        dialPad.put('5', "jkl");
        dialPad.put('6', "mno");
        dialPad.put('7', "pqrs");
        dialPad.put('8', "tuv");
        dialPad.put('9', "wxyz");

        generate(0, new StringBuilder(), digits);
        return output;
    }

    public void generate(int index, StringBuilder s, String digits){
        if(index == digits.length()){
            output.add(new String(s));
            return;
        }

        char currentDigit = digits.charAt(index);
        String options = dialPad.get(currentDigit);

        for(int i = 0; i < options.length(); i++){
            char letter = options.charAt(i);
            s.append(letter);
            generate(index + 1, s, digits);
            s.deleteCharAt(s.length()-1);
        }
    }
}
