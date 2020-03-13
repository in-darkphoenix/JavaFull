package Hackerrank;

import java.util.Scanner;

public class StairPattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		patternStair(n);
	}

	public static void patternStair(int n) {
		for (int row = 1; row <= n; row++) {
			for (int sp = n - row; sp >= 1; sp--) {
				System.out.print(" ");
			}
			for (int ht = 1; ht <= row; ht++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
