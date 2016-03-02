import java.util.Scanner;

public class P02512___Budget {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] budget = new int[n];

		int left = 0;
		int right = 0;

		for (int i = 0; i < n; i++) {
			budget[i] = sc.nextInt();
			if (right < budget[i]) right = budget[i];
		}
		int t = sc.nextInt();

		if (assign(budget, right, t)) {
			System.out.println(right);
			return;
		}

		while (true) {
			int r = (left + right) / 2;
			if (!assign(budget, r, t)) {
				right = r;
			} else if (!assign(budget, r + 1, t)) {
				System.out.println(r);
				return;
			} else {
				left = r;
			}
		}

	}

	private boolean assign(int[] budget, int n, int t) {
		int result = 0;
		for (int i = 0; i < budget.length; i++) {
			if (budget[i] < n) result += budget[i];
			else result += n;
			if (result > t) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new P02512___Budget().solve();
	}
}
