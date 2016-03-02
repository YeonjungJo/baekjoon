package baekjoon.todo;
import java.util.Scanner;

public class T02812___MakeBigger {

	/*
	 * 6 2 391123
	 * 
	 */

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();

		for (int i = 0; i < 10; i++) {
			String tmp = s.replaceAll(Integer.toString(i), "");
			int diff = s.length() - tmp.length();
			if (k - diff > 0) {
				s = tmp;
				k -= diff;
			} else if (k - diff == 0) {
				System.out.println(tmp);
				return;
			} else if (k - diff < 0) {
				for (int j = 0; j < k; j++) {
					s = s.replaceFirst(Integer.toString(i), "");
				}
				System.out.println(s);
				return;
			}
		}
	}

	public static void main(String[] args) {
		new T02812___MakeBigger().solve();
	}
}
