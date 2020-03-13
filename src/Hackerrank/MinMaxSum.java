package Hackerrank;

import java.util.Scanner;

public class MinMaxSum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		sumN(arr);

	}

	public static void bubbleSort(int[] arr) {

		int n = arr.length;

		for (int count = 0; count <= n - 2; count++) {

			boolean flag = true;

			for (int j = 0; j <= n - count - 2; j++) {

				if (arr[j] > arr[j + 1]) {

					flag = false;

					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

			if (flag)
				break;

		}

	}

	public static void sumN(int[] arr) {
		bubbleSort(arr);
		long mns = 0L, mxs = 0L;
		for (int i = 0; i < arr.length; i++) {
			mns += arr[i];
			mxs += arr[i];
		}
		System.out.println((mns - arr[4]) + " " + (mxs - arr[0]));

	}

}
