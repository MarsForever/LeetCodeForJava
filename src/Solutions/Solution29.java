package Solutions;

public class Solution29 {
	public int divid (int dividend, int divisor) {
		  boolean neg = (dividend > 0) ^ (divisor > 0);
		  if(dividend < 0)
		    dividend = -dividend;
		  if(divisor < 0)
		    divisor = -divisor;
		  if(dividend < divisor)
		    return 0;
		  int msb = 0;
		  for(msb = 0; msb < 32; msb++) {
		    if((divisor << msb) >= dividend)
		      break;
		  }
		  int q = 0;
		  for(int i = msb; i >= 0; i--) {
		    if((divisor << i) > dividend)
		      continue;
		    q |= (1 << i);
		    dividend -= (divisor << i);
		  }
		  if(neg)
		    return -q;
		  return q;
	}
}
