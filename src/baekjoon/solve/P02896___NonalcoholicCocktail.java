package baekjoon.solve;
import java.util.Scanner;

public class P02896___NonalcoholicCocktail {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		float i = sc.nextFloat();
		float j = sc.nextFloat();
		float k = sc.nextFloat();

		float an = a / i;
		float bn = b / j;
		float cn = c / k;

		float min = min(an, bn, cn);

		float remainA = calc(a, i, min);
		float remainB = calc(b, j, min);
		float remainC = calc(c, k, min);

		System.out.println(remainA + " " + remainB + " " + remainC);
	}

	private float calc(int c, float k, float min) {
		return round(c - k * min, 5);
	}

	private float round(float f, int n) {
		return (float) (Math.round(f * Math.pow(10, n)) / Math.pow(10, n));
	}

	private float min(float an, float bn, float cn) {
		return an < bn ? an < cn ? an : cn : bn < cn ? bn : cn;
	}

	public static void main(String[] args) {
		new P02896___NonalcoholicCocktail().solve();
	}
}
