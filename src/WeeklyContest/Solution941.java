package WeeklyContest;

import sun.tools.jar.resources.jar;

public class Solution941 {
	public boolean validMountainArray(int[] A) {
		if(A.length < 3)
			return false;
		int max = A[0];
		int maxIndex = 0 ;
		for (int j = 0; j < A.length; j++) { 
            if (A[j] > max) { 
                max = A[j];
                maxIndex = j;
            }
		}
		if(maxIndex+1 == A.length || maxIndex == 0) {
			return false;
		}
		for(int i = 0 ; i < maxIndex ; ) {
			if(A[i] < A[i+1]) {
				i++;
			}else {
				return false;
			}
		}
		for(int i = maxIndex; i < A.length-1 ;) {
			if(A[i]>A[i+1]) {
				i++;
			}else {
				return false;
			}
		}
		return true;
        
    }
}
