package baekjoon.solve;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P07785___PersonInCorp {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		HashMap<String, Void> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String name = sc.next();
			String type = sc.next();
			if (type.equals("enter")) map.put(name, null);
			if (type.equals("leave")) map.remove(name);
		}

		String[] key = map.keySet().toArray(new String[map.size()]);
		Arrays.sort(key);

		for (int i = key.length - 1; i >= 0; i--) {
			System.out.println(key[i]);
		}
	}

	public static void main(String[] args) {
		new P07785___PersonInCorp().solve();
	}
}
