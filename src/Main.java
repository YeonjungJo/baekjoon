import java.util.Scanner;

public class Main {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[] data = new int[5];
		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int[] tmp = new int[m];
			for (int j = 0; j < 4; j++) {
				sc.next();
				String[] s = sc.next().trim().split("#");
				for (int k = 1; k <= m; k++) {
					if (s[k].equals("****")) tmp[k] = j;
				}
			}
			for (int j = 0; j < tmp.length; j++) {
				System.out.print(tmp[j] + " ");
			}
		}
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}
