package baekjoon.solve;
import java.util.Scanner;

public class P04084___VivalaDiferencia {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			int[] d = new int[4];
			for (int i = 0; i < 4; i++) {
				d[i] = sc.nextInt();
			}

			if (d[0] == d[1] && d[0] == d[2] && d[0] == d[3] && d[0] == 0) return;

			int cnt = 0;
			while (!(d[0] == d[1] && d[0] == d[2] && d[0] == d[3])) {
				int tmp = d[0];
				d[0] = Math.abs(d[0] - d[1]);
				d[1] = Math.abs(d[1] - d[2]);
				d[2] = Math.abs(d[2] - d[3]);
				d[3] = Math.abs(d[3] - tmp);
				cnt++;
			}
			System.out.println(cnt);
		}
	}

	public static void main(String[] args) {
		new P04084___VivalaDiferencia().solve();
	}
}
