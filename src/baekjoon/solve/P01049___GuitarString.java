package baekjoon.solve;
import java.util.Scanner;

public class P01049___GuitarString {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int packagePrice = Integer.MAX_VALUE;
		int piecePrice = Integer.MAX_VALUE;
		for (int i = 0; i < m; i++) {
			int tmp = sc.nextInt();
			packagePrice = packagePrice > tmp ? tmp : packagePrice;
			tmp = sc.nextInt();
			piecePrice = piecePrice > tmp ? tmp : piecePrice;
		}

		int remain = n % 6;
		int pack = remain == 0 ? n / 6 : n / 6 + 1;

		int a = n * piecePrice;
		int b = Integer.MAX_VALUE;
		if (remain != 0) {
			b = (pack - 1) * packagePrice + remain * piecePrice;
		} else {

		}
		int c = pack * packagePrice;

		System.out.println(a < b ? a < c ? a : c : b < c ? b : c);
	}

	public static void main(String[] args) {
		new P01049___GuitarString().solve();
	}
}
