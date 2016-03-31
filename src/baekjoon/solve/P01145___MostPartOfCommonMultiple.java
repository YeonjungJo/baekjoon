package baekjoon.solve;
import java.util.Scanner;

public class P01145___MostPartOfCommonMultiple {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[] a = new int[5];
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}

		int min = 99 * 99 * 99 * 99 * 99;
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				int lcm = lcm(a[i], a[j]);
				for (int k = j + 1; k < 5; k++) {
					int tmp = lcm(lcm, a[k]);
					if (tmp < min) min = tmp;
				}
			}
		}

		System.out.println(min);
	}

	private int lcm(int i, int j) {
		int gcd = 1;
		for (int a = 2; a <= min(i, j); a++) {
			if (i % a == 0 && j % a == 0) {
				gcd *= a;
				i /= a;
				j /= a;
				a--;
			}
		}
		return gcd * i * j;
	}

	private int min(int i, int j) {
		return i < j ? i : j;
	}

	public static void main(String[] args) {
		new P01145___MostPartOfCommonMultiple().solve();
	}
}
