import java.util.Scanner;

public class T05904___MooGame {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int moo = 3;
		int max = 3;

		while (true) {
			System.out.printf("n : %d, moo : %d, tmp : %d\n", n, moo, max);
			if (n - moo > 0) {
				n -= moo;
				moo = moo * 2 + 1;
				max++;
			} else {
				System.out.println("-----------------------");
				System.out.println(check(max, n) ? "m" : "o");
				return;
			}
		}
	}

	private boolean check(int max, int n) {
		if (n <= max) {
			if (n == 1) return true;
			return false;
		}

		n -= max;
		int moo = 3;
		int tmp = 3;

		while (true) {
			System.out.printf("n : %d, moo : %d, tmp : %d\n", n, moo, tmp);
			if (n - moo > 0) {
				if (tmp >= max) return check(max - 1, n);
				n -= moo;
				moo = moo * 2 + 1;
				tmp++;
			} else {
				if (n == 1 || n == tmp + 1) return true;
				return false;
			}
		}
	}

	public static void main(String[] args) {
		new T05904___MooGame().solve();
	}
}
