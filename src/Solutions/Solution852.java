package Solutions;

public class Solution852 {
    public int peakIndexInMountainArray(int[] A) {
        int i = 1;
        for( ; i < A.length ; i++){
            if(A[i] > A[i+1] ){
                return i;                
            }
        }
        return i;
    }
}
