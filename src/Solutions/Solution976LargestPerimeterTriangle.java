package Solutions;

import java.util.Arrays;

public class Solution976LargestPerimeterTriangle {
	public int largestPerimeter(int[] A) {
		Arrays.sort(A);
        for(int i = A.length-1 ; i >= 2 ; i-- ){
           if(A[i] < A[i-1] + A[i-2]){
            return A[i]+ A[i-1] +A[i-2]; 
            } 
        }
        return 0;
    }
	public static void main(String[] args) {
		Solution976LargestPerimeterTriangle test = new Solution976LargestPerimeterTriangle();
		int[] data = {3,6,2,3};
		System.out.println(test.largestPerimeter(data));
	}

}
