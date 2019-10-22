package basics;

import java.util.Scanner;

public class DecimalToAnybase {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int db = scn.nextInt();

		int multiplier = 1;
		int ans = 0;

		while (n != 0) {

			int rem = n % db;

			ans = ans + rem * multiplier;

			multiplier = multiplier * 10;
			n = n / db;
		}

		System.out.println(ans);

	}

}
