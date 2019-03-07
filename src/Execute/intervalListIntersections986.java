package Execute;

import java.util.List;

import Solutions.Solution986;

public class intervalListIntersections986 {
	
	public static void main(String[] args) {
		Interval[] A = new Interval[4];
		A[0] = new Interval(0,2);
		A[1] = new Interval(5,10);
		A[2] = new Interval(13,23);
		A[3] = new Interval(24,25);
		
		Interval[] B = new Interval[4];
		B[0] = new Interval(1,5);
		B[1] = new Interval(8,12);
		B[2] = new Interval(15,24);
		B[3] = new Interval(25,26);
		Solution986 test  = new Solution986();
		System.out.println(test.intervalIntersection(A, B));
	}
}
