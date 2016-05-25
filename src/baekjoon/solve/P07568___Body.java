package baekjoon.solve;
import java.util.Scanner;

public class P07568___Body {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		Body[] body = new Body[n];
		for (int i = 0; i < n; i++) {
			body[i] = new Body(sc.nextInt(), sc.nextInt());
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int tmp = body[i].compareTo(body[j]);
				if (tmp == 1) body[i].addRank();
				else if (tmp == -1) body[j].addRank();
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(body[i].getRank() + " ");
		}
	}

	private class Body implements Comparable<Body> {
		private int weight;
		private int height;

		private int rank;

		public Body(int w, int h) {
			this.weight = w;
			this.height = h;
			this.rank = 1;
		}

		public int getWeight() {
			return weight;
		}

		public int getHeight() {
			return height;
		}

		public void addRank() {
			rank++;
		}

		public int getRank() {
			return rank;
		}

		@Override
		public int compareTo(Body o) {
			if (this.getWeight() > o.getWeight() && this.getHeight() > o.getHeight()) return -1;
			if (this.getWeight() < o.getWeight() && this.getHeight() < o.getHeight()) return 1;
			return 0;
		}
	}

	public static void main(String[] args) {
		new P07568___Body().solve();
	}
}
