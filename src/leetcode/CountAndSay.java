package leetcode;

/*
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * 
 * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
 * Note: Each term of the sequence of integers will be represented as a string.
 * 
 * */

public class CountAndSay {
	
	public String countAndSay(int n) {
		String s = "1";
		if(n == 1) return s;
		for(int i=2; i<=n; i++) {
			s = helper(s);
		}
		return s;
	}
	
	public String helper(String input) {
		StringBuilder sb = new StringBuilder();
		char c = input.charAt(0);
		int count = 1;
		for(int j=1; j<input.length(); j++) {
			if(input.charAt(j) == c) {
				count++;
			}else {
				sb.append(count);
				sb.append(c);
				count = 1;
				c = input.charAt(j);
			}
		}
		sb.append(count);
		sb.append(c);
		return sb.toString();
	}
	
	public static void main(String[] args) {
		CountAndSay cs = new CountAndSay();
		System.out.println(cs.countAndSay(1));
		System.out.println(cs.countAndSay(2));
		System.out.println(cs.countAndSay(3));
		System.out.println(cs.countAndSay(4));
		System.out.println(cs.countAndSay(5));
		System.out.println(cs.countAndSay(6));
		System.out.println(cs.countAndSay(7));
		System.out.println(cs.countAndSay(8));
		System.out.println(cs.countAndSay(9));
		System.out.println(cs.countAndSay(10));
	}

}
