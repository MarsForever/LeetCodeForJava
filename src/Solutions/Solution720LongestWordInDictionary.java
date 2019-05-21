package Solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution720LongestWordInDictionary {
	public String longestWord(String[] words) {
        //把所有的words进行排序
        Arrays.sort(words);
//        System.out.println(Arrays.toString(words));
        Set<String> set = new HashSet<>();
        String res = "";
        for(String word: words){
        //如果word是一个字或者set中已经包含了除了最后一个字节的文字列
//        	System.out.println("sub:"+word.substring(0, word.length() -1));
            if(word.length() == 1||set.contains(word.substring(0, word.length() -1))){
//                System.out.println("word:" + word);
            	//获得最大字节
            		res = word.length() > res.length() ? word:res;
//                System.out.println("res:" + res);
                set.add(word);
            }
        }
        return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"w","wo","wor","worl", "world"};
		String[] words2 = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
		Solution720LongestWordInDictionary test = new Solution720LongestWordInDictionary();
//		System.out.println(test.longestWord(words2));
		
	}

}
