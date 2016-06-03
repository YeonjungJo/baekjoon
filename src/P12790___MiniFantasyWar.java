import java.util.Scanner;

public class P12790___MiniFantasyWar {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int[] power = new int[4];
			for (int i = 0; i < 4; i++) {
				power[i] = sc.nextInt();
			}
			for (int i = 0; i < 4; i++) {
				power[i] += sc.nextInt();
			}

			if (power[0] < 1) power[0] = 1;
			if (power[1] < 1) power[1] = 1;
			if (power[2] < 0) power[2] = 0;

			System.out.println(power[0] + 5 * power[1] + 2 * power[2] + 2 * power[3]);
		}
	}

	public static void main(String[] args) {
		new P12790___MiniFantasyWar().solve();
	}
}
