package leetcode;

public class MissingNumber {
	
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n*(n+1))/2;
        for(int i=0; i<nums.length; i++){
            totalSum -= nums[i];
        }
        return totalSum;
    }
    
    public static void main(String[] args) {
    	MissingNumber n = new MissingNumber();
    	int[] nums1 = {0, 1, 3};  // o/p - 2
    	System.out.println(n.missingNumber(nums1));
    	
    	int[] nums2 = {9,6,4,2,3,5,7,0,1};  // o/p - 8
    	System.out.println(n.missingNumber(nums2));
    }

}
