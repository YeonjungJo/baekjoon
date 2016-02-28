package baekjoon.solve;
import java.util.Scanner;

public class P02078___InfiniteBinaryTree {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();

		int left = 0;
		int right = 0;

		while (!(a == 1 && b == 1)) {
			if (a > b) {
				left++;
				a -= b;
			} else {
				right++;
				b -= a;
			}
		}

		System.out.println(left + " " + right);
	}

	public static void main(String[] args) {
		new P02078___InfiniteBinaryTree().solve();
	}
}
