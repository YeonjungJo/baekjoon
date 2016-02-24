package baekjoon.solve;
import java.util.Scanner;

public class P10419___Lateness {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		Loop1 : for (int t = 0; t < testcase; t++) {
			int d = sc.nextInt();
			for (int i = d - 1; i > 0; i--) {
				if (i * i + i <= d) {
					System.out.println(i);
					continue Loop1;
				}
			}
			System.out.println(0);
		}
	}

	public static void main(String[] args) {
		new P10419___Lateness().solve();
	}
}
