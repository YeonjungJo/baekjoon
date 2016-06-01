package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P09417___MaxGCD {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = Integer.parseInt(sc.nextLine());
		for (int t = 0; t < testcase; t++) {
			String[] tmp = sc.nextLine().split("[ ]");
			int m = tmp.length;
			int[] a = new int[m];
			for (int i = 0; i < m; i++) {
				a[i] = Integer.parseInt(tmp[i]);
			}
			Arrays.sort(a);

			int maxGCD = 1;
			for (int i = 0; i < m; i++) {
				maxGCD = find(a, m, i, maxGCD);
			}

			System.out.println(maxGCD);
		}
	}

	private int find(int[] a, int m, int i, int maxGCD) {
		int max = maxGCD;
		for (int j = i + 1; j < m; j++) {
			if (max >= a[i]) return max;
			int gcd = getGCD(a[i], a[j]);
			if (gcd > max) max = gcd;
		}
		return max;
	}

	private int getGCD(int n, int m) {
		int gcd = 1;
		for (int i = 2; i <= n && i <= m; i++) {
			if (n % i == 0 && m % i == 0) {
				gcd *= i;
				n /= i;
				m /= i;
				i--;
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		new P09417___MaxGCD().solve();
	}
}
