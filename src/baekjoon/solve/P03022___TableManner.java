package baekjoon.solve;
import java.util.Scanner;

public class P03022___TableManner {

	private static final Scanner sc = new Scanner(System.in);

	private static final int NOT_AVAILABLE = -1;

	private void solve() {
		int n = sc.nextInt();

		String[] name = new String[n];
		int[] cookie = new int[n];

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int k = findKid(name, n, sc.next());
			if (cookie[k] > i - cookie[k]) cnt++;
			cookie[k]++;
		}
		System.out.println(cnt);
	}

	private int findKid(String[] name, int n, String tmp) {
		for (int i = 0; i < n; i++) {
			if (name[i] == null) {
				name[i] = tmp;
				return i;
			}
			if (name[i].equals(tmp)) return i;
		}
		return NOT_AVAILABLE;
	}

	public static void main(String[] args) {
		new P03022___TableManner().solve();
	}
}
