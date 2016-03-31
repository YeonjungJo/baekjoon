package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01406___Editor {

	enum Operator {
		L, D, B, P
	}

	static StringBuilder stack;

	private void solve() {
		stack = new StringBuilder(sc.next());

		int cursor = stack.length();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			cursor = operate(cursor, Operator.valueOf(sc.next()));
//			System.out.println(stack.toString() + " , " + cursor);
		}

		System.out.println(stack.toString());
	}

	private int operate(int cursor, Operator operator) {
		switch (operator) {
		case B:
			if (cursor != 0) {
				stack.replace(cursor - 1, cursor, "");
				return cursor - 1;
			}
			return cursor;
		case D:
			if (cursor < stack.length()) return cursor + 1;
			return cursor;
		case L:
			if (cursor > 0) return cursor - 1;
			return cursor;
		case P:
			stack.insert(cursor, sc.next());
			return cursor + 1;
		}
		return cursor;
	}

	public static void main(String[] args) {
		sc.init();
		new P01406___Editor().solve();
	}

	static class sc {
		private static BufferedReader br;
		private static StringTokenizer st;

		static void init() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer("");
		}

		static String next() {
			while (!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {}
			}

			return st.nextToken();
		}

		static int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
