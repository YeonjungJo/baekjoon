import java.util.Scanner;

public class T2004___Count0inCombination {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int min = n - m > m ? m : n - m;

		double combination = 1;

		for (int i = 1; i <= n; i++) {
			if (i <= min) combination /= i;
			if (i > n - min) combination *= i;
		}

		int count = 0;
		String s = String.valueOf((long) combination);
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '0') count++;
			else break;
		}
		System.out.println(count);
		sc.close();
	}

	public static void main(String[] args) {
		new T2004___Count0inCombination().solve();
	}
}
