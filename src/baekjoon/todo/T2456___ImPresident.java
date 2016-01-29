package baekjoon.todo;
import java.util.Scanner;

public class T2456___ImPresident {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] score = new int[3][4];

		for (int student = 0; student < n; student++) {
			for (int j = 0; j < 3; j++) {
				int k = sc.nextInt();
				score[j][k]++;
				score[j][0] += k;
			}
		}

		int winner = 0;
		boolean rep = false;

		for (int i = 1; i < 3; i++) {
			if (score[i][0] > score[winner][0]) {
				rep = false;
				winner = i;
				score[winner][0] = score[i][0];
			}
			if (score[i][0] == score[winner][0]) {
				if (score[i][3] > score[winner][3]) {
					rep = false;
					winner = i;
				} else if (score[i][3] == score[winner][3]) {
					if (score[i][2] > score[winner][2]) {
						rep = false;
						winner = i;
					} else if (score[i][2] == score[winner][2]) {
						rep = true;
					}
				}
			}
		}

		if (rep) {
			System.out.println(0 + " " + score[winner][0]);
		} else {
			System.out.println(winner + 1 + " " + score[winner][0]);
		}
	}

	public static void main(String[] args) {
		new T2456___ImPresident().solve();
	}
}
