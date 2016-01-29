package baekjoon.day20160112;
import java.util.Scanner;

public class p1193_findFraction {

	private void init() {
		Scanner sc = new Scanner(System.in);
		int goal = sc.nextInt();

		int i = 1;
		for (; goal > i; i++) {
			goal -= i;
		}
		if (i % 2 == 0) {
			System.out.println((goal) + "/" + (i - goal + 1));
		} else {
			System.out.println((i + 1 - goal) + "/" + (goal));
		}
	}

	public static void main(String[] args) {
		new p1193_findFraction().init();
	}
}