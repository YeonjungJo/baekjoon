package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P01838___BubbleSort {

	private void solve() {
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			s[i] = a[i];
		}
		Arrays.sort(s);

		int start = 0;
		int end = n - 2;
		for (int i = 0; i < n; i++) {
			while (start < end) {
				if (a[start] == s[start]) start++;
				else if (a[end] == s[end]) end--;
				else break;
			}

			for (int j = start; j < end; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
				}
			}

			if (start >= end) {
				System.out.println(i);
				return;
			}

		}
	}

	private void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static void main(String[] args) {
		sc.init();
		new P01838___BubbleSort().solve();
	}

	static class sc {
		private static BufferedReader br;
		private static StringTokenizer st;

		static void init() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer("");
		}

		static int nextInt() {
			while (!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {}
			}

			return Integer.parseInt(st.nextToken());
		}

	}
}
