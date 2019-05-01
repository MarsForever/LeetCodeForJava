package Solutions;

public class Solution371SumofTwoIntegers {
	public  int getSum(int a, int b) {
        while(b != 0)
        {
        		//1.The bitwise & operator performs a bitwise AND operation.
            int carry = b & a;
            //2.The bitwise ^ operator performs a bitwise exclusive OR operation.
            a = a ^ b;
            //3.The signed left shift operator "<<" shifts a bit pattern to the left, 
            b = carry << 1;
        }
         return a;
    }
	//1.2.3. https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html 
   //algorithms https://www.geeksforgeeks.org/add-two-numbers-without-using-arithmetic-operators/
	public static void main(String[] args) {
		int a = 15;
		//1111
		int b = 12;
		//1100
		Solution371SumofTwoIntegers test = new Solution371SumofTwoIntegers();
		// TODO Auto-generated method stub
		System.out.println(test.getSum(a,b));
	}

}
