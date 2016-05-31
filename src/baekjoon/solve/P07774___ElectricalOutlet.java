package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P07774___ElectricalOutlet {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[m];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);

		int available = 1;
		int tmp = 0;
		while (n > 0 && m > 0) {
			available--;
			n--;
			tmp += a[n];
			while (m > 0 && tmp > 0) {
				m--;
				available += b[m];
				tmp--;
			}
		}
		System.out.println(available);
	}

	public static void main(String[] args) {
		new P07774___ElectricalOutlet().solve();
	}
}
