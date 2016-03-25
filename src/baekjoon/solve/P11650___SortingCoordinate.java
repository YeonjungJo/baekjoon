package baekjoon.solve;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class P11650___SortingCoordinate {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		HashMap<Integer, LinkedList<Integer>> p = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (!p.containsKey(x)) {
				p.put(x, new LinkedList<Integer>());
			}
			p.get(x).add(y);
		}

		Integer[] xArr = p.keySet().toArray(new Integer[p.size()]);
		Arrays.sort(xArr);
		for (int i = 0; i < xArr.length; i++) {
			Integer[] yArr = p.get(xArr[i]).toArray(new Integer[p.get(xArr[i]).size()]);
			Arrays.sort(yArr);
			for (int j = 0; j < yArr.length; j++) {
				System.out.println(xArr[i] + " " + yArr[j]);
			}
		}
	}

	public static void main(String[] args) {
		new P11650___SortingCoordinate().solve();
	}
}
