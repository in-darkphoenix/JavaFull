package Hackerrank;

import java.util.Scanner;

public class TimeConvert {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String t12 = scn.next();
		System.out.println(time24(t12));

	}

	public static String time24(String t) {
		String ans = null;
		char ch = t.charAt(8);
		String hrs = t.substring(0, 2);
		int hri = Integer.parseInt(hrs);
		if (ch == 'P' || ch == 'p') {

			if (hri != 12)
				hri += 12;
			ans = Integer.toString(hri);
			for (int i = 2; i < 8; i++) {
				ans = ans + t.charAt(i);
			}
		} else {
			if (hri == 12)
				ans = "00";
			else if(hri==11){
				ans = "11";
			}
			else {
				ans="0"+Integer.toString(hri);
			}
			for (int i = 2; i < 8; i++) {
				ans = ans + t.charAt(i);
			}
		}
		return ans;
	}

}
