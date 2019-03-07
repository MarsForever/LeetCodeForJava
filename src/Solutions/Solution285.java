package Solutions;

public class Solution285 {
	public int addDigits(int num) {
        int n,sum = 0;
        while(num > 0){
            n = num % 10;
            sum += n;
            num = num / 10;
            if(num <= 0 && sum >= 10){
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }
}
