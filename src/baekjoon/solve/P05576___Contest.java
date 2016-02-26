package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P05576___Contest {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[] w = new int[10];
		int[] k = new int[10];
		for (int i = 0; i < 10; i++) {
			w[i] = sc.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			k[i] = sc.nextInt();
		}
		Arrays.sort(w);
		Arrays.sort(k);

		int wp = 0;
		int kp = 0;
		for (int i = 9; i > 6; i--) {
			wp += w[i];
			kp += k[i];
		}
		System.out.printf("%d %d", wp, kp);
	}

	public static void main(String[] args) {
		new P05576___Contest().solve();
	}
}
