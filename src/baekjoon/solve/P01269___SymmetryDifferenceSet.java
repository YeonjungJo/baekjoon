package baekjoon.solve;
import java.util.Scanner;

public class P01269___SymmetryDifferenceSet {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean[] d = new boolean[100000001];

		for (int i = 0; i < n; i++) {
			d[sc.nextInt()] = true;
		}
		for (int i = 0; i < m; i++) {
			int tmp = sc.nextInt();
			d[tmp] = !d[tmp];
		}

		int count = 0;
		for (int i = 0; i < d.length; i++) {
			if(d[i]) count++;
		}
		
		System.out.println(count);
	}

	public static void main(String[] args) {
		new P01269___SymmetryDifferenceSet().solve();
	}
}
