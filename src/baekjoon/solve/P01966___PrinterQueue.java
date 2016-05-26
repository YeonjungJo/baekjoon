package baekjoon.solve;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class P01966___PrinterQueue {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			LinkedList<Integer> queue = new LinkedList<>();
			for (int i = 0; i < n; i++) {
				queue.add(sc.nextInt());
			}
			Integer[] order = queue.toArray(new Integer[n]);
			Arrays.sort(order);

			int printed = 0;
			while (m >= 0) {
				int tmp = queue.pop();
				if (isImportant(tmp, order, n, printed)) {
					printed++;
				} else {
					queue.add(tmp);
					if (m == 0) {
						m = n - printed;
					}
				}
				m--;
			}
			System.out.println(printed);
		}
	}

	private boolean isImportant(int tmp, Integer[] order, int n, int printed) {
		if (tmp == order[n - printed - 1]) return true;
		return false;
	}

	public static void main(String[] args) {
		new P01966___PrinterQueue().solve();
	}
}
