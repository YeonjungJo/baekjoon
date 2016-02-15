package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P9076____SumUpPoint {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int[] p = new int[5];
			for (int i = 0; i < 5; i++)
				p[i] = sc.nextInt();
			Arrays.sort(p);
			if (p[3] - p[1] >= 4) System.out.println("KIN");
			else System.out.println(p[1] + p[2] + p[3]);
		}
	}

	public static void main(String[] args) {
		new P9076____SumUpPoint().solve();
	}
}
