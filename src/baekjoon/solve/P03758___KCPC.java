package baekjoon.solve;
import java.util.Scanner;

public class P03758___KCPC {

	private static final Scanner sc = new Scanner(System.in);

	private static final int NOT_SUBMIT = -1;

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int tcnt = sc.nextInt();
			int pcnt = sc.nextInt();
			int myId = sc.nextInt() - 1;
			int m = sc.nextInt();

			Team[] team = new Team[tcnt];
			for (int i = 0; i < m; i++) {
				int tid = sc.nextInt() - 1;
				int pid = sc.nextInt() - 1;
				int point = sc.nextInt();
				if (team[tid] == null) team[tid] = new Team(pcnt);
				team[tid].solve(i, pid, point);
			}

			int rank = 1;
			for (int i = 0; i < tcnt; i++) {
				if (i != myId && team[myId].compareTo(team[i]) == 1) rank++;
			}

			System.out.println(rank);
		}
	}

	private class Team implements Comparable<Team> {
		private int[] problem;
		private int point;
		private int submit;
		private int lastSubmit;

		public Team(int n) {
			this.problem = new int[n];
			this.point = 0;
			this.submit = 0;
			this.lastSubmit = NOT_SUBMIT;
		}

		public void solve(int time, int pid, int point) {
			lastSubmit = time;
			submit++;
			if (problem[pid] < point) {
				this.point += point - problem[pid];
				problem[pid] = point;
			}
		}

		@Override
		public int compareTo(Team o) {
			if (point < o.getPoint()) return 1;
			if (point > o.getPoint()) return -1;
			if (submit > o.getSubmit()) return 1;
			if (submit < o.getSubmit()) return -1;
			if (lastSubmit > o.getLastSubmit()) return 1;
			if (lastSubmit > o.getLastSubmit()) return -1;
			return 0;
		}

		public int getPoint() {
			return point;
		}

		public int getSubmit() {
			return submit;
		}

		public int getLastSubmit() {
			return lastSubmit;
		}
	}

	public static void main(String[] args) {
		new P03758___KCPC().solve();
	}
}
