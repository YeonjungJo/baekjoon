package baekjoon.todo;
import java.util.Scanner;

public class T01563___PerfectAttendanceAward {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int a = 3;
		int d = 5;

		for (int i = 1; i < n; i++) {
			a = (a + d) % 1000000;
			d = d * 2 + i;
		}

		System.out.println(a);
	}

	public static void main(String[] args) {
		new T01563___PerfectAttendanceAward().solve();
	}
}
