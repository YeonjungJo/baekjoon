package baekjoon.todo;
import java.util.Scanner;

public class T04134___NextPrimeNumber {

	private static final Scanner sc = new Scanner(System.in);

	private static final String MAX = "4000000007";

	private void solve() {
		int[] p = new int[100001];
		int k = init(p);

		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int tmp = search(p, sc.nextInt(), k);
			if (tmp == -1) System.out.println(MAX);
			else System.out.println(tmp);
		}
	}

	private int search(int[] p, int n, int k) {
		while (n < 4 * Math.pow(10, 9)) {
			for (int i = 0; i < k; i++) {
				if (p[i] > n) return n;
				if (n % p[i] == 0) break;
			}
			n++;
		}
		return -1;
	}

	private int init(int[] p) {
		boolean[] prime = new boolean[100001];
		int k = 0;
		for (int i = 2; i < 100001; i++) {
			if (!prime[i]) {
				p[k++] = i;
				update(prime, i);
			}
		}
		return k;
	}

	private void update(boolean[] prime, int i) {
		for (int k = i; k < 100001; k += i)
			prime[k] = true;
	}

	public static void main(String[] args) {
		new T04134___NextPrimeNumber().solve();
	}
}
