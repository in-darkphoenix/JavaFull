package Hackerrank;

import java.util.*;

public class GradingStudents {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int[] ans = grade(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
		// List<Integer> ansn = new ArrayList<Integer>();
		// System.out.println(ansn);

	}

	public static int[] grade(int[] arr) {
		int[] grd = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 37) {
				for (int c = 40; c <= 100; c = c + 5) {
					if ((c - arr[i]) < 3 && (c - arr[i] > 0)) {
						grd[i] = c;
						break;
					} else
						grd[i] = arr[i];
				}
			} else
				grd[i] = arr[i];
		}
		return grd;
	}

}
