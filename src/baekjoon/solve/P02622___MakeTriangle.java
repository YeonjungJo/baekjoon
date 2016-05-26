package baekjoon.solve;
import java.util.Scanner;

public class P02622___MakeTriangle {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - i; j++) {
				int k = n - i - j;
				if (k < j) continue;
				if (k < i + j) count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new P02622___MakeTriangle().solve();
	}
}
