package baekjoon.solve;
import java.util.Scanner;

public class P05054___GodOfParking {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int min = 100;
			int max = 0;
			for (int i = 0; i < n; i++) {
				int tmp = sc.nextInt();
				min = min > tmp ? tmp : min;
				max = max > tmp ? max : tmp;
			}
			
			System.out.println(2 * (max - min));
		}
	}

	public static void main(String[] args) {
		new P05054___GodOfParking().solve();
	}
}
