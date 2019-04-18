package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayIntersection {
	
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> lookup = new HashMap<Integer, Integer>();
        ArrayList<Integer> repeated = new ArrayList<Integer>();
        if(nums2.length < nums1.length){
            int[] temp = nums2;
            nums2 = nums1;
            nums1 = temp;
        }
        
        for(int i=0; i<nums1.length; i++){
            if(lookup.containsKey(nums1[i])){
                lookup.put(nums1[i], lookup.get(nums1[i]) + 1);
            }else{
                lookup.put(nums1[i], 1);
            }
        }
        
        for(int j:nums2){
            if(lookup.containsKey(j)){
                repeated.add(j);
                if(lookup.get(j) == 1){
                    lookup.remove(j);
                }else{
                    lookup.put(j, lookup.get(j) - 1);
                }
            }
        }
        
        int[] answer = new int[repeated.size()];
        for(int k=0; k<answer.length; k++){
            answer[k] = repeated.get(k);
        }
        return answer;
                
    }
	
	public void printArray(int[] arr) {
		System.out.print("[");
		for(int k:arr) {
			System.out.print(k + ", ");
		}
		System.out.print("]");
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayIntersection a = new ArrayIntersection();
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] answer = a.intersect(nums1, nums2); // o/p -> [9, 4]
		a.printArray(answer);

	}

}
