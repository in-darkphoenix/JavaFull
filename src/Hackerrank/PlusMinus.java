package Hackerrank;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		plpm(arr);
	}

	public static void plpm(int[] arr) {
		float np = 0, nn = 0, nz = 0, d = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				np++;
			} else if (arr[i] < 0) {
				nn++;
			} else {
				nz++;
			}
		}
		System.out.println(np/d);
		System.out.println(nn/d);
		System.out.println(nz/d);
	}

}
