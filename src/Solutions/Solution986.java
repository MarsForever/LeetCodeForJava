package Solutions;

import java.util.Arrays;

import Execute.Interval;

public class Solution986 {
	public Interval[] intervalIntersection(Interval[] A, Interval[] B) {
        Interval aws[] = new Interval[A.length * B.length];
        int index = 0;
        for(int i = 0 ; i < A.length ; i++){
            for(int j = 0 ; j < B.length ; j++){
                if(B[j].start > A[i].end || A[i].start > B[j].end ){
                    continue;
                }else{
                    aws[index]=new Interval(Math.max(A[i].start,B[j].start), Math.min(A[i].end, B[j].end));
                    index++;
                }
            }
        }
        Interval returnAws[] = Arrays.copyOf(aws, index);
        
        return returnAws;
  
    }
}
// intialize constructor's array
//https://stackoverflow.com/questions/10456681/how-to-initialize-array-in-java-when-the-class-constructor-has-parameters
//algorithms
//https://scicomp.stackexchange.com/questions/26258/the-easiest-way-to-find-intersection-of-two-intervals
