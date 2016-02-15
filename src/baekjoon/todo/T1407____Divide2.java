package baekjoon.todo;
import java.util.Scanner;

public class T1407____Divide2 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		long min = sc.nextLong();
		long max = sc.nextLong();

		long result = 0;
		for (int i = 0;; i++) {
			long n = max - min + 1;	
			if (min % 2 == 1 && n % 2 == 1) result += (n + 1) / 2 * Math.pow(2, i);
			else result += n / 2 * Math.pow(2, i);
			if (min == max && min % 2 == 1) break;
			min = min % 2 == 1 ? min / 2 + 1 : min / 2;
			max /= 2;
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		new T1407____Divide2().solve();
	}
}
