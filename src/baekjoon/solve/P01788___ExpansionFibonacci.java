package baekjoon.solve;
import java.util.Scanner;

public class P01788___ExpansionFibonacci {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[] d = new int[1000001];
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println(1);
		} else if (n == 0) {
			System.out.println(0);
		} else {
			System.out.println(n % 2 == 0 ? -1 : 1);
		}
		System.out.println(fibo(d, Math.abs(n)));
	}

	private int fibo(int[] d, int n) {
		if (n == 0) return d[0] = 0;
		if (n == 1) return d[1] = 1;
		if (d[n] != 0) return d[n];
		return d[n] = (fibo(d, n - 1) + fibo(d, n - 2)) % 1000000000;
	}

	public static void main(String[] args) {
		new P01788___ExpansionFibonacci().solve();
	}
}