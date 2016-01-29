package baekjoon.day20160127;
import java.util.Scanner;

public class P1076___Resistance {

	private String[] R = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };

	private void solve() {
		Scanner sc = new Scanner(System.in);

		int result = 0;
		result += getColorValue(sc.next()) * 10;
		result += getColorValue(sc.next());
		System.out.println(result * (long) Math.pow(10, getColorValue(sc.next())));
	}

	private int getColorValue(String s) {
		for (int i = 0; i < R.length; i++) {
			if (R[i].equals(s))
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		new P1076___Resistance().solve();
	}
}
