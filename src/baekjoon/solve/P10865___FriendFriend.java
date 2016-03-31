package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10865___FriendFriend {

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] friend = new int[n + 1];
		for (int i = 0; i < m; i++) {
			friend[sc.nextInt()]++;
			friend[sc.nextInt()]++;
		}
		for (int i = 1; i <= n; i++) {
			System.out.println(friend[i]);
		}
	}

	public static void main(String[] args) {
		sc.init();
		new P10865___FriendFriend().solve();
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
