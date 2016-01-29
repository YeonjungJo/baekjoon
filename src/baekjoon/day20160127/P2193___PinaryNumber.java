package baekjoon.day20160127;
import java.util.Scanner;

public class P2193___PinaryNumber {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long i = 0;
		long j = 1;
		for (int k = 0; k < n - 1; k++) {
			long tmp = i;
			i = j;
			j = tmp + i;
		}
		System.out.println(j);
	}

	public static void main(String[] args) {
		new P2193___PinaryNumber().solve();
	}
}
