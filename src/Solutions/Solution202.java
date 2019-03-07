package Solutions;

import java.util.HashSet;
import java.util.Set;

public class Solution202 {
	public boolean isHappy(int n) {
        Set<Integer> isExist = new HashSet<Integer>();
        int num , sum = 0;
        //true if this set did not already contain the specified element
        //https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html#add%28E%29
        while(isExist.add(n)){
            while(n > 0){
                num = n % 10;
                sum += num * num;
                n /= 10;
            } 
            if(sum == 1){
                return true;
            }else{
                n = sum;
                sum = 0;
            }
        }
        return false;
    }
	//Runtime: 1 ms, faster than 95.38% of Java online submissions for Happy Number.
	//Memory Usage: 35.1 MB, less than 26.15% of Java online submissions for Happy Number.

	public static void main(String[] args ) {
		int num = 19;
		Solution202 test  = new Solution202();
		System.out.println(test.isHappy(num));
	}
}
