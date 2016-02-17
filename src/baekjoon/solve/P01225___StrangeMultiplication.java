package baekjoon.solve;
import java.util.Scanner;

public class P01225___StrangeMultiplication {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();

		long result = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				result += Character.getNumericValue(a[i]) * Character.getNumericValue(b[j]);
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		new P01225___StrangeMultiplication().solve();
	}
}
