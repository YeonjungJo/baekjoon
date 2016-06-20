package baekjoon.todo;
import java.util.Scanner;

public class T10504___Add {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int result = search(n, 1, n);
			if (result == -1) System.out.println("IMPOSSIBLE");
			else print(n, (int) solution(n, result), result);
		}
	}

	private int search(int n, int start, int end) {
		if (start > end) return -1;

		int k = (start + end) / 2;

		double d = solution(n, k);

		if (d == (int) d && k - d > 1 && d >= 0) {
			int tmp = search(n, k + 1, end);
			if (tmp == -1) return k;
			return tmp;
		}

		if (Double.isNaN(d)) return search(n, k + 1, end);
		return search(n, start, k - 1);
	}

	private double solution(int n, int k) {
		return (Math.sqrt(1 + 4 * Math.pow(k, 2) + 4 * k - 8 * n) - 1) / 2;
	}

	private void print(int n, int a, int b) {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(n);
		strBuilder.append(" = ");
		for (int i = a + 1; i < b; i++) {
			strBuilder.append(i);
			strBuilder.append(" + ");
		}
		strBuilder.append(b);
		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		new T10504___Add().solve();
	}
}
