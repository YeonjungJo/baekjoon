package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P01654___CuttingLanCable {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int k = sc.nextInt();
		int n = sc.nextInt();

		int[] lan = new int[k];
		int max = 0;
		BigInteger sum = BigInteger.ZERO;
		for (int i = 0; i < k; i++) {
			lan[i] = sc.nextInt();
			sum = sum.add(BigInteger.valueOf(lan[i]));
			if (max < lan[i]) max = lan[i];
		}
		sum = sum.divide(BigInteger.valueOf(n));
		int l = sum.compareTo(BigInteger.valueOf(max)) == 1 ? max : sum.intValue();

		int left = 0;
		int right = l;

		while (true) {
			if (getCable(lan, l, n)) {
				if (!getCable(lan, l + 1, n)) {
					System.out.println(l);
					return;
				} else {
					left = l;
					l = (l + right) / 2;
					continue;
				}
			} else {
				right = l;
				l = (left + l) / 2;
				continue;
			}
		}
	}

	private boolean getCable(int[] lan, int l, int n) {
		int count = 0;
		for (int i = 0; i < lan.length; i++) {
			count += lan[i] / l;
			if (count >= n) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		new P01654___CuttingLanCable().solve();
	}
}
