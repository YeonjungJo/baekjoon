package baekjoon.solve;
import java.util.Scanner;

public class P05691___AverageMedianValue {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0) return;

			int min = a > b ? b : a;
			int max = a > b ? a : b;
			
			System.out.println(2 * min - max);
		}
	}

	public static void main(String[] args) {
		new P05691___AverageMedianValue().solve();
	}
}
