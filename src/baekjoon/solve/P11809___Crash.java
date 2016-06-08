package baekjoon.solve;
import java.util.Scanner;

public class P11809___Crash {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		char[] n = String.format("%10s", sc.next()).toCharArray();
		char[] m = String.format("%10s", sc.next()).toCharArray();

		StringBuilder a = new StringBuilder();
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			if (n[i] >= m[i]) a.append(n[i]);
			if (n[i] <= m[i]) b.append(m[i]);
		}

		if (a.toString().trim().length() == 0) System.out.println("YODA");
		else System.out.println(Integer.parseInt(a.toString().trim()));
		if (b.toString().trim().length() == 0) System.out.println("YODA");
		else System.out.println(Integer.parseInt(b.toString().trim()));
	}

	public static void main(String[] args) {
		new P11809___Crash().solve();
	}
}
