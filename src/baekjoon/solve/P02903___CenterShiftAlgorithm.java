package baekjoon.solve;
import java.util.Scanner;

public class P02903___CenterShiftAlgorithm {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int a = 2;
		for (int i = 0; i < n; i++) {
			a = 2 * a - 1;
		}
		System.out.println(a * a);
	}

	public static void main(String[] args) {
		new P02903___CenterShiftAlgorithm().solve();
	}
}
