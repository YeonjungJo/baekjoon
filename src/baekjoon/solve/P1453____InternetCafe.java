package baekjoon.solve;
import java.util.Scanner;

public class P1453____InternetCafe {

	private static final Scanner sc = new Scanner(System.in);

	private static boolean[] PC = new boolean[101];

	private void solve() {
		int n = sc.nextInt();
		int reject = 0;
		for (int i = 0; i < n; i++) {
			int p = sc.nextInt();
			if (PC[p]) reject++;
			else PC[p] = true;
		}
		System.out.println(reject);
	}

	public static void main(String[] args) {
		new P1453____InternetCafe().solve();
	}
}
