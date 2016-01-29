package baekjoon.day20160117;
import java.util.Scanner;

public class p2475_verifyNumber {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		for (int i = 0; i < 5; i++)
			result += Math.pow(sc.nextInt(), 2);
		System.out.println(result % 10);
	}

	public static void main(String[] args) {
		new p2475_verifyNumber().solve();
	}
}
