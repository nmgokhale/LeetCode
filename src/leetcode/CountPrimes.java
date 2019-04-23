package leetcode;

import java.util.Arrays;

/*
 * Count the number of prime numbers less than a non-negative number, n.
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 * 
 * */
public class CountPrimes {
	
	// Sieve of Eratosthenes 
    public int countPrimes(int n) {
        if(n==2) return 0;
        if(n < 2) return 0;
        
        int[] numbers = new int[n];
        Arrays.fill(numbers, 1);
        numbers[0] = 0;
        numbers[1] = 0; 
        int count = 0;
        
        for(int i=2; i<numbers.length; i++){
            if(numbers[i] == 1){
                count ++;
                for(int j=2; i*j < n; j++){
                    numbers[i*j] = 0;
                }
            }            
        }
        return count;        
        
    }

}
