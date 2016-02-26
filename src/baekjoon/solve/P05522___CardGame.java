package baekjoon.solve;
import java.util.Scanner;

public class P05522___CardGame {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += sc.nextInt();
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new P05522___CardGame().solve();
	}
}
