package baekjoon.solve;
import java.util.Scanner;

public class P03052___Remainder {

	private static final Scanner sc = new Scanner(System.in);

	private boolean[] remainder = new boolean[42];

	private void solve() {
		for (int i = 0; i < 10; i++) {
			remainder[sc.nextInt() % 42] = true;
		}
		
		int diff = 0;

		for (int i = 0; i < 42; i++) {
			if(remainder[i]) diff++;
		}
		
		System.out.println(diff);
	}

	public static void main(String[] args) {
		new P03052___Remainder().solve();
	}
}
