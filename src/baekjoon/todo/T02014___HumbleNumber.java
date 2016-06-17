package baekjoon.todo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class T02014___HumbleNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] factor = new int[k];
		for (int i = 0; i < k; i++) {
			factor[i] = sc.nextInt();
		}
		Arrays.sort(factor);

		HashSet<Integer> list = new HashSet<>();

		int result = 1;
		while (n > 0) {
			result++;
			if (check(factor, list, result)) {
				list.add(result);
				n--;
			}
		}

		System.out.println(result);
	}

	private boolean check(int[] factor, HashSet<Integer> list, int result) {
		for (int i = 0; i < factor.length; i++) {
			if (result < factor[i]) return false;
			if (result % factor[i] == 0) {
				result /= factor[i];
				if (result == 1 || list.contains(result)) return true;
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		new T02014___HumbleNumber().solve();
	}
}
