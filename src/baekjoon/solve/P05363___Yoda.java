package baekjoon.solve;
import java.util.Scanner;

public class P05363___Yoda {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = Integer.parseInt(sc.nextLine());
		for (int t = 0; t < testcase; t++) {
			String[] sentence = sc.nextLine().split(" ");
			for (int i = 2; i < 2 + sentence.length; i++) {
				if (i < sentence.length) System.out.print(sentence[i] + " ");
				else System.out.print(sentence[i - sentence.length] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new P05363___Yoda().solve();
	}
}
