package baekjoon.solve;
import java.util.Scanner;

public class P03049___DiagonalOfPolygon {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		System.out.println(n * (n - 1) * (n - 2) * (n - 3) / 24);
	}

	public static void main(String[] args) {
		new P03049___DiagonalOfPolygon().solve();
	}
}
