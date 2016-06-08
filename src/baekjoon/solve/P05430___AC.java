package baekjoon.solve;
import java.util.Scanner;

public class P05430___AC {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			char[] p = sc.next().toCharArray();
			int n = sc.nextInt();
			String s = sc.next();
			String[] a = s.substring(1, s.length() - 1).split(",");

			work(n, a, p);
		}
	}

	private void work(int n, String[] a, char[] p) {
		boolean reverse = false;

		int start = 0;
		int end = n - 1;
		for (int i = 0; i < p.length; i++) {
			if (p[i] == 'D') {
				if (!reverse) start++;
				else end--;
			} else {
				reverse = !reverse;
			}
		}

		print(a, start, end, reverse);
	}

	private void print(String[] a, int start, int end, boolean reverse) {
		if (start > end + 1) {
			System.out.println("error");
			return;
		}

		StringBuilder stringBuilder = new StringBuilder("[");
		if (!reverse) {
			for (int i = start; i <= end; i++) {
				stringBuilder.append(a[i]);
				if (i != end) stringBuilder.append(",");
			}
		} else {
			for (int i = end; i >= start; i--) {
				stringBuilder.append(a[i]);
				if (i != start) stringBuilder.append(",");
			}
		}
		stringBuilder.append("]");
		System.out.println(stringBuilder.toString());
	}

	public static void main(String[] args) {
		new P05430___AC().solve();
	}
}
