package baekjoon.todo;
import java.util.Scanner;

public class T11946___AcmIcpc {

	private static final Scanner sc = new Scanner(System.in);

	enum Result {
		AC, RE, TLE, WA
	}

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();

		int[][] a = new int[n][m];

		int[] score = new int[n];

		for (int i = 0; i < q; i++) {
			int time = sc.nextInt();
			int team = sc.nextInt() - 1;
			int number = sc.nextInt() - 1;
			Result result = Result.valueOf(sc.next());

			if (a[team][number] == -1) continue;
			if (result.equals(Result.AC)) {
				score[team] += a[team][number] * time;
			} else {
				a[team][number]++;
			}
		}
	}

	public static void main(String[] args) {
		new T11946___AcmIcpc().solve();
	}
}
