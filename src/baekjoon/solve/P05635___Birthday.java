package baekjoon.solve;
import java.util.Scanner;

public class P05635___Birthday {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int youngest = 0;
		int oldest = 100000000;
		String youngestStudent = "";
		String oldestStudent = "";

		for (int t = 0; t < n; t++) {
			String name = sc.next();
			int date = sc.nextInt();
			int month = sc.nextInt();
			int year = sc.nextInt();
			int birth = year * 10000 + month * 100 + date;

			if (birth < oldest) {
				oldest = birth;
				oldestStudent = name;
			}
			if (birth > youngest) {
				youngest = birth;
				youngestStudent = name;
			}
		}

		System.out.println(youngestStudent);
		System.out.println(oldestStudent);
	}

	public static void main(String[] args) {
		new P05635___Birthday().solve();
	}
}
