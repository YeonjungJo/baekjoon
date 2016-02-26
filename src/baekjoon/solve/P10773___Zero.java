package baekjoon.solve;
import java.util.Scanner;

public class P10773___Zero {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int k = sc.nextInt();

		int[] history = new int[k];
		int cursor = 0;

		for (int i = 0; i < k; i++) {
			int tmp = sc.nextInt();
			if (tmp == 0) cursor--;
			else {
				history[cursor] = tmp;
				cursor++;
			}
		}

		int sum = 0;
		for (int i = 0; i < cursor; i++) {
			sum += history[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new P10773___Zero().solve();
	}
}
