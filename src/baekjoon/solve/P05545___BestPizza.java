package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P05545___BestPizza {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);

		int cal = c;
		int price = a;
		double efficiency = c / (double) a;
		for (int i = n - 1; i >= 0; i--) {
			cal += d[i];
			price += b;
			double tmp = cal / (double) price;
			if (tmp > efficiency) efficiency = tmp;
		}

		System.out.println((int) efficiency);
	}

	public static void main(String[] args) {
		new P05545___BestPizza().solve();
	}
}
