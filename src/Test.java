import java.util.Scanner;

public class Test {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = 999;
		long[] count = new long[10];
		for (int i = 1; i <= n; i++) {
			get(count, i);
		}
		for (int i = 0; i < 10; i++)
			System.out.print(count[i] + " ");
		System.out.println();
	}

	private void get(long[] count, int i) {
		while (i > 0) {
			count[i % 10]++;
			i /= 10;
		}
	}

	public static void main(String[] args) {
		new Test().solve();
	}
}
