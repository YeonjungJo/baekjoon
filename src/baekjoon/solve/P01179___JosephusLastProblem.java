package baekjoon.solve;
import java.util.Scanner;

public class P01179___JosephusLastProblem {

	// http://stackoverflow.com/questions/4845260/josephus-for-large-n-facebook-hacker-cup

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		long n = sc.nextLong();
		int m = sc.nextInt();

		System.out.println(josephus(n, m) + 1);
	}

	private long josephus(long n, int k) {
		if (n == 1) return 0;
		if (k == 1) return n - 1;
		if (k > n) return (josephus(n - 1, k) + k) % n;

		long cnt = n / k;
		long res = josephus(n - cnt, k);
		res -= n % k;
		if (res < 0) return res += n;
		return res += res / (k - 1);
	}

	public static void main(String[] args) {
		new P01179___JosephusLastProblem().solve();
	}
}
