package Hackerrank;

import java.util.Scanner;

public class BetweenSets {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int[] a = new int[m];
		int[] b = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scn.nextInt();
		}
		for (int j = 0; j < b.length; j++) {
			b[j] = scn.nextInt();
		}
		int result = bSetNumber(a, b);
		System.out.println(result);
	}

	public static int bSetNumber(int[] a, int[] b) {
		int c = 0;
		for (int i = a[a.length - 1]; i <= b[0]; i++) {
			int inda = 1, indb = 1;
			for (int j = 0; j < a.length; j++) {
				if (i % a[j] != 0) {
					inda = 0;
					break;
				}
			}
			for (int k = 0; k < b.length; k++) {
				if (b[k] % i != 0) {
					indb = 0;
					break;
				}
			}
			if (inda == 1 && indb == 1)
				c++;
		}
		return c;
	}

}
