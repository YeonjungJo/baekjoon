package baekjoon.solve;
import java.util.LinkedList;
import java.util.Scanner;

public class P02526___Cycle {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int p = sc.nextInt();

		boolean[] a = new boolean[1001];
		LinkedList<Integer> sequence = new LinkedList<>();

		a[n] = true;
		sequence.add(n);

		int tmp = n;

		while (true) {
			tmp = (tmp * n) % p;
			if (a[tmp]) {
				printResult(sequence, tmp);
				return;
			}
			sequence.add(tmp);
			a[tmp] = true;
		}
	}

	private void printResult(LinkedList<Integer> sequence, int n) {
		for (int i = 0; i < sequence.size(); i++) {
			 if (sequence.get(i) == n) {
			 System.out.println(sequence.size() - i);
			 return;
			 }
		}
	}

	public static void main(String[] args) {
		new P02526___Cycle().solve();
	}
}
