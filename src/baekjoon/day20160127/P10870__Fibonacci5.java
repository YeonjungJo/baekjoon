package baekjoon.day20160127;
import java.util.Scanner;

public class P10870__Fibonacci5 {

	private int[] data = new int[21];

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		data[1] = 1;
		System.out.println(fibo(n));
	}

	private int fibo(int n) {
		if (n == 0)
			return data[0];
		else if (n == 1)
			return data[1];
		else {
			data[n] = data[n-2] + data[n-1];
			return fibo(n - 2) + fibo(n - 1);
		}
	}

	public static void main(String[] args) {
		new P10870__Fibonacci5().solve();
	}
}
