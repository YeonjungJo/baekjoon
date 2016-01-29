package baekjoon.day20160127;
import java.util.Scanner;

public class P2748___Fibonacci2 {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long i = 0;
		long j = 1;

		for (int k = 0; k < n; k++) {
			long tmp = i;
			i = j;
			j = tmp + i;
		}
		System.out.println(i);
	}

	public static void main(String[] args) {
		new P2748___Fibonacci2().solve();
	}
}
