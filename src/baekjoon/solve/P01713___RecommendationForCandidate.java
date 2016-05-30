package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P01713___RecommendationForCandidate {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		boolean[] isRegist = new boolean[101];
		Photo[] p = new Photo[n];
		for (int i = 0; i < n; i++) {
			p[i] = new Photo(0, 0);
		}

		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int k = sc.nextInt();
			if (isRegist[k]) getPoint(p, k);
			else regist(p, n, isRegist, k, i);
		}

		for (int i = 1; i < 101; i++) {
			if (isRegist[i]) System.out.printf("%d ", i);
		}
	}

	private void regist(Photo[] p, int n, boolean[] isRegist, int k, int t) {
		Arrays.sort(p);
		isRegist[p[0].getId()] = false;
		p[0] = new Photo(k, t);
		p[0].getPoint();
		isRegist[k] = true;
	}

	private void getPoint(Photo[] p, int k) {
		for (int i = 0; i < p.length; i++) {
			if (p[i].id == k) {
				p[i].getPoint();
				return;
			}
		}
	}

	private class Photo implements Comparable<Photo> {
		private int id;
		private int registTime;
		private int score = 0;

		public Photo(int id, int time) {
			this.id = id;
			this.registTime = time;
		}

		public int getId() {
			return id;
		}

		public int getScore() {
			return score;
		}

		public void getPoint() {
			score++;
		}

		public int getRegistTime() {
			return registTime;
		}

		@Override
		public int compareTo(Photo o) {
			if (score > o.getScore()) return 1;
			if (score < o.getScore()) return -1;
			if (registTime < o.getRegistTime()) return -1;
			if (registTime > o.getRegistTime()) return 1;
			return 0;
		}
	}

	public static void main(String[] args) {
		new P01713___RecommendationForCandidate().solve();
	}
}
