package baekjoon.solve;
import java.util.Scanner;

public class P04493___RockScissorPaper {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int[] win = new int[2];
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				String a = sc.next();
				String b = sc.next();
				if (a.equals("R") && b.equals("S")) win[0]++;
				if (a.equals("P") && b.equals("R")) win[0]++;
				if (a.equals("S") && b.equals("P")) win[0]++;
				if (b.equals("R") && a.equals("S")) win[1]++;
				if (b.equals("P") && a.equals("R")) win[1]++;
				if (b.equals("S") && a.equals("P")) win[1]++;
			}
			
			if (win[0] > win[1]) System.out.println("Player 1");
			if (win[0] == win[1]) System.out.println("TIE");
			if (win[0] < win[1]) System.out.println("Player 2");
		}
	}

	public static void main(String[] args) {
		new P04493___RockScissorPaper().solve();
	}
}
