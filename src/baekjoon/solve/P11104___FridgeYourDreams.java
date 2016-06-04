package baekjoon.solve;
import java.util.Scanner;

public class P11104___FridgeYourDreams {

	private static final Scanner sc = new Scanner(System.in);

	private static final int SIZE = 24;

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			char[] a = sc.next().toCharArray();

			int result = 0;
			for (int i = 0; i < SIZE; i++) {
				if (a[i] == '1') result += Math.pow(2, SIZE - (i + 1));
			}
			
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		new P11104___FridgeYourDreams().solve();
	}
}
