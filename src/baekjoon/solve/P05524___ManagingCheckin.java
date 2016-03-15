package baekjoon.solve;
import java.util.Scanner;

public class P05524___ManagingCheckin {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(sc.next().toLowerCase());
		}
	}

	public static void main(String[] args) {
		new P05524___ManagingCheckin().solve();
	}
}
