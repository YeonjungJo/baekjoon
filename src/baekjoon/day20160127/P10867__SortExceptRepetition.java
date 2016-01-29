package baekjoon.day20160127;
import java.util.Scanner;

public class P10867__SortExceptRepetition {

	private boolean[] data = new boolean[2001];

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			data[sc.nextInt() + 1000] = true;
		}
		for (int i = 0; i < data.length; i++) {
			if (data[i])
				System.out.print((i - 1000) + " ");
		}
	}

	public static void main(String[] args) {
		new P10867__SortExceptRepetition().solve();
	}
}
