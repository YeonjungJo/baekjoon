package baekjoon.solve;
import java.util.Scanner;

public class P04806___CountLine {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int count = 0;
		while (sc.hasNextLine()) {
			sc.nextLine();
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new P04806___CountLine().solve();
	}
}
