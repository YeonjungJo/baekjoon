package baekjoon.day20160122;
import java.util.Scanner;

public class P2884___Alarm {

	private void solve() {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt() * 60 + sc.nextInt() - 45;
		if (i < 0) i += 1440;

		System.out.println(i / 60 + " " + i % 60);
	}

	public static void main(String[] args) {
		new P2884___Alarm().solve();
	}
}
