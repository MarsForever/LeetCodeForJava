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
		 //a[mid] <= target: ˵������target ֵ��Ԫ���� mid+1 ~ high ֮��
		if(letters[mid] <= target) {
			low = mid + 1;
		}else {
			 //a[mid] > target: 
			// 1. ��� a[mid==0],��һ����ĸ����target�����
			// 2. a[mid-1] ��ֵС�� target
	         //˵�������ڱ� target �����ұ� a[mid] ��С��ֵ�ˣ�
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
