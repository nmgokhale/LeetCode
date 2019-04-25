package leetcode;
/* Implement int sqrt(int x).
* Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
* Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
* Input: 8
* Output: 2
* Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
*/

/*
* Why does the code improve when calculating mid using left + (right -left)//2 over (left +right)/2.
Think about what's happening when you're adding two numbers using the '+' operator. 
A 64 bit CPU can handle the largest integer value of 18,446,744,073,709,551,616. (ulong type in JAVA) 
So when you're calculating (left+right)//2, you're actually generating a higher (unnecessary) value before it dividing by 2. If your input operands are very large integers, your stack may run chances of overflowing.
However, with subtraction as one of the operations, if one of the operands can fit in this numerical space, then it is a guarantee that the result of the whole expression left+(right-left)/2 will also fit in this range. Of course there is a '+' operator in this case too, but the subtraction that happens first (since it is in brackets) compensates for the the risk of overflowing during addition.
Hence the latter is preferred.

* Why mid > x / mid instead of mid * mid > x?
when tmp is too large a value, tmp * tmp may be larger than Integer.MAX_VALUE.
In JAVA, when the value exceeds INTEGER.MAX_VALUE, MSB is set to 1, so compiler thinks it's a negative number. 
To avoid this, we use mid > x / mid instead of mid * mid > x

*/

public class SquareRoot {
	public int mySqrt(int x) {
		if(x == 0) return 0;
		if(x == 1) return 1;
		if(x < 0) return x;
		
		int start = 1, end = x;
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(mid <= x/mid && (mid+1) > x/(mid+1)) {
				return mid;
			}else if(mid > x/mid) {
				end = mid -1;
			}else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
