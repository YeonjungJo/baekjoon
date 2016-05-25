package baekjoon.todo;
import java.util.Scanner;

public class T01709___CircleOverTile {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int r = sc.nextInt() / 2;
		int count = 0;
		int y = r;
		for (int x = 1; x <= r; x++) {
			double tmp = Math.sqrt(Math.pow(r, 2) - Math.pow(x, 2));
			if (tmp != (int) tmp) count++;
			count += y - (int) tmp;
			y = (int) tmp;
		}

		System.out.println(count * 4);

	}

	public static void main(String[] args) {
		new T01709___CircleOverTile().solve();
	}
}
