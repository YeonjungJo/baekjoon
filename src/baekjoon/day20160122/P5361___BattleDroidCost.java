package baekjoon.day20160122;
import java.util.Scanner;

public class P5361___BattleDroidCost {

	private static final double[] COST = { 350.34, 230.90, 190.55, 125.30, 180.90 };

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			double result = 0;
			for (int j = 0; j < 5; j++) {
				result += COST[j] * sc.nextInt();
			}
			System.out.println(String.format("$%.2f", result));
		}
	}

	public static void main(String[] args) {
		new P5361___BattleDroidCost().solve();
	}
}
