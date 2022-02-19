package baekjoon.solve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class P11004___KthNumber {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;

	private void solve() throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken()) - 1;

		List<Integer> a = new LinkedList<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(a);
		System.out.println(a.get(k));
	}

	public static void main(String[] args) throws IOException {
		new P11004___KthNumber().solve();
	}
}
