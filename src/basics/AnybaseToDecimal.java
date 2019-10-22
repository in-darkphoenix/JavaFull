package basics;

import java.util.Scanner;

public class AnybaseToDecimal {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int sb = scn.nextInt();

		int multiplier = 1;
		int ans = 0;

		while (n != 0) {

			int rem = n % 10;

			ans = ans + rem * multiplier;

			multiplier = multiplier * sb;
			n = n / 10;
		}

		System.out.println(ans);

	}

}
