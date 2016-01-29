package baekjoon.todo;
import java.util.Scanner;

public class T5567___Wedding {

	private String friendList = "";

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean[][] friend = new boolean[n][n];

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			friend[a][b] = true;
			friend[b][a] = true;
		}

		for (int i = 0; i < n; i++) {
			if (friend[0][i]) {
				addFriend(i);
				for (int j = 0; j < n; j++) {
					if (friend[i][j]) addFriend(j);
				}
			}
		}
		System.out.println(friendList.length() - 1);
	}

	private void addFriend(int number) {
		String s = Integer.toString(number);
		if (!friendList.contains(s)) {
			friendList = friendList.concat(s);
		}
	}

	public static void main(String[] args) {
		new T5567___Wedding().solve();
	}
}
