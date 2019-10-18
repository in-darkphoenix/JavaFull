package basics;

public class Prime3 {
	public static void main(String[] args) {

		int n = 5;

		int div = 2;

		while (div <= n - 1) {

			if (n % div == 0) {
				break;
			}

			div = div + 1;
		}

		if (div == n) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}

	}

}
