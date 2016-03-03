package baekjoon.solve;
import java.util.LinkedList;
import java.util.Scanner;

public class P01168___Josephus {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		LinkedList<Integer> josep = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			josep.add(i);
		}

		StringBuilder strBuilder = new StringBuilder("<");

		int c = -1;

		while (josep.size() > 1) {
			c += m;
			if (c > josep.size()) c %= josep.size();
			strBuilder.append(josep.remove(c) + ", ");
			c--;
		}

		System.out.println(strBuilder.append(josep.remove() + ">").toString());
	}

	public static void main(String[] args) {
		new P01168___Josephus().solve();
	}
}
