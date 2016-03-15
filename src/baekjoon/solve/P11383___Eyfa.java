package baekjoon.solve;
import java.util.Scanner;

public class P11383___Eyfa {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] original = new String[n];
		for (int i = 0; i < n; i++) {
			original[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			String stretch = sc.next();
			for (int j = 0; j < original[i].length(); j++) {
				if (stretch.charAt(2 * j) != original[i].charAt(j) || stretch.charAt(2 * j + 1) != original[i].charAt(j)) {
					System.out.println("Not Eyfa");
					return;
				}
			}
		}
		System.out.println("Eyfa");
	}

	public static void main(String[] args) {
		new P11383___Eyfa().solve();
	}
}
