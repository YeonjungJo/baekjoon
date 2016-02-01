package baekjoon.solve;
import java.util.Scanner;

public class P2480____ThreeDice {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a == b && b == c) System.out.println(10000 + a * 1000);
		else if (a == b && b != c) System.out.println(1000 + a * 100);
		else if (a == c && b != c) System.out.println(1000 + a * 100);
		else if (a != b && b == c) System.out.println(1000 + b * 100);
		else System.out.println(100 * (a > b ? a > c ? a : c : b > c ? b : c));
	}

	public static void main(String[] args) {
		new P2480____ThreeDice().solve();
	}
}
