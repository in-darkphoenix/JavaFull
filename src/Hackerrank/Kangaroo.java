package Hackerrank;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x1 = scn.nextInt();
		int v1 = scn.nextInt();
		int x2 = scn.nextInt();
		int v2 = scn.nextInt();
		System.out.println(kJump(x1, v1, x2, v2));

	}

	public static String kJump(int x1, int v1, int x2, int v2) {
		if (v1 > v2) {
			int r = ((x2 - x1) % (v1 - v2));
			if (r == 0)
				return "YES";
		}
		return "NO";
	}

}
