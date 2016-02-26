package baekjoon.solve;
import java.util.Scanner;

public class P03034___AngryChangYoung {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int a = (int) Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));

		int max = w > h ? w > a ? w : a : h > a ? h : a;

		for (int i = 0; i < n; i++) {
			if (sc.nextInt() > max) System.out.println("NE");
			else System.out.println("DA");
		}
	}

	public static void main(String[] args) {
		new P03034___AngryChangYoung().solve();
	}
}
