package baekjoon.day20160112;
import java.util.Scanner;

public class Escape_1085 {

	private void init() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		x = w - x > x ? x : w - x;
		y = h - y > y ? y : h - y;
		System.out.println(x > y ? y : x);
	}

	public static void main(String[] args) {
		new Escape_1085().init();
	}
}