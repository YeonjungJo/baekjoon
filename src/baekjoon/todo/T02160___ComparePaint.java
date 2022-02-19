package baekjoon.todo;
import java.util.Scanner;

public class T02160___ComparePaint {

	private static final Scanner sc = new Scanner(System.in);

	private static final int LENGTH = 35;

	private void solve() {
		int n = sc.nextInt();
		String[] paint = new String[n];

		for (int i = 0; i < n; i++) {
			paint[i] = "";
			for (int j = 0; j < 5; j++) {
				paint[i] += sc.next();
			}
		}

		int diff = LENGTH;
		String result = "";
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int tmp = compare(paint[i], paint[j]);
//				System.out.printf("%d, %d = %d\n", i + 1, j + 1, tmp);
				if (tmp < diff) {
					diff = tmp;
					result = (i + 1) + " " + (j + 1);
				}
			}
		}

		System.out.println(result);
	}

	private int compare(String a, String b) {
		int count = 0;
		for (int i = 0; i < LENGTH; i++) {
			if (a.charAt(i) != b.charAt(i)) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		new T02160___ComparePaint().solve();
	}
}
