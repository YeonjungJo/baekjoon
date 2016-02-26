package baekjoon.solve;
import java.util.Scanner;

public class P10102___VoteCount {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int b = sc.next().replace("A", "").length();
		int a = n - b;
		if (a > b) System.out.println("A");
		if (a == b) System.out.println("Tie");
		if (a < b) System.out.println("B");
	}

	public static void main(String[] args) {
		new P10102___VoteCount().solve();
	}
}
