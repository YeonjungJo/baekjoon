package baekjoon.day20160112;
import java.util.Arrays;
import java.util.Scanner;

public class p1427_sortInside {

	private void init() {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		Arrays.sort(s);
		for (int i = s.length - 1; i >= 0; i--) {
			System.out.print(s[i]);
		}
	}

	public static void main(String[] args) {
		new p1427_sortInside().init();
	}
}