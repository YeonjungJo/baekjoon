import java.util.Scanner;

public class Main {

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
			postorder(pre, in, post, 0, n - 1);
		}
	}

	private void postorder(int[] pre, int[] in, int[] post, int start, int end) {
		post[end] = pre[start];
		search(in, pre[start]);
	}

	private void search(int[] in, int i) {
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}
