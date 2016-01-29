package baekjoon.day20160117;
import java.util.Scanner;

public class p8320_rectangle {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = 0;

		for (int i = 1; i <= n; i++) {
			result += getFactor(i);
		}
		

		System.out.println(result);
	}

	private int getFactor(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				result++;
		}
		if(result <= 2) return 1;
		if (result % 2 == 0) return result / 2;
		return result/2 +1;
	}

	public static void main(String[] args) {
		new p8320_rectangle().solve();
	}
}
