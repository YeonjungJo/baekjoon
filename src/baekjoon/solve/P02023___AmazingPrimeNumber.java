package baekjoon.solve;
import java.util.LinkedList;
import java.util.Scanner;

public class P02023___AmazingPrimeNumber {

	private static final Scanner sc = new Scanner(System.in);

	private static final int[] POOL = { 1, 3, 5, 7, 9 };

	private void solve() {
		int n = sc.nextInt();
		LinkedList<Integer> prime = new LinkedList<>();
		prime.add(2);
		prime.add(3);
		prime.add(5);
		prime.add(7);

		for (int i = 1; i < n; i++) {
			prime = update(prime);
		}

		while (!prime.isEmpty()) {
			System.out.println(prime.removeFirst());
		}
	}

	private LinkedList<Integer> update(LinkedList<Integer> prime) {
		LinkedList<Integer> result = new LinkedList<>();
		while (!prime.isEmpty()) {
			int k = prime.removeFirst() * 10;
			for (int i = 0; i < POOL.length; i++) {
				if (isPrime(k + POOL[i])) result.add(k + POOL[i]);
			}
		}
		return result;
	}

	private boolean isPrime(int k) {
		for (int i = 2; i <= Math.sqrt(k); i++) {
			if (k % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new P02023___AmazingPrimeNumber().solve();
	}
}
