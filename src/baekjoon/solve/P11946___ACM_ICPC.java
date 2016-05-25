package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11946___ACM_ICPC {

	private static final String ACCEPTED = "AC";

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();

		Team[] contestant = new Team[n];
		for (int i = 0; i < n; i++) {
			contestant[i] = new Team(i + 1, m);
		}

		for (int i = 0; i < q; i++) {
			int time = sc.nextInt();
			int team = sc.nextInt() - 1;
			int problem = sc.nextInt() - 1;
			String result = sc.next();

			if (result.equals(ACCEPTED)) contestant[team].accept(problem, time);
			else contestant[team].fail(problem);
		}

		Arrays.sort(contestant);
		for (int i = 0; i < n; i++) {
			System.out.println(contestant[i].toString());
		}
	}

	public class Team implements Comparable<Team> {
		private int id;
		private int pass_count;
		private int total_time;
		private int[] wrong_answer;
		private boolean[] pass;

		public Team(int id, int total_problem) {
			this.id = id;
			this.pass_count = 0;
			this.total_time = 0;
			this.wrong_answer = new int[total_problem];
			this.pass = new boolean[total_problem];
		}

		public void accept(int problem_id, int time) {
			if (pass[problem_id]) return;
			total_time += time + wrong_answer[problem_id] * 20;
			pass[problem_id] = true;
			pass_count++;
		}

		public void fail(int problem_id) {
			if (pass[problem_id]) return;
			wrong_answer[problem_id]++;
		}

		@Override
		public String toString() {
			return String.format("%d %d %d", this.id, this.pass_count, this.total_time);
		}

		@Override
		public int compareTo(Team o) {
			if (o.pass_count < this.pass_count) return -1;
			if (o.pass_count > this.pass_count) return 1;
			if (o.total_time > this.total_time) return -1;
			if (o.total_time < this.total_time) return 1;
			if (o.id > this.id) return -1;
			if (o.id < this.id) return 1;
			return 0;
		}
	}

	public static void main(String[] args) {
		sc.init();
		new P11946___ACM_ICPC().solve();
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
