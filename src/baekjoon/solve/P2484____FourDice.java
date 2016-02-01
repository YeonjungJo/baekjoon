package baekjoon.solve;
import java.util.Scanner;

public class P2484____FourDice {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int k = sc.nextInt();
		int max = 0;
		for (int i = 0; i < k; i++) {
			int prize = 0;
			int[] input = new int[7];
			for (int j = 0; j < 4; j++) {
				input[sc.nextInt()]++;
			}

			int tmp = 0;
			int idx = 0;
			for (int j = 0; j < 7; j++) {
				if (input[j] == 4) {
					prize = 50000 + j * 5000;
					break;
				}
				if (input[j] == 3) {
					prize = 10000 + j * 1000;
					break;
				}
				if (input[j] == 2) {
					if (tmp == 0) tmp += j;
					else prize = (tmp + j) * 500 + 2000;
				}
				if (input[j] == 1) idx = j;
			}

			if (prize == 0) {
				if (tmp > 0 && tmp < 2000) prize = 1000 + tmp * 100;
				else {
					prize = idx * 100;
				}
			}

			max = max > prize ? max : prize;
		}

		System.out.println(max);
	}

	public static void main(String[] args) {
		new P2484____FourDice().solve();
	}
}
