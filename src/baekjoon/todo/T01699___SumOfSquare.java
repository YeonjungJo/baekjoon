package baekjoon.todo;
import java.util.Scanner;

public class T01699___SumOfSquare {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] d = new int[n + 1];
		System.out.println(search(d, n));
	}

	private int search(int[] d, int n) {
		if ((int) Math.sqrt(n) == Math.sqrt(n)) return d[n] = 1;
		if (d[n] != 0) return d[n];
		
		System.out.println(n);

		int min = Integer.MAX_VALUE;
		for (int i = n / 2; i > 0; i--) {
			int tmp = search(d, i) + search(d, n - i);
			min = tmp > min ? min : tmp;
			if(min == 2) return d[n] = min;
		}
		return d[n] = min;
	}

	public static void main(String[] args) {
		new T01699___SumOfSquare().solve();
	}
}
