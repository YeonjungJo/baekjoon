package baekjoon.day20160127;
import java.util.Scanner;

public class P1075___Divide {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = sc.nextInt();

		for (int i = 0; i < 100; i++) {
			n = n - (n % 100) + i;
			if(n % f == 0){
				System.out.println(String.format("%02d", i));
				return;
			}
		}
	}

	public static void main(String[] args) {
		new P1075___Divide().solve();
	}
}
