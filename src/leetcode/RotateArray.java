package leetcode;
/*
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * 
 * */
public class RotateArray {
	// Store last element in temp --> shift remaining elements by 1 --> store temp at 0th index
    public void rotateBruteForce(int[] nums, int k) {
    	if(nums.length == 0) return;
        while(k != 0){
            int temp = nums[nums.length - 1];
            for(int i=nums.length-2; i>=0; i--){
                nums[i+1] = nums[i];
            }
            nums[0] = temp;
            k--;
        }        
    }
    
    // Using extra array 
    public void rotate(int[] nums, int k) {
        if(nums.length == 0) return;
        int rotateSteps = k % nums.length;
        int[] rotatedArray = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i + rotateSteps >= nums.length){
                rotatedArray[ (i+rotateSteps) - nums.length] = nums[i];
            }else{
                rotatedArray[i + rotateSteps] = nums[i];
            }
        }
        
        for(int m=0; m<rotatedArray.length; m++){
            nums[m] = rotatedArray[m];
        }
        
    }

}
