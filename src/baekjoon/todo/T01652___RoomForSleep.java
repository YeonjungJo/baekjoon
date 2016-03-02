package baekjoon.todo;
import java.util.Scanner;

public class T01652___RoomForSleep {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int h = 0;
		int v = 0;

		String[] tmp = new String[n];

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (s.contains("..")) h++;
			for (int j = 0; j < n; j++) {
				if (i == 0) tmp[j] = "";
				tmp[j] += s.charAt(j);
				if (i == n - 1 && tmp[j].contains("..")) v++;
			}
		}
		System.out.printf(h + " " + v);
	}

	public static void main(String[] args) {
		new T01652___RoomForSleep().solve();
	}
}
