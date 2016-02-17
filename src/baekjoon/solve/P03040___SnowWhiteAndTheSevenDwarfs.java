package baekjoon.solve;
import java.util.Scanner;

public class P03040___SnowWhiteAndTheSevenDwarfs {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[] number = new int[9];
		int tmp = -100;
		for (int i = 0; i < 9; i++) {
			number[i] = sc.nextInt();
			tmp += number[i];
		}

		for (int i = 0; i < 9; i++) {
			for (int j = i; j < 9; j++) {
				if (number[i] + number[j] == tmp) {
					printResult(number, i, j);
					return;
				}
			}
		}
	}

	private void printResult(int[] number, int i, int j) {
		for (int n = 0; n < 9; n++) {
			if (n != i && n != j) System.out.println(number[n]);
		}
	}

	public static void main(String[] args) {
		new P03040___SnowWhiteAndTheSevenDwarfs().solve();
	}
}
