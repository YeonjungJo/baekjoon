package baekjoon.solve;
import java.util.Scanner;

public class P01932___NumberedTriangle {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int size = (n * n + n) / 2;
		int[] triangle = new int[size];
		for (int i = 0; i < size; i++) {
			triangle[i] = sc.nextInt();
		}

		int[] d = new int[size];
		search(triangle, d, size, 0, 1);
		System.out.println(d[0]);
	}

	private int search(int[] triangle, int[] d, int size, int i, int h) {
		if (i + h >= size) return triangle[i];
		if (d[i] != 0) return d[i];
		return d[i] = triangle[i] + max(search(triangle, d, size, i + h, h + 1), search(triangle, d, size, i + h + 1, h + 1));
	}

	private int max(int i, int j) {
		return i > j ? i : j;
	}

	public static void main(String[] args) {
		new P01932___NumberedTriangle().solve();
	}
}
