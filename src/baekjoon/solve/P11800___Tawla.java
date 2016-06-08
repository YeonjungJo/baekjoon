package baekjoon.solve;
import java.util.Scanner;

public class P11800___Tawla {

	private static final Scanner sc = new Scanner(System.in);

	private static final String[] NAME = { "Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh" };
	private static final String[] NAME_EQUAL = { "Habb Yakk", "Dobara", "Dousa", "Dorgy", "Dabash", "Dosh" };

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("Case %d: %s\n", t, get(a > b ? a : b, a > b ? b : a));
		}
	}

	private String get(int a, int b) {
		if (a == b) return NAME_EQUAL[a - 1];
		if (a == 6 && b == 5) return "Sheesh Beesh";
		return NAME[a - 1] + " " + NAME[b - 1];
	}

	public static void main(String[] args) {
		new P11800___Tawla().solve();
	}
}
