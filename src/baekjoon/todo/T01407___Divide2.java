package baekjoon.todo;
import java.util.Scanner;

public class T01407___Divide2 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		long a = sc.nextLong();
		long b = sc.nextLong();

		long count = 0;
		while (a <= b) {
			count += factorization(a);
			a++;
		}

		System.out.println(count);
	}

	private long factorization(long a) {
		long i = 2;
		while (a % i == 0) {
			i *= 2;
		}
		return i / 2;
	}

	public static void main(String[] args) {
		new T01407___Divide2().solve();
	}
}
