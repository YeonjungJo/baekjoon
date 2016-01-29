package baekjoon.todo;
import java.util.Scanner;

public class T10816__NumberedCard2 {

	private int[] have = new int[20000001];

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			have[sc.nextInt() + 10000000]++;
		}
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print(have[sc.nextInt() + 10000000] + " ");
		}
	}

	public static void main(String[] args) {
		new T10816__NumberedCard2().solve();
	}
}
