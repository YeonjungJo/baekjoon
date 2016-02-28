package baekjoon.solve;
import java.util.Scanner;

public class P01551___DifferenceInProgression {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] a = sc.next().split(",");

		for (int i = 0; i < m; i++) {
			String[] b = getArray(a);
			a = b;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if(i != a.length -1) System.out.print(",");
		}
	}

	private String[] getArray(String[] a) {
		String[] b = new String[a.length - 1];
		for (int i = 0; i < a.length - 1; i++) {
			b[i] = Integer.toString(Integer.parseInt(a[i + 1]) - Integer.parseInt(a[i]));
		}
		return b;
	}

	public static void main(String[] args) {
		new P01551___DifferenceInProgression().solve();
	}
}
