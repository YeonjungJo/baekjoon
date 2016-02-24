package baekjoon.solve;
import java.util.Scanner;

public class P08595___HiddenNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		String[] s = sc.next().split("[a-zA-Z]+");
		long result = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].matches("[0-9]+")) result += Integer.parseInt(s[i]);
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		new P08595___HiddenNumber().solve();
	}
}
