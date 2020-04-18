package Hackerrank;

import java.util.Scanner;

public class BreakingRecord {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int[] ans = breakRecord(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	private static int[] breakRecord(int[] arr) {
		int[] ans = new int[2];
		int mxr = 0, mnr = 0, mx = arr[0], mn = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > mx) {
				mxr++;
				mx = arr[i];
			} else if (arr[i] < mn) {
				mnr++;
				mn = arr[i];
			}
		}
		ans[0] = mxr;
		ans[1] = mnr;
		return ans;
	}

}
