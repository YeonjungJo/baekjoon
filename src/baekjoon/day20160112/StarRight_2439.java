package baekjoon.day20160112;
import java.util.Scanner;

public class StarRight_2439 {

	private int n;

	public StarRight_2439() {
		scan();
		result();
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
	}

	private void result() {
		for (int m = 1; m <= n; m++) {
			for (int j = 0; j < n-m; j++) {
				System.out.print(" ");
			}
			for (int i = 0; i < m; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new StarRight_2439();
	}
}
