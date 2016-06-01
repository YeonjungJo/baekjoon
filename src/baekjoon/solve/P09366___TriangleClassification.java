package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P09366___TriangleClassification {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int[] side = new int[3];
			for (int i = 0; i < 3; i++) {
				side[i] = sc.nextInt();
			}
			Arrays.sort(side);

			if (side[0] + side[1] <= side[2]) print(t, "invalid!");
			else if (side[0] == side[2]) print(t, "equilateral");
			else if (side[0] == side[1] || side[1] == side[2]) print(t, "isosceles");
			else print(t, "scalene");
		}
	}

	private void print(int t, String s) {
		System.out.printf("Case #%d: %s\n", t, s);
	}

	public static void main(String[] args) {
		new P09366___TriangleClassification().solve();
	}
}
