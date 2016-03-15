package baekjoon.solve;
import java.util.Scanner;

public class P10992___Star17 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				for (int j = 1; j < n; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			} else if (i != n - 1) {
				for (int j = 1; j < n - i; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (int j = 1; j < 2 * i; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			} else {
				for (int j = 0; j < 2 * n - 1; j++) {
					System.out.print("*");
				}
			}
		}
	}

	public static void main(String[] args) {
		new P10992___Star17().solve();
	}
}
