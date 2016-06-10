package baekjoon.solve;
import java.util.LinkedList;
import java.util.Scanner;

public class P01963___PrimeNumberPath {

	private static final Scanner sc = new Scanner(System.in);

	private static final int MAX = 10000;

	private void solve() {
		boolean[] p = new boolean[MAX];
		init(p);

		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int i = 0;
			LinkedList<Integer> q = new LinkedList<>();
			q.add(a);
			int[] d = new int[MAX];
			d[a] = i;

			search(p, q, d, b);
		}
	}

	private void search(boolean[] p, LinkedList<Integer> q, int[] d, int b) {
		while (!q.isEmpty()) {
			int tmp = q.removeFirst();
			if (tmp == b) {
				System.out.println(d[tmp]);
				return;
			}
			q.addAll(search(p, d, tmp, d[tmp] + 1));
		}
		System.out.println("impossible");
	}

	private LinkedList<Integer> search(boolean[] p, int[] d, int num, int cost) {
		LinkedList<Integer> result = new LinkedList<>();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				int tmp = alter(num, i, j);
				if (tmp >= 1000 && !p[tmp] && d[tmp] == 0) {
					d[tmp] = cost;
					result.add(tmp);
				}
			}
		}
		return result;
	}

	private int alter(int num, int i, int j) {
		return (int) (((num / (int) Math.pow(10, 4 - i)) * 10 + j) * Math.pow(10, 3 - i) + (num % (int) Math.pow(10, 3 - i)));
	}

	private void init(boolean[] p) {
		for (int i = 2; i < MAX; i++) {
			if (!p[i]) update(p, i);
		}
	}

	private void update(boolean[] p, int k) {
		for (int i = k; i < MAX; i += k)
			if (i != k) p[i] = true;
	}

	public static void main(String[] args) {
		new P01963___PrimeNumberPath().solve();
	}
}
