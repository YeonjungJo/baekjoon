package baekjoon.solve;
import java.math.BigInteger;
import java.util.Scanner;

public class P02547___CandyTeacher {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();
			int remain = 0;
			for (int i = 0; i < n; i++) {
				remain += new BigInteger(sc.next()).mod(BigInteger.valueOf(n)).intValue();
				remain %= n;
			}
			if(remain == 0) System.out.println("YES");
			else System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		new P02547___CandyTeacher().solve();
	}
}
