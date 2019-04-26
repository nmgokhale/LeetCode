package leetcode;

/*
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * 
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * 
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * For the purpose of this problem, we will return 0 when needle is an empty string. 
 * This is consistent to C's strstr() and Java's indexOf().
 * 
 * */

public class StringOperations {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        int index = -1;
        for(int i=0; i<haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0) && i+needle.length() <= haystack.length()){
                if(haystack.substring(i, i+needle.length()).equals(needle)){
                    index = i;
                    break;
                }
            }
        }        
        return index;
        
    }

}
