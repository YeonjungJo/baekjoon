package baekjoon.solve;
import java.util.Scanner;

public class P02502___TigerAndCake {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int d = sc.nextInt();
		int k = sc.nextInt();

		int[] factor = getFactor(d);

		int x = factor[0];
		int y = factor[1];

		for (int i = 0; i <= k / x; i++) {
			int j = (k - (x * i)) / y;
			
			if (x * i + y * j == k) {
				System.out.println(i);
				System.out.println(j);
				return;
			}
		}
	}

	private int[] getFactor(int d) {
		int[] result = new int[2];
		d = d - 2;

		int tmp[] = new int[d + 1];
		tmp[0] = 1;
		tmp[1] = 1;

		for (int i = 2; i <= d; i++) {
			tmp[i] = tmp[i - 1] + tmp[i - 2];
		}

		result[0] = tmp[d - 1];
		result[1] = tmp[d];
		return result;
	}

	public static void main(String[] args) {
		new P02502___TigerAndCake().solve();
	}
}
