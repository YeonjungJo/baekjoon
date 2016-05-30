import java.util.Scanner;

public class Main_A {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int[] power = new int[4];
			for (int i = 0; i < 4; i++) {
				power[i] = sc.nextInt();
			}
			int[] equip = new int[4];
			for (int i = 0; i < 4; i++) {
				equip[i] = sc.nextInt();
			}

			int hp = getHp(power[0] + equip[0]);
			int mp = getMp(power[1] + equip[1]);
			int ap = getAp(power[2] + equip[2]);
			int dp = getDp(power[3] + equip[3]);

			System.out.println(hp + mp + ap + dp);
		}
	}

	private int getDp(int i) {
		return i * 2;
	}

	private int getAp(int i) {
		return i < 0 ? 0 : 2 * i;
	}

	private int getMp(int i) {
		return i < 1 ? 5 : 5 * i;
	}

	private int getHp(int i) {
		return i < 1 ? 1 : i;
	}

	public static void main(String[] args) {
		new Main_A().solve();
	}
}
