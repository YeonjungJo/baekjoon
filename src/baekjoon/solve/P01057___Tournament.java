package baekjoon.solve;
import java.util.Scanner;

public class P01057___Tournament {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		sc.nextInt();
		int k = sc.nextInt() - 1;
		int l = sc.nextInt() - 1;

		int i = 1;
		for (; k / 2 != l / 2; i++) {
			k /= 2;
			l /= 2;
		}

		System.out.println(i);
	}

	public static void main(String[] args) {
		new P01057___Tournament().solve();
	}
}
