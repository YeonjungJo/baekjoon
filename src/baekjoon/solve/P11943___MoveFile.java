package baekjoon.solve;
import java.util.Scanner;

public class P11943___MoveFile {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		System.out.println(min(a + d, b + c));
	}

	private int min(int i, int j) {
		return i > j ? j : i;
	}

	public static void main(String[] args) {
		new P11943___MoveFile().solve();
	}
}
