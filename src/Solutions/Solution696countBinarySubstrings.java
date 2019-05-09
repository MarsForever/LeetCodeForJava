package Solutions;

public class Solution696countBinarySubstrings {
	public int countBinarySubstrings(String s) {
        int[] groups = new int[s.length()];
        int groupNum = 0;
        groups[0] = 1;
        for(int i = 1 ; i < s.length(); i++){
            //System.out.println(groupNum +" "+ groups[groupNum]);
        	
        	//如果前后不一致，那么就到下一位开始继续比较
        	//grammer1
            if (s.charAt(i-1) != s.charAt(i)){
                groups[++groupNum] = 1;
        //如果以后一致，那么这个组就加一
            }else{
                groups[groupNum]++;
            }
        }
        
        int ans = 0;
        for(int i = 1; i <= groupNum ; i++){
        	// 最小数值即为前后两个数字列的不同连续方式的次数
            ans += Math.min(groups[i-1], groups[i]);
        }
        return ans;
    }
	public static void main(String[] args) {
		String s  = "00110011";
		Solution696countBinarySubstrings test = new Solution696countBinarySubstrings();
		
		System.out.print(test.countBinarySubstrings(s));
	}

}
