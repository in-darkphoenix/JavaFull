package basics;

import java.util.Scanner;

public class LowerUpper {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		char ch = scn.next().charAt(0);
		//System.out.println(ch);

		if (ch >= 'a' && ch <= 'z') {
			System.out.println("Lower");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Upper");
		} else {
			System.out.println("Invalid");
		}

	}

}
