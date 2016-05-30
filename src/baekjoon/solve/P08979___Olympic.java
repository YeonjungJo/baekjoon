package baekjoon.solve;
import java.util.Scanner;

public class P08979___Olympic {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();

		int idx = -1;
		Nation[] nation = new Nation[n];
		for (int i = 0; i < n; i++) {
			nation[i] = new Nation(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			if (nation[i].getId() == k) idx = i;
		}

		int rank = 1;
		for (int i = 0; i < n; i++) {
			if (nation[idx].compareTo(nation[i]) == 1) rank++;
		}
		System.out.println(rank);
	}

	private class Nation implements Comparable<Nation> {
		private int id;
		private int gold;
		private int silver;
		private int bronze;

		public Nation(int id, int gold, int silver, int bronze) {
			this.id = id;
			this.gold = gold;
			this.silver = silver;
			this.bronze = bronze;
		}

		public int getId() {
			return id;
		}

		public int getGold() {
			return gold;
		}

		public int getSilver() {
			return silver;
		}

		public int getBronze() {
			return bronze;
		}

		@Override
		public int compareTo(Nation o) {
			if (this.gold > o.getGold()) return -1;
			if (this.gold < o.getGold()) return +1;
			if (this.silver > o.getSilver()) return -1;
			if (this.silver < o.getSilver()) return +1;
			if (this.bronze > o.getBronze()) return -1;
			if (this.bronze < o.getBronze()) return +1;
			return 0;
		}
	}

	public static void main(String[] args) {
		new P08979___Olympic().solve();
	}
}
