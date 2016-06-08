package baekjoon.solve;
import java.util.Scanner;

public class P01168___Josephus2 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		FenwickTree fenwickTree = new FenwickTree(n);
		for (int i = 1; i <= n; i++) {
			fenwickTree.update(i, 1);
		}

		int k = m;
		StringBuilder result = new StringBuilder("<");
		for (int i = n; i > 0; i--) {
			k = k % i == 0 ? i : k % i;

			int r = fenwickTree.find(k);

			result.append(r);
			if (i == 1) result.append(">");
			else result.append(", ");

			k += m - 1;

			fenwickTree.update(r, -1);
		}

		System.out.println(result.toString());
	}

	private class FenwickTree {
		int[] tree;
		int max;

		public FenwickTree(int n) {
			this.max = n;
			tree = new int[max + 1];
		}

		public void update(int idx, int val) {
			while (idx <= max) {
				tree[idx] += val;
				idx += (idx & -idx);
			}
		}

		public int find(int n) {
			int l = 1;
			int r = max;
			int result = 1;
			while (l <= r) {
				int k = (l + r) >> 1;
				if (read(k) >= n) {
					result = k;
					r = k - 1;
				} else l = k + 1;
			}
			return result;
		}

		private int read(int k) {
			int result = 0;
			while (k > 0) {
				result += tree[k];
				k -= (k & -k);
			}
			return result;
		}

		@Override
		public String toString() {
			StringBuilder strBuilder = new StringBuilder();
			for (int i = 0; i <= max; i++) {
				System.out.print(tree[i] + " ");
			}
			return strBuilder.toString();
		}
	}

	public static void main(String[] args) {
		new P01168___Josephus2().solve();
	}
}
