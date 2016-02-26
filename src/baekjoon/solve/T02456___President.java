package baekjoon.solve;
import java.util.Scanner;

public class T02456___President {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[][] result = new int[4][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				int tmp = sc.nextInt();
				result[tmp][j]++;
				result[0][j] += tmp;
			}
		}

		boolean[] todo = { true, true, true };
		for (int i = 0; i < 3; i++) {
			String[] tmp = findPresident(todo, result[i]).split(" ");
			if (tmp[0].length() == 1) {
				System.out.println((Integer.parseInt(tmp[0]) + 1) + " " + result[0][Integer.parseInt(tmp[0])]);
				return;
			} else if (tmp[0].length() == 2) {
				String s = "012";
				for (int j = 0; j < tmp[0].length(); j++) {
					s = s.replace(tmp[0].charAt(j), ' ');
				}
				todo[Integer.parseInt(s.trim())] = false;
			}
		}
		System.out.println("0 " + result[0][0]);
	}

	private String findPresident(boolean[] todo, int[] vote) {
		int max = vote[0];
		String result = "0";

		for (int i = 1; i < 3; i++) {
			if (todo[i]) {
				if (vote[i] == max) result += i;
				if (vote[i] > max) {
					result = i + "";
					max = vote[i];
				}
			}
		}

		return result.concat(" " + max);
	}

	public static void main(String[] args) {
		new T02456___President().solve();
	}
}
