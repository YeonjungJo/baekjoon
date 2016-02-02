package baekjoon.solve;
import java.util.Scanner;

public class P1834____RemainderAndPortion {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		long n = sc.nextLong();
		System.out.println(n * (n - 1) * (n + 1) / 2);
	}

	public static void main(String[] args) {
		new P1834____RemainderAndPortion().solve();
	}
}
