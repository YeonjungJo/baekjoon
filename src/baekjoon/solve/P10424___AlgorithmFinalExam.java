package baekjoon.solve;
import java.util.Scanner;

public class P10424___AlgorithmFinalExam {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] f = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			f[i] = sc.nextInt();
		}
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[f[i]] = f[i] - i;
		}
		for (int i = 1; i <= n; i++) {
			System.out.println(result[i]);
		}
	}

	public static void main(String[] args) {
		new P10424___AlgorithmFinalExam().solve();
	}
}
