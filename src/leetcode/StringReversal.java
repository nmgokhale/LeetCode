package leetcode;

/*
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * Input: ["h","e","l","l","o"] 
 * Output: ["o","l","l","e","h"]
 * 
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 * */
public class StringReversal {
	
	public void reverseString(char[] s) {
		for(int i=0, j=s.length -1; i<=j; i++, j--) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
		printArray(s);
	}
	
	public void printArray(char[] a) {
		System.out.print("[");
		for(int i=0; i<a.length; i++) {
			System.out.print("'"+ a[i] + "'," + " ");
		}
		System.out.print("]");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReversal obj = new StringReversal();
		char[] input1 = {'h','e','l','l','o'};
		obj.reverseString(input1); // o/p - ['o', 'l', 'l', 'e', 'h', ]
		
		char[] input2 = {'H','a','n','n','a', 'h'};
		obj.reverseString(input2); // o/p - ['h', 'a', 'n', 'n', 'a', 'H', ]
		
	}

}
