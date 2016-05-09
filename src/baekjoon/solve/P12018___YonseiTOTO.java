package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P12018___YonseiTOTO {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt(); // subject
		int m = sc.nextInt(); // mileage

		int[] need = new int[n];

		hack(need, n, m);
		Arrays.sort(need);
		System.out.println(search(need, n, m));
	}

	private int search(int[] need, int n, int m) {
		int sum = 0;
		for (int i = 0; i < need.length; i++) {
			sum += need[i];
			if (sum > m) return i;
		}
		return n;
	}

	private void hack(int[] need, int n, int m) {
		for (int i = 0; i < n; i++) {
			int p = sc.nextInt(); // applicants
			int l = sc.nextInt(); // T.O.

			int[] tmp = new int[p];
			for (int j = 0; j < p; j++) {
				tmp[j] = sc.nextInt();
			}

			if (p >= l) {
				Arrays.sort(tmp);
				need[i] = tmp[p - l];
			} else {
				need[i] = 1;
			}
		}
	}

	public static void main(String[] args) {
		new P12018___YonseiTOTO().solve();
	}
}
