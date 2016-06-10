package baekjoon.solve;
import java.util.Scanner;

public class P01747___PrimeNumberAndPalindrom {

	private static final Scanner sc = new Scanner(System.in);

	private static final int SIZE = 1000001;
	private static final int MAX = 1003001;

	private void solve() {
		int n = sc.nextInt();
		int[] prime = new int[SIZE];
		int k = init(prime);

		System.out.println(search(n, prime, k));
	}

	private int search(int n, int[] prime, int k) {
		for (int i = 0; i < k; i++) {
			if (prime[i] < n) continue;
			if (palindrom(prime[i])) return prime[i];
		}
		return MAX;
	}

	private boolean palindrom(int n) {
		char[] str = Integer.toString(n).toCharArray();
		for (int i = 0; i < str.length / 2; i++) {
			if (str[i] != str[str.length - i - 1]) return false;
		}
		return true;
	}

	private int init(int[] prime) {
		boolean[] p = new boolean[SIZE];
		int k = 0;
		for (int i = 2; i < SIZE; i++) {
			if (!p[i]) {
				prime[k++] = i;
				update(p, i);
			}
		}
		return k;
	}

	private void update(boolean[] p, int k) {
		for (int i = k; i < SIZE; i += k) {
			p[i] = true;
		}
	}

	public static void main(String[] args) {
		new P01747___PrimeNumberAndPalindrom().solve();
	}
}
