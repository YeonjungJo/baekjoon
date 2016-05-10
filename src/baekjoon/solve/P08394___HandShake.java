package baekjoon.solve;
import java.util.Scanner;

public class P08394___HandShake {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		if (n <= 1) {
			System.out.println(1);
			return;
		}

		int[] d = new int[n + 1];
		d[0] = 1;
		d[1] = 1;
		for (int i = 2; i <= n; i++) {
			d[i] = (d[i - 1] + d[i - 2]) % 10;
		}
		
		System.out.println(d[n]);
	}

	public static void main(String[] args) {
		new P08394___HandShake().solve();
	}
}
