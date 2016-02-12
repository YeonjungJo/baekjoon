package baekjoon.solve;
import java.util.Scanner;

public class P3460____BinaryNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int k = sc.nextInt();
			for (int i = 0; k > 0; i++, k /= 2) {
				if (k % 2 == 1) System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		new P3460____BinaryNumber().solve();
	}
}
