package baekjoon.solve;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P01302___Bestseller {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		HashMap<String, Integer> sold = new HashMap<>();

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (sold.containsKey(s)) sold.put(s, sold.get(s) + 1);
			else sold.put(s, 1);
		}

		Integer[] a = sold.values().toArray(new Integer[sold.size()]);
		Arrays.sort(a);
		int max = a[a.length - 1];

		String[] s = sold.keySet().toArray(new String[sold.size()]);
		Arrays.sort(s);
		
		for (int i = 0; i < s.length; i++) {
			if (sold.get(s[i]).equals(max)) {
				System.out.println(s[i]);
				return;
			}
		}
	}

	public static void main(String[] args) {
		new P01302___Bestseller().solve();
	}
}
