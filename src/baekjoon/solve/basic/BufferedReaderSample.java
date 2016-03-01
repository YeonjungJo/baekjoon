package baekjoon.solve.basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferedReaderSample {

	private void solve() throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(in.readLine());

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(in.readLine());

		StringBuilder result = new StringBuilder();
		int i = 0;
		for (int j = 0; j < m; j++) {
			int tmp = Integer.parseInt(st.nextToken());
			while (i < n && a[i] <= tmp) {
				result.append(a[i] + " ");
				i++;
			}
			result.append(tmp + " ");
		}
		while(i < n){
			result.append(a[i] + " ");
			i++;
		}
		System.out.println(result.toString());
	}

	public static void main(String[] args) throws IOException {
		new BufferedReaderSample().solve();
	}
}
