package Solutions;

public class Solution744 {
public char nextGreatestLetter(char[] letters, char target) {
	int len = letters.length;
	if(target >= letters[len-1]) {
		return letters[0];
	}
	int low = 0;
	int high = len -1;
	
	while(low <= high) {
		int mid = (low + high) / 2;
		 //a[mid] <= target: 说明大于target 值的元素在 mid+1 ~ high 之间
		if(letters[mid] <= target) {
			low = mid + 1;
		}else {
			 //a[mid] > target: 
			// 1. 如果 a[mid==0],第一个字母大于target的情况
			// 2. a[mid-1] 的值小于 target
	         //说明不存在比 target 更大且比 a[mid] 更小的值了；
			if(mid == 0 || letters[mid-1] <= target){
				return letters[mid];
			}else {
				high = mid -1;
			}
		}
	}
	return target;
    }
}
