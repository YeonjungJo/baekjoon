package baekjoon.solve;
import java.util.LinkedList;
import java.util.Scanner;

public class P02606___Virus {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		boolean[][] network = new boolean[n][n];

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			network[b][a] = true;
			network[a][b] = true;
		}

		LinkedList<Integer> stack = new LinkedList<Integer>();
		stack.add(0);

		boolean[] result = new boolean[n];

		while (!stack.isEmpty()) {
			int i = stack.removeFirst();
			result[i] = true;
			for (int j = 0; j < n; j++) {
				if (network[i][j] && !result[j]) stack.add(j);
			}
		}

		int count = 0;
		for (int i = 1; i < n; i++) {
			if (result[i]) count++;
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		new P02606___Virus().solve();
	}
}
