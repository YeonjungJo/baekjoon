package baekjoon.solve;
import java.util.Scanner;

public class P02852___NBABasketball {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int totalTime = 48 * 60;

		int n = sc.nextInt();

		int score[] = new int[3];
		int winTime[] = new int[3];

		int winner = 0;
		int tmpTime = 0;

		for (int i = 0; i < n; i++) {
			int scorer = sc.nextInt();
			String[] sTime = sc.next().split(":");
			int scoreTime = 60 * Integer.parseInt(sTime[0]) + Integer.parseInt(sTime[1]);

			score[scorer]++;
			winTime[winner] += scoreTime - tmpTime;
			if (score[1] > score[2]) winner = 1;
			else if (score[1] < score[2]) winner = 2;
			else winner = 0;
			tmpTime = scoreTime;
		}

		winTime[winner] += totalTime - tmpTime;

		System.out.println(String.format("%02d:%02d", winTime[1] / 60, (winTime[1] - 60 * (winTime[1] / 60))));
		System.out.println(String.format("%02d:%02d", winTime[2] / 60, (winTime[2] - 60 * (winTime[2] / 60))));
	}

	public static void main(String[] args) {
		new P02852___NBABasketball().solve();
	}
}
