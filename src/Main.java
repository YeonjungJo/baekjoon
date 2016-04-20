import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private void solve() {
		int n = sc.nextInt();
		Ball[] balls = new Ball[n];
		for (int i = 0; i < n; i++) {
			balls[i] = new Ball(sc.nextInt(), sc.nextInt());
		}
		for (int i = 0; i < n; i++) {
			System.out.println(balls[i].getPoint(balls, i));
		}
	}

	private class Ball {
		int color;
		int size;
		int point;

		public Ball(int color, int size) {
			this.color = color;
			this.size = size;
			this.point = 0;
		}

		public int getPoint(Ball[] balls, int k) {
			for (int i = k + 1; i < balls.length; i++) {
				this.point += compare(balls[i]);
			}
			return point;
		}

		private int compare(Ball b) {
			if (color == b.color) return 0;
			if (b.size < this.size) return b.size;
			if (b.size > this.size) b.point += this.size;
			return 0;
		}
	}

	public static void main(String[] args) {
		sc.init();
		new Main().solve();
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
