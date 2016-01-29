package baekjoon.todo;
import java.util.Scanner;

public class T2896 {

	private int[] have = new int[3];
	private int[] need = new int[3];

	private void solve() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < have.length; i++) {
			have[i] = sc.nextInt();
		}
		for (int i = 0; i < need.length; i++) {
			need[i] = sc.nextInt();
		}

		double min = (have[0] / need[0]);

		for (int i = 1; i < have.length; i++) {
			min = (have[i] / need[i]) < min ? (have[i] / need[i]) : min;
		}

		for (int i = 0; i < have.length; i++) {
			System.out.print(have[i] - need[i] * min + " ");
		}
	}

	public static void main(String[] args) {
		new T2896().solve();
	}
}
