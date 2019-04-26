package leetcode;
/*
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Example 1:
 * Input: 123
 * Output: 321
 * 
 * Example 2:
 * Input: -123
 * Output: -321
 * 
 * Example 3:
 * Input: 120
 * Output: 21
 * 
 * */


public class ReverseInteger {
	public int reverse(int x) {
        boolean negative = false;
        int reverse = 0, pop = 0;
        if(x < 0){
            negative = true;
            x = Math.abs(x);
        }
        
        while(x!=0){
            pop = x % 10;
            x = x/10;
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            reverse = reverse*10 + pop;
        }
        
        if(negative){
            return 0 - reverse;
        }else{
            return reverse;
        }
    }

}
