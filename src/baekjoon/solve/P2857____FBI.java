package baekjoon.solve;
import java.util.Scanner;

public class P2857____FBI {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 1; i <= 5; i++) {
			if (sc.next().contains("FBI")) strBuilder.append(i + " ");
		}
		System.out.println(strBuilder.length() == 0 ? "HE GOT AWAY!" : strBuilder.toString());
	}

	public static void main(String[] args) {
		new P2857____FBI().solve();
	}
}
