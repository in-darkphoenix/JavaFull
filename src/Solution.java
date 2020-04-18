import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static int singleNumber(int[] nums) {
		Arrays.parallelSort(nums);
		int num = 0;
		for (int i = 0; i  < nums.length;) {
			num += nums[i];
			if (nums[i] == nums[i + 1]) {
				num -= nums[i];
				i = i + 2;
			} else {
				i++;
			}
			if (i == nums.length - 1)
				num = nums[nums.length-1];
		}

		return num;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(singleNumber(arr));

	}

}