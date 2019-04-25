package leetcode;
/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * 
 * Input: "race a car"
 * Output: false
 * 
 * */

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		System.out.println(cleaned);
		
		for(int start=0, end=cleaned.length()-1; start < end; start++, end--) {
			if(cleaned.charAt(start) != cleaned.charAt(end)) {
				return false;
			}
		}
		return true;
	}
}
