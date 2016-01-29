package baekjoon.day20160122;
import java.util.Scanner;

public class P10156__Cookie {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(k * n - m > 0 ? k * n - m : 0);
	}

	public static void main(String[] args) {
		new P10156__Cookie().solve();
	}
}

