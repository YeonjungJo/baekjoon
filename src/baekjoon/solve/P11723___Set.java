package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11723___Set {

	public enum command {
		add, remove, check, toggle, all, empty
	}

	private void solve() {
		int t = sc.nextInt();

		boolean[] set = new boolean[21];
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < t; i++) {
			switch (command.valueOf(sc.next())) {
			case add:
				set[sc.nextInt()] = true;
				break;
			case remove:
				set[sc.nextInt()] = false;
				break;
			case check:
				strBuilder.append(set[sc.nextInt()] ? 1 : 0).append("\n");
				break;
			case toggle:
				int x = sc.nextInt();
				set[x] = !set[x];
				break;
			case all:
				Arrays.fill(set, true);
				break;
			case empty:
				set = new boolean[21];
				break;
			}
		}

		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		sc.init();
		new P11723___Set().solve();
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
