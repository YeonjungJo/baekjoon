package baekjoon.solve;
import java.util.Scanner;

public class P01484___Diet {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		boolean flag = true;

		int g = sc.nextInt();

		long current = (long) Math.sqrt(g);
		while (true) {
			long memory = (long) Math.sqrt(current * current - g);
			if (current > 0 && memory > 0 && (current + memory) * (current - memory) == g) {
				System.out.println(current);
				flag = false;
			}
			if (current * current - (current - 1) * (current - 1) > g) break;
			current++;
		}

		if (flag) System.out.println(-1);
	}

	public static void main(String[] args) {
		new P01484___Diet().solve();
	}
}
