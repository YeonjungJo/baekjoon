import java.util.Scanner;

public class Main {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		if (n <= 2) {
			System.out.println(n);
			return;
		}

		int[] d = new int[n + 1];

		d[1] = 1;
		d[2] = 2;

		for (int i = 3; i <= n; i++) {
			d[i] = d[i - 1] + d[i - 2];
			if (d[i] >= 10007) d[i] %= 10007;
		}

		System.out.println(d[n]);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}
