package Solutions;

public class Solution922 {
	public int[] sortArrayByParityII(int[] A) {
		int[] cloneA = new int[A.length];
		int tempOdd = 1;
		int tempEven = 0;
		for(int i = 0 ; i < A.length ; i++) {
			if(A[i] % 2 == 0) {
				cloneA[tempEven] = A[i];
				tempEven += 2;
			}else {
				cloneA[tempOdd] = A[i];
				tempOdd +=2;
			}
		}
		return cloneA;
	}
}
