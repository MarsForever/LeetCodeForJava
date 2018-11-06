package Solutions;

public class Solution852 {
    public int peakIndexInMountainArray(int[] A) {
//    	sample 1 ms submission
        int left = 0;
        int right = A.length - 1;
        while(left < right){
        	//find the middle array
        	int mid = left + (right - left)/2;
        	//f 
            if(A[mid] < A[mid+1])
                left = mid + 1;
            else
                right = mid;
        }
        
        return left;
    }
}
