package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P02456___IamClassPresident {

	private static final Scanner sc = new Scanner(System.in);

	private static final int NUMBER_OF_CANDIDATE = 3;

	private void solve() {
		int n = sc.nextInt();

		Candidate[] candidate = new Candidate[NUMBER_OF_CANDIDATE];
		for (int i = 0; i < NUMBER_OF_CANDIDATE; i++) {
			candidate[i] = new Candidate(i + 1);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < NUMBER_OF_CANDIDATE; j++) {
				candidate[j].update(sc.nextInt());
			}
		}

		Arrays.sort(candidate);
		if(candidate[0].compareTo(candidate[1]) == 0) System.out.printf("%d %d\n", 0, candidate[0].getTotalScore());
		else System.out.printf("%d %d\n", candidate[0].getId(), candidate[0].getTotalScore());
	}

	private class Candidate implements Comparable<Candidate> {
		private final int id;

		int[] point;

		public Candidate(int id) {
			this.id = id;
			point = new int[4];
		}

		public void update(int p) {
			point[p]++;
		}

		public int getTotalScore() {
			return point[1] + point[2] * 2 + point[3] * 3;
		}

		public int getId() {
			return id;
		}

		public int getPoint(int p) {
			return point[p];
		}

		@Override
		public int compareTo(Candidate o) {
			if (o.getTotalScore() < this.getTotalScore()) return -1;
			if (o.getTotalScore() > this.getTotalScore()) return 1;
			if (o.getPoint(3) < this.getPoint(3)) return -1;
			if (o.getPoint(3) > this.getPoint(3)) return 1;
			if (o.getPoint(2) < this.getPoint(2)) return -1;
			if (o.getPoint(2) > this.getPoint(2)) return 1;
			return 0;
		}
	}

	public static void main(String[] args) {
		new P02456___IamClassPresident().solve();
	}
}
