package baekjoon.todo;
import java.util.Scanner;

public class T02168___DiagonalOnTile {
	
	/*
	 * T01709
	 */

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int x = sc.nextInt();
		int y = sc.nextInt();

		int factor = factor(x, y);

		int count = 0;
		double tmp = 0;
		double d = y / (double) x;
		double j = d;
		for (int i = 1; i <= factor; i++, j += d) {
			count += Math.abs((int) j - (int) tmp);
			if (tmp != (int) tmp) count++;
			tmp = j;
		}
		System.out.println(count * (x / factor));
	}

	private int factor(int x, int y) {
		int gcd = 1;
		for (int i = 2; i <= x && i <= y; i++) {
			if (x % i == 0 && y % i == 0) {
				x /= i;
				y /= i;
				i--;
			}
		}
		return x / gcd;
	}

	public static void main(String[] args) {
		new T02168___DiagonalOnTile().solve();
	}
}
