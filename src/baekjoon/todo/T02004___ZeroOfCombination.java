package baekjoon.todo;
import java.math.BigInteger;
import java.util.Scanner;

public class T02004___ZeroOfCombination {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int t = n - m > m ? n - m : m;

		long cnt2 = 0;
		long cnt5 = 0;

		for (int i = n; i > t; i--) {
			cnt2 += count(i, 2);
			cnt5 += count(i, 5);
		}

		for (int i = n - t; i > 1; i--) {
			cnt2 -= count(i, 2);
			cnt5 -= count(i, 5);
		}

		System.out.println(cnt2 > cnt5 ? cnt5 : cnt2);
	}

	private long count(int i, int base) {
		String s = BigInteger.valueOf(i).toString(base);
		return s.length() - s.replaceAll("[0]*$", "").length();
	}

	public static void main(String[] args) {
		new T02004___ZeroOfCombination().solve();
	}
}
