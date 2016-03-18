package baekjoon.solve;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P02535___AsiaInformationOlympiad {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		HashMap<Integer, String> a = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String id = String.format("%03d%03d", sc.nextInt(), sc.nextInt());
			int score = sc.nextInt();
			a.put(score, id);
		}

		Integer[] key = a.keySet().toArray(new Integer[a.size()]);
		Arrays.sort(key);

		int winner = 0;
		int[] country = new int[n + 1];
		for (int i = n - 1; i >= 0; i--) {
			int c = Integer.parseInt(a.get(key[i]).substring(0, 3));
			int s = Integer.parseInt(a.get(key[i]).substring(3));

			if (country[c] >= 2) continue;
			country[c]++;
			System.out.println(c + " " + s);
			winner++;
			if (winner >= 3) return;
		}
	}

	public static void main(String[] args) {
		new P02535___AsiaInformationOlympiad().solve();
	}
}
