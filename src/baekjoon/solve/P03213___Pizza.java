package baekjoon.solve;
import java.util.Scanner;

public class P03213___Pizza {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] count = new int[3];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (s.equals("1/4")) count[0]++;
			if (s.equals("1/2")) count[1]++;
			if (s.equals("3/4")) count[2]++;
		}

		int result = count[2];
		count[0] -= min(count[0], count[2]);

		if ((count[0] + 1) / 2 > count[1]) {
			result += count[1];
			count[0] -= 2 * count[1];
			result += (count[0] + 3) / 4;
		} else {
			result += (count[0] + 1) / 2;
			count[1] -= (count[0] + 1) / 2;
			result += (count[1] + 1) / 2;
		}
		System.out.println(result);
	}

	private int min(int i, int j) {
		return i < j ? i : j;
	}

	public static void main(String[] args) {
		new P03213___Pizza().solve();
	}
}
