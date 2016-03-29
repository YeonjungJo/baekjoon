package baekjoon.todo;
import java.util.Scanner;

public class T09333___PayBackMoney {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		Loop1: for (int t = 0; t < testcase; t++) {
			double r = sc.nextDouble() / 100;
			double b = sc.nextDouble();
			double m = sc.nextDouble();

			int month = 0;
			while (b > 0) {
				if (month >= 1200) {
					System.out.println("impossible");
					continue Loop1;
				}
				b = b + getIntegerest(r, b) - m;
				month++;
			}

			System.out.println(month);
		}
	}

	private double round(double d, int i) {
		return Math.round(d * Math.pow(10, i)) / Math.pow(10, i);
	}

	private double getIntegerest(double r, double b) {
		return round(r * b, 2);
	}

	public static void main(String[] args) {
		new T09333___PayBackMoney().solve();
	}
}
