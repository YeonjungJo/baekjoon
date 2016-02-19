package baekjoon.solve;
import java.util.Scanner;

public class P02511___CardGame {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[] a = new int[10];
		int[] b = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			b[i] = sc.nextInt();
		}

		int scoreA = 0;
		int scoreB = 0;
		String lastWinner = null;

		for (int i = 0; i < 10; i++) {
			if (a[i] > b[i]) {
				scoreA += 3;
				lastWinner = "A";
			}
			if (a[i] < b[i]) {
				scoreB += 3;
				lastWinner = "B";
			}
			if (a[i] == b[i]) {
				scoreA++;
				scoreB++;
			}
		}

		System.out.printf("%d %d\n", scoreA, scoreB);
		if (scoreA != scoreB) System.out.println(scoreA > scoreB ? "A" : "B");
		else System.out.println(lastWinner != null ? lastWinner : "D");
		
	}

	public static void main(String[] args) {
		new P02511___CardGame().solve();
	}
}
