package baekjoon.solve;
import java.util.Scanner;

public class P08949___RoughlyAdd {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String a = String.format("%7s", sc.next());
		String b = String.format("%7s", sc.next());

		StringBuilder strBuilder = new StringBuilder();

		for (int i = 6; i >= 0; i--) {
			int x = Character.getNumericValue(a.charAt(i));
			int y = Character.getNumericValue(b.charAt(i));
			x = x == -1 ? 0 : x;
			y = y == -1 ? 0 : y;
			strBuilder.insert(0, x + y);
		}

		System.out.println(strBuilder.toString().replaceAll("^[0]+", ""));
	}

	public static void main(String[] args) {
		new P08949___RoughlyAdd().solve();
	}
}
