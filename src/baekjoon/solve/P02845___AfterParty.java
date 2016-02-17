package baekjoon.solve;
import java.util.Scanner;

public class P02845___AfterParty {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt() * sc.nextInt();

		for (int i = 0; i < 5; i++)
			System.out.print((sc.nextInt() - n) + " ");
	}

	public static void main(String[] args) {
		new P02845___AfterParty().solve();
	}
}
