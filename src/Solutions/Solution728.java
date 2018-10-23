package Solutions;

import java.util.ArrayList;
import java.util.List;

public class Solution728 {
	public List<Integer> selfDividingNumbers(int left, int right){
		List<Integer> list = new ArrayList<Integer>();
		for(int i = left ; i <= right ; i++) {
			
			String word = Integer.toString(i);
			if(word.indexOf("0") >= 1) {
				continue;
			}
			String []wordArray = word.split("");
			int temp = 0;
			for(int j = 0 ; j < wordArray.length ; j++) {
				if(i % Integer.parseInt(wordArray[j]) == 0) {
					temp++;
				}
			}
			if(temp == wordArray.length) {
				list.add(i);
			}

		}
		return list;
	}
}
