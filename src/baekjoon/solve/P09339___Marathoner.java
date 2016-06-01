package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P09339___Marathoner {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int[] student = new int[n];
			for (int i = 0; i < n; i++) {
				student[i] = sc.nextInt();
			}
			Arrays.sort(student);

			int passStudent = 0;
			int specialPrize = -1;
			int minScore = 361;
			int m = sc.nextInt();
			for (int i = 0; i < m; i++) {
				int id = sc.nextInt();
				int time = sc.nextInt() * 60 + sc.nextInt();
				if (time < 0 || time > 360) continue;
				if (search(student, id, 0, n - 1)) {
					passStudent++;
					if (time < minScore) {
						minScore = time;
						specialPrize = id;
					}
				}
			}

			System.out.printf("%d %d\n", specialPrize, passStudent);
		}
	}

	private boolean search(int[] student, int id, int start, int end) {
		if (start > end) return false;
		int k = (start + end) / 2;
		if (student[k] > id) return search(student, id, start, k - 1);
		if (student[k] < id) return search(student, id, k + 1, end);
		return true;
	}

	public static void main(String[] args) {
		new P09339___Marathoner().solve();
	}
}
