package baekjoon.todo;
import java.util.Scanner;

public class T03002___AnalogDial {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[n];
		String s = sc.next();
		for (int i = 0; i < n; i++) {
			a[i] = Character.getNumericValue(s.charAt(i));
		}

		int h = (int) Math.ceil(Math.log10(n) / Math.log10(2));
		int size = (int) (Math.pow(2, h + 1) + 1);
		int[] d = new int[size];

		init(d, a, 1, 0, n - 1);

		for (int i = 0; i < m; i++) {
			int left = sc.nextInt() - 1;
			int right = sc.nextInt() - 1;
			System.out.println(search(d, 1, 0, n - 1, left, right));
			update(d, 1, 0, n - 1, left, right);
		}
	}

	private int search(int[] d, int node, int start, int end, int left, int right) {
		if (left > end || right < start) return 0;
		if (start >= left && end <= right) return d[node];
		return d[node] = search(d, 2 * node, start, (start + end) / 2, left, right) + search(d, 2 * node + 1, (start + end) / 2 + 1, end, left, right);
	}

	private int update(int[] d, int node, int start, int end, int left, int right) {
		if (left > end || right < start) return 0;
		if (start != end) {
			update(d, node * 2, start, (start + end) / 2, left, right);
			update(d, node * 2 + 1, (start + end) / 2 + 1, end, left, right);
			return d[node] = d[node * 2] + d[node * 2 + 1];
		} else return d[node]++;
	}

	private int init(int[] d, int[] a, int node, int start, int end) {
		if (start == end) return d[node] = a[start];
		return d[node] = init(d, a, 2 * node, start, (start + end) / 2) + init(d, a, 2 * node + 1, (start + end) / 2 + 1, end);
	}

	public static void main(String[] args) {
		new T03002___AnalogDial().solve();
	}
}
