package baekjoon.solve;
import java.util.Scanner;

public class P03076___ChessBoard {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int r = sc.nextInt();
		int c = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < r * a; i++) {
			for (int j = 0; j < c * b; j++) {
				if ((i / a) % 2 == 0 ^ (j / b) % 2 == 0) strBuilder.append(".");
				else strBuilder.append("X");
			}
			strBuilder.append("\n");
		}
		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		new P03076___ChessBoard().solve();
	}
}
