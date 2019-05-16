package leetcode;

import java.util.HashMap;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        // Store char & it's count in hashmap
        HashMap<Character, Integer> lookup = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            lookup.put(s.charAt(i), lookup.getOrDefault(i, 0) + 1);            
        }      
        // get the count of each character from hashmap (if count ==1 return index)
        for(int j=0; j<s.length(); j++){
            if(lookup.get(s.charAt(j)) == 1){
                return j;
            }
        }        
        return -1;
    }

}
