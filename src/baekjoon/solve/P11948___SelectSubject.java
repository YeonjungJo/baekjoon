package baekjoon.solve;
import java.util.Scanner;

public class P11948___SelectSubject {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {

		int sum = 0;
		int min = 100;
		for (int i = 0; i < 4; i++) {
			int k = sc.nextInt();
			sum += k;
			if (min > k) min = k;
		}
		sum -= min;
		min = 100;
		for (int i = 0; i < 2; i++) {
			int k = sc.nextInt();
			sum += k;
			if (min > k) min = k;
		}
		sum -= min;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new P11948___SelectSubject().solve();
	}
}
