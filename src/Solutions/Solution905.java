package Solutions;

import java.util.ArrayList;
import java.util.List;


public class Solution905 {
	public int[] sortArrayByParity(int[] A) {
		List<Integer> odd = new ArrayList<>();
		List<Integer>even = new ArrayList<>();
		for(int a = 0; a < A.length; a++) {

			if(A[a] % 2 != 0) {			
				odd.add(A[a]);
			}else {
				even.add(A[a]);
			}
		}
		even.addAll(odd);
		int [] AA = new int[even.size()];
		int i = 0;
		for(int n : even) {
			AA[i++] = n;
		}
		return AA;
	}
}
