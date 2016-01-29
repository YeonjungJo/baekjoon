package baekjoon.day20160112;
import java.util.Scanner;

public class p2609_gcdAndlcm {

	private void init() {
		Scanner sc = new Scanner(System.in);
		operate(sc.nextInt(), sc.nextInt());
	}

	private void operate(int x, int y) {
		int min = x < y ? x : y;
		int gcd = 1;

		for (int i = 2; i <= min; i++) {
			if (x % i == 0 && y % i == 0) gcd = i;
		}

		int lcm = x * y / gcd;

		System.out.println(gcd);
		System.out.println(lcm);
	}

	public static void main(String[] args) {
		new p2609_gcdAndlcm().init();
	}
}
