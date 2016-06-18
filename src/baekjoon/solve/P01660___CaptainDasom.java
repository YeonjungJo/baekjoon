package baekjoon.solve;
import java.util.LinkedList;
import java.util.Scanner;

public class P01660___CaptainDasom {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		LinkedList<Integer> list = new LinkedList<>();
		int k = 1;
		while (true) {
			int tmp = k + (k * (k - 1) * (k + 4)) / 6;
			list.add(tmp);
			if (tmp >= n) break;
			k++;
		}

		int[] d = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			d[i] = i;
			for (int j = 1; j < list.size(); j++) {
				int tmp = list.get(j);
				if (tmp > n || tmp > i) break;
				if (d[i - tmp] + 1 < d[i]) d[i] = d[i - tmp] + 1;
			}
		}

		System.out.println(d[n]);
	}

	public static void main(String[] args) {
		new P01660___CaptainDasom().solve();
	}
}
