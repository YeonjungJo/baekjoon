package baekjoon.solve;
import java.util.Scanner;

public class P05596___TestResult {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[] p = new int[2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				p[i] += sc.nextInt();
			}
		}

		System.out.println(p[0] > p[1] ? p[0] : p[1]);
	}

	public static void main(String[] args) {
		new P05596___TestResult().solve();
	}
}
