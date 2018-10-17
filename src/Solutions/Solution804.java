package Solutions;
import java.util.*;

public class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
    	Map<String, String> letterToMorse = new HashMap<>();
    	Set<String> getMorse = new HashSet<>();
    	letterToMorse.put("a",".-");
    	letterToMorse.put("b","-...");
    	letterToMorse.put("c","-.-.");
    	letterToMorse.put("d","-..");
    	letterToMorse.put("e",".");
    	letterToMorse.put("f","..-.");
    	letterToMorse.put("g","--.");
    	letterToMorse.put("h","....");
    	letterToMorse.put("i","..");
    	letterToMorse.put("j",".---");
    	letterToMorse.put("k","-.-");
    	letterToMorse.put("l",".-..");
    	letterToMorse.put("m","--");
    	letterToMorse.put("n","-.");
    	letterToMorse.put("o","---");
    	letterToMorse.put("p",".--.");
    	letterToMorse.put("q","--.-");
    	letterToMorse.put("r",".-.");
    	letterToMorse.put("s","...");
    	letterToMorse.put("t","-");
    	letterToMorse.put("u","..-");
    	letterToMorse.put("v","...-");
    	letterToMorse.put("w",".--");
    	letterToMorse.put("x","-..-");
    	letterToMorse.put("y","-.--");
    	letterToMorse.put("z","--..");
    	
        if(words.length <= 100) {
        	for(int a = 0 ; a < words.length ; a++) {
        		if(words[a].length() >= 1 && words[a].length() <= 12) {
        			String temp = "";
        			for(int b = 0 ; b < words[a].length() ; b++) {
        				temp += letterToMorse.get(words[a].substring(b, b+1));
        			}
        			getMorse.add(temp);
        		}else {
        			break;
        		}
        	}
        	
        }else {
        	System.out.println("words is more than 100");
        }
         
        return getMorse.size();
    }
}
