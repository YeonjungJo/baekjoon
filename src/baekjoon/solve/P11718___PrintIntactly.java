package baekjoon.solve;
import java.util.Scanner;

public class P11718___PrintIntactly {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}

	public static void main(String[] args) {
		new P11718___PrintIntactly().solve();
	}
}
