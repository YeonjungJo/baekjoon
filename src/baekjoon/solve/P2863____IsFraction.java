package baekjoon.solve;
import java.util.Scanner;

public class P2863____IsFraction {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int[] t = new int[4];
		t[0] = c * d;
		t[1] = b * d;
		t[2] = a * b;
		t[3] = a * c;

		if (t[0] <= t[1] && t[0] <= t[2] && t[0] <= t[3]) System.out.println(0);
		else if (t[1] < t[0] && t[1] <= t[2] && t[1] <= t[3]) System.out.println(1);
		else if (t[2] < t[0] && t[2] < t[1] && t[2] <= t[3]) System.out.println(2);
		else System.out.println(3);
	}

	public static void main(String[] args) {
		new P2863____IsFraction().solve();
	}
}
