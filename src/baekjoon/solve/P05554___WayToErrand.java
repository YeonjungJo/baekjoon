package baekjoon.solve;
import java.util.Scanner;

public class P05554___WayToErrand {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int second = 0;
		for (int i = 0; i < 4; i++) {
			second += sc.nextInt();
		}
		
		System.out.println(second / 60);
		System.out.println(second % 60);
	}

	public static void main(String[] args) {
		new P05554___WayToErrand().solve();
	}
}
