package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P02493___Top {

	private static final int MAX_HEIGHT = 100000001;

	private void solve() {
		int n = sc.nextInt();

		LinkedList<Building> stack = new LinkedList<>();
		stack.add(new Building(0, MAX_HEIGHT));

		for (int i = 1; i <= n; i++) {
			int h = sc.nextInt();
			while (true) {
				Building tmp = stack.getLast();
				if (tmp.getHeight() < h) stack.removeLast();
				else {
					System.out.print(tmp.getId() + " ");
					stack.addLast(new Building(i, h));
					break;
				}
			}
		}
	}

	private class Building {
		private final int id;
		private int height;

		public Building(int id, int height) {
			this.id = id;
			this.height = height;
		}

		public int getHeight() {
			return height;
		}

		public int getId() {
			return id;
		}
	}

	public static void main(String[] args) {
		sc.init();
		new P02493___Top().solve();
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
