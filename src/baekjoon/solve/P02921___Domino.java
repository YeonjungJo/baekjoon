package baekjoon.solve;
import java.util.Scanner;

public class P02921___Domino {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		System.out.println(n * (n + 1) * (n + 2) / 2);
	}

	public static void main(String[] args) {
		new P02921___Domino().solve();
	}
}
