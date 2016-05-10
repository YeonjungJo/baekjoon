package baekjoon.solve;
import java.util.Scanner;

public class P11648___Continuance {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int t = 0;
		while (n >= 10) {
			n = getNext(n);
			t++;
		}
		System.out.println(t);
	}

	private int getNext(int n) {
		int next = 1;
		while (n > 1) {
			next *= n % 10;
			n /= 10;
		}
		return next;
	}

	public static void main(String[] args) {
		new P11648___Continuance().solve();
	}
}
