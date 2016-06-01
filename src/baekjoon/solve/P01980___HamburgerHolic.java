package baekjoon.solve;
import java.util.Scanner;

public class P01980___HamburgerHolic {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();

		int max = n > m ? n : m;
		int min = m > n ? n : m;

		int cntA = t / max;
		int cntB = (t - cntA * max) / min;
		int coke = getRemainTime(t, max, cntA, min, cntB);

		for (int i = cntA; i >= 0; i--) {
			int tmp = getRemainTime(t, max, i, min, (t - i * max) / min);
			if (tmp < coke) {
				coke = tmp;
				cntA = i;
				cntB = (t - i * max) / min;
			} else if (tmp == coke) {
				if (cntA + cntB < i + (t - i * max) / min) {
					cntA = i;
					cntB = (t - i * max) / min;
				}
			}
		}

		System.out.printf("%d %d", cntA + cntB, coke);
	}

	private int getRemainTime(int t, int max, int cntA, int min, int cntB) {
		return t - max * cntA - min * cntB;
	}

	public static void main(String[] args) {
		new P01980___HamburgerHolic().solve();
	}
}
