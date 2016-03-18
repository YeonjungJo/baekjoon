package baekjoon.solve;
import java.util.Scanner;

public class P05597___DoNotSubmit {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		boolean[] student = new boolean[31];
		for (int i = 0; i < 28; i++) {
			student[sc.nextInt()] = true;
		}
		for (int i = 1; i < 31; i++) {
			if (!student[i]) System.out.println(i);
		}
	}

	public static void main(String[] args) {
		new P05597___DoNotSubmit().solve();
	}
}
