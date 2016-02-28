package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P01822___DifferenceSet {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[m];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);

		StringBuilder result = new StringBuilder();
		int i = 0, j = 0;
		while (i < n && j < m) {
			if (a[i] > b[j]) {
				j++;
				continue;
			}
			if (a[i] < b[j]) {
				result.append(a[i] + " ");
				i++;
				continue;
			}
			if (a[i] == b[j]) {
				i++;
				j++;
			}
		}

		for (; i < n; i++)
			result.append(a[i] + " ");

		if (result.toString().equals("")) System.out.println(0);
		else {
			System.out.println(result.toString().split(" ").length);
			System.out.println(result.toString());
		}

	}

	public static void main(String[] args) {
		new P01822___DifferenceSet().solve();
	}
}
