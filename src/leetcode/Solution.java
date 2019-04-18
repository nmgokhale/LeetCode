package leetcode;

import java.util.HashMap;
import java.util.HashSet;

/*
 * Pattern & String. Check if String follows the pattern
 * String = dog cat cat dog
 * Pattern = abba  --> True
 * 
 * String = dog cat cat fish - ['dog', 'cat', 'cat', fish]
 * Pattern = abba --> False - ['a', 'b', 'b', 'a']
 * 
 * String = 
 * Pattern = 
 * 
 * */

public class Solution {
	
	public boolean matchPattern(String word, String pattern) {
		String [] strArr = word.split(" "); // ['dog', 'cat', 'cat', 'dog']		
		char[] patternArr = pattern.toCharArray(); // ['a', 'b', 'c', 'a']
		HashMap<Character, String> map = new HashMap<Character, String>(); // {'a':'dog', 'b':'cat', 'c':'cat'}
		HashSet<String> stringCount = new HashSet<String>();
		if(strArr.length != patternArr.length) {
			return false;
		}else {
			for(int i=0; i<strArr.length; i++) {
				char currentPattern = patternArr[i]; // 'a'
				String currentString = strArr[i]; // 'fish'
				if(map.containsKey(currentPattern) && map.get(currentPattern) != currentString) {
					return false;
				}else if(!map.containsKey(currentPattern)){
					if(stringCount.contains(currentString)) {
						return false;
					}else {
						map.put(currentPattern, currentString);
						stringCount.add(currentString);
					}					
				}else {
					// do nothing
				}				
			}
			
			return true;
		}
		
	}
	
	public void printArray(char[] arr) {
		for(char i: arr) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.matchPattern("dog cat cat fish", "abba")); // false
		System.out.println(s.matchPattern("dog cat cat dog", "abca")); // false
		System.out.println(s.matchPattern("dog cat", "ab")); // true
		System.out.println(s.matchPattern("", "")); // false

	}

}
