package leetcode;
/*
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * Given nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the returned length.
 * 
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 * It doesn't matter what values are set beyond the returned length.
 * 
 *  Given nums = [1,1,1],
 * Your function should return length = 1
 * 
 *  Given nums = [1,2],
 * Your function should return length = 2
 * 
 * */
public class RemoveDuplicates {
	
	public int removeDuplicates(int[] nums) {
		int i,j;
		loop1:for(i=0, j=i+1; i<=j && j <nums.length; i++) {
			while(nums[j] == nums[i]) {
				if(j != nums.length - 1) { // for case [1,1,1]
					j++;
				}else {
					if(nums[j] == nums[i]) { // for case [1,2]
						break loop1;
					}else {
						nums[i+1] = nums[j];
						break loop1;
					}
				}
				
			}
			nums[i+1] = nums[j];		
		}
		
		return i+1;
	}

}
