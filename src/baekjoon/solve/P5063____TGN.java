package baekjoon.solve;
import java.util.Scanner;

public class P5063____TGN {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int r = sc.nextInt();
			int e = sc.nextInt();
			int c = sc.nextInt();
			if (r > e - c) System.out.println("do not advertise");
			if (r == e - c) System.out.println("does not matter");
			if (r < e - c) System.out.println("advertise");
		}
	}

	public static void main(String[] args) {
		new P5063____TGN().solve();
	}
}
