package baekjoon.solve;
import java.util.HashMap;
import java.util.Scanner;

public class P01620___PocketmonMaster {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		HashMap<Integer, String> pocketmon = new HashMap<>();
		HashMap<String, Integer> pocketmonReverse = new HashMap<>();

		for (int i = 1; i <= n; i++){
			String s = sc.next();
			pocketmon.put(i, s);
			pocketmonReverse.put(s, i);
		}

		for (int i = 0; i < m; i++) {
			String query = sc.next();

			if (query.matches("[0-9]+")) {
				System.out.println(pocketmon.get(Integer.parseInt(query)));
			} else {
				System.out.println(pocketmonReverse.get(query));
			}
		}
	}

	public static void main(String[] args) {
		new P01620___PocketmonMaster().solve();
	}
}
