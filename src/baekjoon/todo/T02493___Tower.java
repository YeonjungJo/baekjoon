package baekjoon.todo;
import java.util.Scanner;

public class T02493___Tower {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int[] tower = new int[n + 1];
		int[] result = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			tower[i] = sc.nextInt();
		}

		for (int i = n; i > 0; i--) {
			result[i] = search(tower, i);
		}

		for (int i = 1; i <= n; i++) {
			System.out.print(result[i] + " ");
		}
	}

	private int search(int[] tower, int i) {
		int n = tower[i];
		while (i > 0) {
			i--;
			if (tower[i] > n) return i;
		}
		return 0;
	}

	public static void main(String[] args) {
		new T02493___Tower().solve();
	}
}