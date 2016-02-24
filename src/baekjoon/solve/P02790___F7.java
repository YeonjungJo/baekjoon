package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P02790___F7 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] driver = new int[n];
		for (int i = 0; i < n; i++)
			driver[i] = sc.nextInt();

		Arrays.sort(driver);

		int max = driver[0] + n;
		for (int i = 0; i < n; i++) {
			int tmp = driver[i] + n - i;
			if (tmp > max) max = tmp;
		}

		int result = n;
		for (int i = 0; i < n; i++) {
			if (driver[i] + n < max) result--;
		}
		
		System.out.println(result);
	}

	public static void main(String[] args) {
		new P02790___F7().solve();
	}
}
