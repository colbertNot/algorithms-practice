package leetcode.problems;

/*
 * Given a sorted array, remove the duplicates in-place 
 * such that each element appear only once and return the new length. 
 * Do not allocate extra space for another array, 
 * you must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * Example:
 * Given nums = [1,1,2], 
 * Your function should return length = 2, 
 * with the first two elements of nums being 1 and 2 respectively.
 * 
 * It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesSortedArray {

	public static int removeDuplicates(int[] nums) {
		int length = nums.length;

		if (length == 0 || length == 1)
			return length;

		int j = 0;
		for (int i = 0; i < length - 1; i++) {
			if (nums[i] != nums[i + 1])
				nums[j++] = nums[i];
		}

		nums[j++] = nums[length - 1];

		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1, 1, 1, 2, 2, 3, 4};
		System.out.println(removeDuplicates(nums));
	}

}
