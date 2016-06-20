import java.util.Scanner;

public class Main {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();

		for (int t = 0; t < testcase; t++) {
			int s = sc.nextInt();
			int f = sc.nextInt();
			System.out.println(xor(s, f));
		}
	}

	private long xor(int s, int f) {
		if (s == f) return s;

		int tmp = f - s + 1;

		if (tmp % 2 == 0) {
			if (tmp % 4 != 0) return f ^ s;
			return s ^ f ^ ((f + s) / 2) ^ (((f + s) / 2) + 1);
		}
		return f ^ s ^ ((f + s) / 2);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}
