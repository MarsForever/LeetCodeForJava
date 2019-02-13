package Solutions;

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
                    aws[index].start=Math.max(A[i].start,B[j].start);
                    aws[index].end = Math.min(A[i].end, B[j].end);
                    index++;
                }
            }
        }
        return aws;
  
    }
}

//https://scicomp.stackexchange.com/questions/26258/the-easiest-way-to-find-intersection-of-two-intervals
