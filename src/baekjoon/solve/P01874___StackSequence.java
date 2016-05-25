package baekjoon.solve;
import java.util.LinkedList;
import java.util.Scanner;

public class P01874___StackSequence {

	private static final Scanner sc = new Scanner(System.in);

	private static final String PUSH = "+\n";
	private static final String POP = "-\n";

	private void solve() {
		int n = sc.nextInt();
		LinkedList<Integer> stack = new LinkedList<>();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int i = 1;
		int j = 0;

		StringBuilder stringBuilder = new StringBuilder();
		while (j != n) {
			if (stack.isEmpty() || stack.getLast() < a[j]) {
				for (; a[j] >= i; i++) {
					stack.add(i);
					stringBuilder.append(PUSH);
				}
			} else if (stack.getLast() == a[j]) {
				stack.removeLast();
				stringBuilder.append(POP);
				j++;
			} else {
				System.out.println("NO");
				return;
			}
		}

		System.out.println(stringBuilder.toString());
	}

	public static void main(String[] args) {
		new P01874___StackSequence().solve();
	}
}
