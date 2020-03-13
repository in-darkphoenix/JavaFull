package Hackerrank;

import java.util.Scanner;

public class AppleOrange {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int s = scn.nextInt();
		int t = scn.nextInt();
		int a = scn.nextInt();
		int b = scn.nextInt();
		int app = scn.nextInt();
		int or = scn.nextInt();
		int[] apple = new int[app];
		int[] orange = new int[or];
		for (int i = 0; i < apple.length; i++) {
			apple[i] = scn.nextInt();
		}
		for (int j = 0; j < orange.length; j++) {
			orange[j] = scn.nextInt();
		}
		appOr(s, t, a, b, apple, orange);

	}

	public static void appOr(int s, int t, int a, int b, int[] apple, int[] orange) {
		int ca = 0, co = 0;
		for (int i = 0; i < apple.length; i++) {
			if ((a + apple[i]) >= s && (a + apple[i] <= t))
				ca++;
		}
		for (int j = 0; j < orange.length; j++) {
			if ((b + orange[j]) >= s && (b + orange[j] <= t))
				co++;
		}
		System.out.println(ca);
		System.out.println(co);

	}

}
