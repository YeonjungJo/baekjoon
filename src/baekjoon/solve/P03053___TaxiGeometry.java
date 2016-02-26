package baekjoon.solve;
import java.util.Scanner;

public class P03053___TaxiGeometry {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int r = sc.nextInt();
		System.out.printf("%.6f\n", Math.pow(r, 2) * Math.PI);
		System.out.printf("%.6f", Math.pow(r * 2, 2) / 2);
	}

	public static void main(String[] args) {
		new P03053___TaxiGeometry().solve();
	}
}
