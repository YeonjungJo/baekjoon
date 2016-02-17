package baekjoon.solve;
import java.util.Scanner;

public class P04766___ChemicalExperiment {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		float f = 0;
		boolean isFirst = true;

		while (true) {
			float k = sc.nextFloat();
			if (k == 999) return;
			if (isFirst) {
				f = k;
				isFirst = false;
			} else {
				System.out.printf("%.2f\n", k - f);
				f = k;
			}
		}
	}

	public static void main(String[] args) {
		new P04766___ChemicalExperiment().solve();
	}
}
