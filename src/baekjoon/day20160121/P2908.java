package baekjoon.day20160121;
import java.util.Scanner;

public class P2908 {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = reverse(sc.next());
		int m = reverse(sc.next());

		System.out.println(n > m ? n : m);
	}

	private int reverse(String s) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			strBuilder.append(s.charAt(i));
		}
		return Integer.parseInt(strBuilder.toString());
	}

	public static void main(String[] args) {
		new P2908().solve();
	}
}
