package baekjoon.solve;
import java.util.Scanner;

public class P02721___SumOfTriangularNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int result = 0;
			for (int i = 1; i <= n; i++) {
				result += (i * ((i + 2) * (i + 1))) / 2;
			}

			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		new P02721___SumOfTriangularNumber().solve();
	}
}
