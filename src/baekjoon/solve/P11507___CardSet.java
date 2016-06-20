package baekjoon.solve;
import java.util.Scanner;

public class P11507___CardSet {

	private static final Scanner sc = new Scanner(System.in);

	private enum Shape {
		P, K, H, T;
	}

	private void solve() {
		String s = sc.next();

		boolean[] p = new boolean[14];
		boolean[] k = new boolean[14];
		boolean[] h = new boolean[14];
		boolean[] t = new boolean[14];

		for (int i = 0; i < s.length(); i += 3) {
			Shape shape = Shape.valueOf(s.substring(i, i + 1));
			int number = Integer.parseInt(s.substring(i + 1, i + 3));

			if (!operate(p, k, h, t, shape, number)) {
				System.out.println("GRESKA");
				return;
			}
		}

		int countp = 0;
		for (int i = 1; i < 14; i++) {
			if (!p[i]) countp++;
		}
		int countk = 0;
		for (int i = 1; i < 14; i++) {
			if (!k[i]) countk++;
		}
		int counth = 0;
		for (int i = 1; i < 14; i++) {
			if (!h[i]) counth++;
		}
		int countt = 0;
		for (int i = 1; i < 14; i++) {
			if (!t[i]) countt++;
		}

		System.out.printf("%d %d %d %d\n", countp, countk, counth, countt);
	}

	private boolean operate(boolean[] p, boolean[] k, boolean[] h, boolean[] t, Shape shape, int number) {
		switch (shape) {
		case H:
			if (h[number]) return false;
			h[number] = true;
			return true;
		case K:
			if (k[number]) return false;
			k[number] = true;
			return true;
		case P:
			if (p[number]) return false;
			p[number] = true;
			return true;
		case T:
			if (t[number]) return false;
			t[number] = true;
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		new P11507___CardSet().solve();
	}
}
