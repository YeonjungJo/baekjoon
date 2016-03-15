package baekjoon.solve;
import java.util.Scanner;

public class P11576___BaseConversion {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();

		int m = sc.nextInt();
		int decimal = 0;
		for (int i = 0; i < m; i++) {
			decimal += sc.nextInt() * Math.pow(a, m - i - 1);
		}

		StringBuilder strBuilder = new StringBuilder();
		while (decimal != 0) {
			strBuilder.insert(0, decimal % b + " ");
			decimal /= b;
		}
		
		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		new P11576___BaseConversion().solve();
	}
}
