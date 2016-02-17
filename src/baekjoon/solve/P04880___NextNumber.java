package baekjoon.solve;
import java.util.Scanner;

public class P04880___NextNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[] a = new int[3];
		while (true) {
			for (int k = 0; k < 3; k++) {
				a[k] = sc.nextInt();
			}
			if (a[0] == 0 && a[1] == 0 && a[2] == 0) return;
			if(a[1] - a[0] == a[2] - a[1]) System.out.println("AP " + (a[2] + (a[1] - a[0])));
			else System.out.println("GP " + (a[2] * (a[1] / a[0])));
		}
	}

	public static void main(String[] args) {
		new P04880___NextNumber().solve();
	}
}
