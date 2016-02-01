package baekjoon.solve;
import java.util.Scanner;

public class P2839____SugarDelivery {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		for (int i = 0; i <= n / 5; i++) {
			if ((n % 5 + i * 5) % 3 == 0) {
				System.out.println((n / 5 - i) + (n % 5 + i * 5) / 3);
				return;
			}
		}

		System.out.println(-1);
	}

	public static void main(String[] args) {
		new P2839____SugarDelivery().solve();
	}
}
