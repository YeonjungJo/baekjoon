package baekjoon.solve;
import java.util.Scanner;

public class P01568___Bird {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int i = 1;
		for (int t = 1;; t++, i++) {
			if (n < i) i = 1;
			n -= i;
			if (n == 0) {
				System.out.println(t);
				return;
			}
		}
	}

	public static void main(String[] args) {
		new P01568___Bird().solve();
	}
}
