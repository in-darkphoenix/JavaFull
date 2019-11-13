package basics;

import java.util.Scanner;

public class Inverse {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int ans = 0;

		int count = 1;

		while (n != 0) {

			int rem = n % 10;

			ans = ans + count * (int) Math.pow(10, rem - 1);

			n = n / 10;
			count = count + 1;

		}

		System.out.println(ans);
	}

}
