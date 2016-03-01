package baekjoon.todo;
import java.util.Scanner;

public class T11585___DinnerMenu {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		String[] want = new String[n];
		String[] roulette = new String[n];

		for (int i = 0; i < n; i++)
			want[i] = sc.next();
		for (int i = 0; i < n; i++)
			roulette[i] = sc.next();

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (equal(want, roulette, i)) count++;
		}

		getSimpleFraction(count, n);
	}

	private void getSimpleFraction(int a, int b) {
		for (int i = 2; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				a /= i;
				b /= i;
				i = 1;
			}
		}
		System.out.println(a + "/" + b);
	}

	private boolean equal(String[] want, String[] roulette, int n) {
		for (int i = 0; i < want.length; i++, n++) {
			if (n >= want.length) n -= want.length;
			// System.out.println("want : " + want[i] + " , roulette : " +
			// roulette[n]);
			if (!want[i].equals(roulette[n])) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new T11585___DinnerMenu().solve();
	}

}
