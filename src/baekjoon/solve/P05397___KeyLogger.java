package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P05397___KeyLogger {

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			findPassword(sc.next());
		}
	}

	private void findPassword(String input) {
		char[] fstack = new char[1000001];
		char[] nstack = new char[1000001];
		int fcursor = 0;
		int ncursor = 1000000;

		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case '<':
				if (fcursor != 0) {
					fcursor--;
					nstack[ncursor] = fstack[fcursor];
					ncursor--;
				}
				break;
			case '>':
				if (ncursor != nstack.length - 1) {
					ncursor++;
					fstack[fcursor] = nstack[ncursor];
					fcursor++;
				}
				break;
			case '-':
				if (fcursor != 0) fcursor--;
				break;
			default:
				fstack[fcursor] = input.charAt(i);
				fcursor++;
				break;
			}
		}

		print(fstack, fcursor, nstack, ncursor);
	}

	private void print(char[] fstack, int fcursor, char[] nstack, int ncursor) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < fcursor; i++) {
			strBuilder.append(fstack[i]);
		}
		for (int i = ncursor + 1; i <= 1000000; i++) {
			strBuilder.append(nstack[i]);
		}
		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		sc.init();
		new P05397___KeyLogger().solve();
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
