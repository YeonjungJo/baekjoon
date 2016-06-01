import java.util.Scanner;

public class T01027___Building {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] building = new int[n];
		for (int i = 0; i < n; i++) {
			building[i] = sc.nextInt();
		}

		int max = 0;
		int[] view = new int[n];
		for (int i = 0; i < n - 1; i++) {
			int k = i + 1;
			for (int j = i + 1; j < n; j++) {
				if (j == i + 1) {
					view[i]++;
					view[j]++;
				} else {
					if ((j - i) * (building[k] - building[i]) < (k - i) * (building[j] - building[i])) {
						view[i]++;
						view[j]++;
						k = j;
					}
				}
			}
			if (view[i] > max) {
				max = view[i];
			}
		}

		System.out.println(max);
	}

	public static void main(String[] args) {
		new T01027___Building().solve();
	}
}
