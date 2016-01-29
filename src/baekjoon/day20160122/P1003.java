package baekjoon.day20160122;
import java.util.Scanner;

public class P1003 {

	int[] fibo = new int[41];
	boolean[] check = new boolean[41];

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		fibo[0] = 0;
		fibo[1] = 1;
		check[0] = true;
		check[1] = true;

		for (int i = 0; i < t; i++) {
			count0 = 0;
			count1 = 0;
			fibo(sc.nextInt());
			System.out.println(count0 + " " + count1);
		}
	}

	private int count0 = 0;
	private int count1 = 0;

	private int fibo(int i) {
		if (i == 0) {
			count0++;
			return 0;
		} else if (i == 1) {
			count1++;
			return 1;
		} else {
			return fibo(i - 2) + fibo(i - 1);
		}
	}

	public static void main(String[] args) {
		new P1003().solve();
	}
}
