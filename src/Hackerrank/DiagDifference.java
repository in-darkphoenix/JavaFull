package Hackerrank;

import java.util.Scanner;

public class DiagDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int result=dgDiff(arr);
		System.out.println(result);

	}

	public static int dgDiff(int[][] arr) {
		int lds = 0, rds = 0, d = 0;
		int ldc = 0, rdc = arr[0].length-1;
		for (int i = 0; i < arr[0].length; i++) {
				lds += arr[ldc][ldc];
				rds += arr[ldc][rdc];
			ldc++;
			rdc--;
		}
		d = lds - rds;
		return (d >= 0) ? d : (d * -1);
	}

}
