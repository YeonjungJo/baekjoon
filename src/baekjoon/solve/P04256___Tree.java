package baekjoon.solve;
import java.util.Scanner;

public class P04256___Tree {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();

			int[] pre = new int[n];
			int[] in = new int[n];

			for (int i = 0; i < n; i++) {
				pre[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				in[i] = sc.nextInt();
			}

			int[] post = new int[n];
			postorder(n, pre, in, post, 0, n - 1, 0, n - 1, n - 1);

			for (int i = 0; i < n; i++) {
				System.out.print(post[i] + " ");
			}
			System.out.println();
		}
	}

	private int postorder(int n, int[] pre, int[] in, int[] post, int ps, int pe, int is, int ie, int i) {
//		System.out.printf("ps : %d, pe : %d\nis : %d, ie : %d, i : %d\n", ps, pe, is, ie, i);

		if (ps > pe || is > ie) return i + 1;
		if (ps < 0 || pe < 0 || ps >= n || pe >= n) return i + 1;
		if (is < 0 || ie < 0 || is >= n || ie >= n) return i + 1;
		if (i < 0 || i >= n) return i + 1;

		post[i] = pre[ps];

//		System.out.println("-------------------------------");
//		for (int t = 0; t < n; t++) {
//			System.out.print(post[t] + " ");
//		}
//		System.out.println();
//		System.out.println("-------------------------------");

		int k = search(in, pre[ps], is, ie);
		int t = ps - is + k;

		i = postorder(n, pre, in, post, t + 1, pe, k + 1, ie, --i); // right_node
		i = postorder(n, pre, in, post, ps + 1, t, is, k - 1, --i); // left_node

		return i;
	}

	private int search(int[] in, int i, int start, int end) {
		for (int k = start; k <= end; k++) {
			if (in[k] == i) return k;
		}
		return -1;
	}

	public static void main(String[] args) {
		new P04256___Tree().solve();
	}
}
