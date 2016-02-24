package baekjoon.todo;
import java.util.Scanner;

public class T02896___Cocktail {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[] bought = new int[3];
		int[] proportion = new int[3];

		for (int i = 0; i < 3; i++)
			bought[i] = sc.nextInt();
		for (int i = 0; i < 3; i++)
			proportion[i] = sc.nextInt();

		double min = 500;
		for (int i = 0; i < 3; i++) {
			double tmp = bought[i] / proportion[i];
			min = min > tmp ? tmp : min;
		}

		for (int i = 0; i < 3; i++) {
			System.out.print(bought[i] - (min * proportion[i]) + " ");
		}
	}

	public static void main(String[] args) {
		new T02896___Cocktail().solve();
	}
}
