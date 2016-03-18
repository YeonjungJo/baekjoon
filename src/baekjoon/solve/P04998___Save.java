package baekjoon.solve;
import java.util.Scanner;

public class P04998___Save {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (sc.hasNextDouble()) {
			double n = sc.nextDouble();
			double b = (sc.nextDouble()) / 100 + 1;
			double m = sc.nextDouble();

			double x = (Math.log(m) - Math.log(n)) / Math.log(b);
			System.out.println((int) x + 1);
		}
	}

	public static void main(String[] args) {
		new P04998___Save().solve();
	}
}
