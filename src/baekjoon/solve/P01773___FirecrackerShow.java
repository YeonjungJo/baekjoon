package baekjoon.solve;
import java.util.Scanner;

public class P01773___FirecrackerShow {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int c = sc.nextInt();

		boolean[] fire = new boolean[c + 1];
		int[] frequency = new int[n];
		for (int i = 0; i < n; i++) {
			frequency[i] = sc.nextInt();
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j * frequency[i] <= c; j++) {
				if (!fire[j * frequency[i]]) {
					fire[j * frequency[i]] = true;
					count++;
				}
			}
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		new P01773___FirecrackerShow().solve();
	}
}
