package baekjoon.solve;
import java.util.Scanner;

public class P11944___NN {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		StringBuilder str = new StringBuilder();
		for (int i = 0; i < n; i++) {
			str.append(n);
			if (str.length() >= m) {
				System.out.println(str.toString().substring(0, m));
				return;
			}
		}
		System.out.println(str.toString());
	}

	public static void main(String[] args) {
		new P11944___NN().solve();
	}
}
