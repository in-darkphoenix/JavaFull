package Hackerrank;

import java.util.Scanner;

public class AngryProfessor {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scn.nextInt();
			int k = scn.nextInt();
			int[] a = new int[n];
			for (int j = 0; j < a.length; j++) {
				a[j] = scn.nextInt();
			}
			int c = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] <= 0)
					c++;
			}
			if (c >= k)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}

}
