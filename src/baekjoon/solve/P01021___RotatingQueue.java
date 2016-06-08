package baekjoon.solve;
import java.util.LinkedList;
import java.util.Scanner;

public class P01021___RotatingQueue {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}

		LinkedList<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}

		int sum = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < queue.size(); j++) {
				int tmp = queue.removeFirst();
				if (tmp == a[i]) {
					sum += min(j, queue.size() - j + 1);
					break;
				} else queue.add(tmp);
			}
		}
		System.out.println(sum);
	}

	private int min(int i, int j) {
		return i < j ? i : j;
	}

	public static void main(String[] args) {
		new P01021___RotatingQueue().solve();
	}
}
