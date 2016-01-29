package baekjoon.day20160122;
import java.util.Scanner;

public class P1013___Contact {

	private static final String PATTERN = "(100+1+|01)+";

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			if (sc.next().matches(PATTERN)) System.out.println("YES");
			else System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		new P1013___Contact().solve();
	}
}
