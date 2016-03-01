package baekjoon.todo;
import java.util.Scanner;

public class T01020___DigitalCounter {

	private static final Scanner sc = new Scanner(System.in);

	private static final int[] NUMBER = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 5 };

	private void solve() {
		String n = sc.next();
		int[] counter = new int[n.length() + 1];
		for (int i = 0; i < n.length(); i++) {
			counter[i + 1] = Character.getNumericValue(n.charAt(i));
		}
		int original = count(n.length(), counter);

		int time = 0;
		while (true) {
			time++;
			counter[n.length()]++;
			for (int i = n.length(); i > 0; i--) {
				if (counter[i] == 10) {
					counter[i] = 0;
					counter[i - 1]++;
				}
			}
			if (original == count(n.length(), counter)) {
				System.out.println(time);
				return;
			}
		}
	}

	private int count(int n, int[] counter) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += NUMBER[counter[i]];
		}
		return result;
	}

	public static void main(String[] args) {
		new T01020___DigitalCounter().solve();
	}
}
