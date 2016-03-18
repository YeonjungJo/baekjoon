package baekjoon.solve;
import java.util.Scanner;

public class P10707___WaterBill {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int p = sc.nextInt();

		int x = a * p;
		int y = b + (p > c ? d * (p - c) : 0);

		System.out.println(x > y ? y : x);
	}

	public static void main(String[] args) {
		new P10707___WaterBill().solve();
	}
}
