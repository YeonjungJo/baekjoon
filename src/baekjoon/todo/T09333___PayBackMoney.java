package baekjoon.todo;
import java.util.Scanner;

public class T09333___PayBackMoney {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			double r = sc.nextDouble();
			double b = sc.nextDouble();
			double m = sc.nextDouble();
			search(r, b, m);
		}
	}

	private void search(double r, double b, double m) {
		for (int i = 1; i <= 1200; i++) {
			double tmp = getInterest(b, r) - m;
			if (tmp >= 0) {
				System.out.println("impossible");
				return;
			}
			b += tmp;
			if (b <= 0) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("impossible");
	}

	private double getInterest(double b, double r) {
		double interest = b * r;
		return Math.round(interest) / 100.0;
	}

	public static void main(String[] args) {
		new T09333___PayBackMoney().solve();
	}
}
