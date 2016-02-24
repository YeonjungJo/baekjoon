package baekjoon.todo;
import java.util.Arrays;
import java.util.Scanner;

public class T01764___NeverHeardOrSeen {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		String[] neverHeard = new String[n];
		String[] neverSeen = new String[m];

		for (int i = 0; i < n; i++) {
			neverHeard[i] = sc.next();
		}
		for (int i = 0; i < m; i++) {
			neverSeen[i] = sc.next();
		}

		Arrays.sort(neverHeard);
		Arrays.sort(neverSeen);

		int count = 0;
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (neverHeard[i].compareTo(neverSeen[j]) < 0) break;
				if (neverHeard[i].equals(neverSeen[j])) {
					count++;
					result.append(neverHeard[i] + "\n");
					break;
				}
			}
		}

		System.out.println(count);
		System.out.println(result.toString());
	}

	public static void main(String[] args) {
		new T01764___NeverHeardOrSeen().solve();
	}
}
