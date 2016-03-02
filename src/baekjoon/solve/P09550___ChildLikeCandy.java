package baekjoon.solve;
import java.util.Scanner;

public class P09550___ChildLikeCandy {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int count = 0;
			for (int i = 0; i < n; i++) {
				count += sc.nextInt() / k;
			}
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		new P09550___ChildLikeCandy().solve();
	}
}
