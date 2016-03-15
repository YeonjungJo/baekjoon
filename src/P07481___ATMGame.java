import java.util.Scanner;

public class P07481___ATMGame {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			search(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
	}

	private void search(int a, int b, int s) {
		int max = a > b ? a : b;
		int min = a > b ? b : a;
		for (int i = s / max; i >= 0; i--) {
			if ((s - max * i) % min == 0) {
				if (a > b) System.out.println(i + " " + (s - max * i) / min);
				else System.out.println((s - max * i) / min + " " + i);
				return;
			}
		}
		System.out.println("Impossible");
	}

	public static void main(String[] args) {
		new P07481___ATMGame().solve();
	}
}
