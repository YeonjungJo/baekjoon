package baekjoon.solve;
import java.util.Scanner;

public class P03449___HammingDistance {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			String a = String.format("%100s", sc.next());
			String b = String.format("%100s", sc.next());

			int hammingDistance = 0;

			for (int i = 0; i < 100; i++) {
				if (a.charAt(i) != b.charAt(i)) hammingDistance++;
			}

			System.out.printf("Hamming distance is %d.\n", hammingDistance);
		}
	}

	public static void main(String[] args) {
		new P03449___HammingDistance().solve();
	}
}
